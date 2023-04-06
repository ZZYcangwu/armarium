package com.zzy.service;

import com.zzy.entity.Result;
import com.zzy.pojo.HFacility;
import java.util.List;
import java.util.Map;

/**
 * @Filename: HFacilityService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HFacilityService{


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

    int batchInsert(List<HFacility> list);

    Result selectAll(Map param);


    }
