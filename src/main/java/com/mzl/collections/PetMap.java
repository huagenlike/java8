package com.mzl.collections;

import com.mzl.typeinfo.pets.*;
import java.util.*;

/**
 * @program: java8
 * @description:
 * @author: may
 * @create: 2020-12-06 12:03
 **/
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);
        // 如果此映射包含指定键的映射，则返回true 。
        // 更正式地讲，当且仅当此映射包含键k的映射时才返回true ，使得（key == null？k == null：key.equals（k）） 。 （最多可以有一个这样的映射。）
        System.out.println(petMap.containsKey("My Dog"));
        // 如果此映射将一个或多个键映射到指定值，则返回true 。
        // 更正式地讲，当且仅当此映射包含至少一个到值v的映射（值== null？v == null：value.equals（v））时，返回true 。 对于Map接口的大多数实现，此操作可能需要地图大小中的时间线性。
        System.out.println(petMap.containsValue(dog));
    }
}
