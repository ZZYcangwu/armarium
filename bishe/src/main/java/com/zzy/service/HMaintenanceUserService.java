package com.zzy.service;

import java.util.List;
import com.zzy.pojo.HMaintenanceUser;
    /**
 * @Filename: HMaintenanceUserService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HMaintenanceUserService{


    int deleteByPrimaryKey(Integer id);

    int insert(HMaintenanceUser record);

    int insertOrUpdate(HMaintenanceUser record);

    int insertOrUpdateSelective(HMaintenanceUser record);

    int insertSelective(HMaintenanceUser record);

    HMaintenanceUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HMaintenanceUser record);

    int updateByPrimaryKey(HMaintenanceUser record);

    int updateBatch(List<HMaintenanceUser> list);

    int updateBatchSelective(List<HMaintenanceUser> list);

    int batchInsert(List<HMaintenanceUser> list);

}
