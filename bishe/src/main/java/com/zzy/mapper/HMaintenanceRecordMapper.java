package com.zzy.mapper;

import com.zzy.pojo.HMaintenanceRecord;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HMaintenanceRecordMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HMaintenanceRecordMapper {
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

    int batchInsert(@Param("list") List<HMaintenanceRecord> list);
}