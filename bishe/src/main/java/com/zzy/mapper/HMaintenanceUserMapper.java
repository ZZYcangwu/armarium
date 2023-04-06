package com.zzy.mapper;

import com.zzy.pojo.HMaintenanceUser;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HMaintenanceUserMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HMaintenanceUserMapper {
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

    int batchInsert(@Param("list") List<HMaintenanceUser> list);
}