package com.mzl.test;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName： Project
 * @Description：
 * @author：lhg
 * @data：2021/1/11 16:58
 * @Version：1.0
 **/
@Data
public class Project {
    private Long projectId;
    private String projectCode;
    private String projectName;
    private String projectAddress;
    private BigDecimal registeredCapital;
    private Date createDate;
}
