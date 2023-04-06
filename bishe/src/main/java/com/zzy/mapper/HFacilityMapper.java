package com.zzy.mapper;

import com.zzy.pojo.HFacility;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HFacilityMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HFacilityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HFacility record);

    int insertOrUpdate(HFacility record);

    int insertOrUpdateSelective(HFacility record);

    int insertSelective(HFacility record);

    HFacility selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HFacility record);

    int updateByPrimaryKey(HFacility record);

    int updateBatch(List<HFacility> list);

    int updateBatchSelective(List<HFacility> list);

    int batchInsert(@Param("list") List<HFacility> list);

    List<HFacility> selectAll(Map param);
}