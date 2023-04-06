package com.zzy.pojo;

import java.util.Date;
import lombok.Data;

/**
 * @Filename: HBorrowApplication
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Data
public class HBorrowApplication {
    private Integer id;

    private Integer departmentId;

    private String reason;

    private String type;

    private Date createTime;

    private Integer statusId;

    private String explain;
}