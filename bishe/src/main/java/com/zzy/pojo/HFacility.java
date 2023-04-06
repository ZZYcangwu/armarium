package com.zzy.pojo;

import java.util.Date;
import lombok.Data;

/**
 * @Filename: HFacility
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Data
public class HFacility {
    private Integer id;

    private String name;

    private Integer facilityTypeId;

    private HFacilityType hFacilityType;

    /**
    * 设备创建时间
    */
    private Date createTime;

    /**
    * 设备维修时间
    */
    private Date maintainTime;

    /**
    * 设备价格
    */
    private Double price;

    private Integer facilityDepartmentId;

    private Department department;

    private Integer facilityStatusId;

    private HStatus hStatus;
}