package com.zzy.mapper;

import com.zzy.pojo.HMaintenanceStatus;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HMaintenanceStatusMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HMaintenanceStatusMapper {
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

    int batchInsert(@Param("list") List<HMaintenanceStatus> list);
}