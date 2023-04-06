package com.zzy.service;

import java.util.List;
import com.zzy.pojo.HMaintenanceStatus;
    /**
 * @Filename: HMaintenanceStatusService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HMaintenanceStatusService{


    int deleteByPrimaryKey(Integer id);

    int insert(HMaintenanceStatus record);

    int insertOrUpdate(HMaintenanceStatus record);

    int insertOrUpdateSelective(HMaintenanceStatus record);

    int insertSelective(HMaintenanceStatus record);

    HMaintenanceStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HMaintenanceStatus record);

    int updateByPrimaryKey(HMaintenanceStatus record);

    int updateBatch(List<HMaintenanceStatus> list);

    int updateBatchSelective(List<HMaintenanceStatus> list);

    int batchInsert(List<HMaintenanceStatus> list);

}
