package com.zzy.pojo;

import java.util.Date;
import lombok.Data;

/**
 * @Filename: HAdmin
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Data
public class HAdmin {
    private Integer id;

    private String username;

    private String password;

    private String name;

    private Date createTime;

    private Date updateTime;

    private String email;

    private String phone;
}