package com.zzy.service;

import java.util.List;
import com.zzy.pojo.HBorrowApplication;
    /**
 * @Filename: HBorrowApplicationService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HBorrowApplicationService{


    int deleteByPrimaryKey(Integer id);

    int insert(HBorrowApplication record);

    int insertOrUpdate(HBorrowApplication record);

    int insertOrUpdateSelective(HBorrowApplication record);

    int insertSelective(HBorrowApplication record);

    HBorrowApplication selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HBorrowApplication record);

    int updateByPrimaryKey(HBorrowApplication record);

    int updateBatch(List<HBorrowApplication> list);

    int updateBatchSelective(List<HBorrowApplication> list);

    int batchInsert(List<HBorrowApplication> list);

}
