package com.hyron.atsdemo.pojo;


import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    @Excel(name = "工号")
    private String jobId;
    @Excel(name = "部门")
    private String depId;
    private String projectId;
    @Excel(name = "姓名")
    private String empName;
    private char sex;
    private Timestamp birthdayDatetime;
    private Date leaveSchoolTime;
    private String school;
    private Timestamp joinTime;
    private char onJobFlag;
    private Timestamp leaveTime;
    private Blob empImg;
    private Timestamp loginDatetime;
    private String loginUser;
    private Timestamp updateDatetime;
    private String updateUser;
}
