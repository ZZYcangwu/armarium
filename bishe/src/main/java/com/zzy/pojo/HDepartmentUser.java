package com.zzy.pojo;

import java.util.Date;
import lombok.Data;

/**
 * @Filename: HDepartmentUser
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Data
public class HDepartmentUser {
    private Integer id;

    private String username;

    private String password;

    private String name;

    private String email;

    private String phone;

    private Integer departmentId;

    private Date createTime;

    private Date updateTime;
}