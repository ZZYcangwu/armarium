package com.zzy.pojo;

import java.util.Date;
import lombok.Data;

/**
 * @Filename: HMaintenanceUser
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Data
public class HMaintenanceUser {
    private Integer id;

    private String username;

    private String password;

    private String name;

    private String email;

    private String phone;

    private Date createTime;

    private Date updateTime;
}