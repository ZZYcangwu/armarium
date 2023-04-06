package com.zzy.service;

import java.util.List;
import com.zzy.pojo.HStatus;
    /**
 * @Filename: HStatusService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HStatusService{


    int deleteByPrimaryKey(Integer id);

    int insert(HStatus record);

    int insertOrUpdate(HStatus record);

    int insertOrUpdateSelective(HStatus record);

    int insertSelective(HStatus record);

    HStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HStatus record);

    int updateByPrimaryKey(HStatus record);

    int updateBatch(List<HStatus> list);

    int updateBatchSelective(List<HStatus> list);

    int batchInsert(List<HStatus> list);

        List<HStatus> selectAll();

    }
