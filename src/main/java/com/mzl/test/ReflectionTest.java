package com.mzl.test;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName： ReflectionTest
 * @Description： 反射
 * @author：lhg
 * @data：2021/1/11 16:53
 * @Version：1.0
 **/
public class ReflectionTest {
    public static void main(String[] args) {
        Project project = new Project();
        project.setProjectCode("6432c480-03ce-4c62-8ec7-164476bb57a3");
        project.setProjectName("测试项目-修改");
        project.setProjectAddress("北京市东城区");
        project.setRegisteredCapital(BigDecimal.TEN);
        project.setCreateDate(new Date());

        ProjectLog projectLog = new ProjectLog();
        projectLog.setProjectLogId(1L);
        projectLog.setProjectLogCode("09db6935-7cc8-45bd-a3ce-d26cb7916b30");
        projectLog.setProjectCode("6432c480-03ce-4c62-8ec7-164476bb57a3");
        projectLog.setProjectName("测试项目");
        projectLog.setProjectAddress("北京市");
        projectLog.setRegisteredCapital(BigDecimal.ONE);
        projectLog.setCreateDate(new Date());

        objectAction(projectLog, project);
        System.out.println(projectLog);
        System.out.println(project);
    }

    public static void objectAction(Object projectLog, Object project) {
        Class<? extends Object> projectLogClass = projectLog.getClass();
        Class<? extends Object> projectClass = project.getClass();

        Field[] projectFields = projectClass.getDeclaredFields();
        Field[] projectLogFields = projectLogClass.getDeclaredFields();

        // 遍历字段
        for (Field field : projectLogFields) {
            field.setAccessible(true);
            Arrays.stream(projectFields).forEach(field1 -> System.out.println(field1.getName()));
            boolean isFind = Arrays.stream(projectFields).filter(field1 -> field1.getName().equals(field.getName())).findAny().isPresent();
            if (isFind) {
                Field field2 = Arrays.stream(projectFields).filter(field1 -> field1.getName().equals(field.getName())).findAny().get();
                field2.setAccessible(true);
                Object o = null;
                try {
                    o = field2.get(project);
                    field.set(projectLog, o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
