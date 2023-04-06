package com.zzy.service;

import java.util.List;
import java.util.Map;

import com.zzy.entity.Result;
import com.zzy.pojo.HFacilityType;
    /**
 * @Filename: HFacilityTypeService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HFacilityTypeService{


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

    int batchInsert(List<HFacilityType> list);

        List<HFacilityType> selectAll();

        Result selectByPage(Map param);
    }
