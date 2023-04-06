package com.zzy.service;

import java.util.List;
import com.zzy.pojo.HNotice;
    /**
 * @Filename: HNoticeService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HNoticeService{


    int deleteByPrimaryKey(Integer id);

    int insert(HNotice record);

    int insertOrUpdate(HNotice record);

    int insertOrUpdateSelective(HNotice record);

    int insertSelective(HNotice record);

    HNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HNotice record);

    int updateByPrimaryKey(HNotice record);

    int updateBatch(List<HNotice> list);

    int updateBatchSelective(List<HNotice> list);

    int batchInsert(List<HNotice> list);

}
