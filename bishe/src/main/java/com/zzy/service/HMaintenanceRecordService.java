package com.zzy.service;

import java.util.List;
import com.zzy.pojo.HMaintenanceRecord;
    /**
 * @Filename: HMaintenanceRecordService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HMaintenanceRecordService{


    int deleteByPrimaryKey(Integer id);

    int insert(HMaintenanceRecord record);

    int insertOrUpdate(HMaintenanceRecord record);

    int insertOrUpdateSelective(HMaintenanceRecord record);

    int insertSelective(HMaintenanceRecord record);

    HMaintenanceRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HMaintenanceRecord record);

    int updateByPrimaryKey(HMaintenanceRecord record);

    int updateBatch(List<HMaintenanceRecord> list);

    int updateBatchSelective(List<HMaintenanceRecord> list);

    int batchInsert(List<HMaintenanceRecord> list);

}
