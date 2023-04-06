package com.zzy.mapper;

import com.zzy.pojo.HFacilityType;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HFacilityTypeMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HFacilityTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HFacilityType record);

    int insertOrUpdate(HFacilityType record);

    int insertOrUpdateSelective(HFacilityType record);

    int insertSelective(HFacilityType record);

    HFacilityType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HFacilityType record);

    int updateByPrimaryKey(HFacilityType record);

    int updateBatch(List<HFacilityType> list);

    int updateBatchSelective(List<HFacilityType> list);

    int batchInsert(@Param("list") List<HFacilityType> list);

    List<HFacilityType> selectAll();

    List<HFacilityType> selectByPage(Map param);
}