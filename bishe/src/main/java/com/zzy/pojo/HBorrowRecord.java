package com.zzy.pojo;

import java.util.Date;
import lombok.Data;

/**
 * @Filename: HBorrowRecord
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Data
public class HBorrowRecord {
    private Integer id;

    private Integer departmentId;

    private Integer facilityId;

    private Date createTime;

    private Date endTime;

    private String borrowStatus;
}