package com.mzl.test;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName： ProjectLog
 * @Description：
 * @author：lhg
 * @data：2021/1/11 16:59
 * @Version：1.0
 **/
@Data
public class ProjectLog {
    private Long projectLogId;
    private String projectLogCode;
    private String projectCode;
    private String projectName;
    private String projectAddress;
    private BigDecimal registeredCapital;
    private Date createDate;
}
