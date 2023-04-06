package com.zzy.service;

import com.zzy.pojo.HApplicationStatus;
import java.util.List;
    /**
 * @Filename: HApplicationStatusService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HApplicationStatusService{


    int deleteByPrimaryKey(Integer id);

    int insert(HApplicationStatus record);

    int insertOrUpdate(HApplicationStatus record);

    int insertOrUpdateSelective(HApplicationStatus record);

    int insertSelective(HApplicationStatus record);

    HApplicationStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HApplicationStatus record);

    int updateByPrimaryKey(HApplicationStatus record);

    int updateBatch(List<HApplicationStatus> list);

    int updateBatchSelective(List<HApplicationStatus> list);

    int batchInsert(List<HApplicationStatus> list);

}
