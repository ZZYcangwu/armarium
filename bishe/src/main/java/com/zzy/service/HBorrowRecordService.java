package com.zzy.service;

import java.util.List;
import com.zzy.pojo.HBorrowRecord;
    /**
 * @Filename: HBorrowRecordService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HBorrowRecordService{


    int deleteByPrimaryKey(Integer id);

    int insert(HBorrowRecord record);

    int insertOrUpdate(HBorrowRecord record);

    int insertOrUpdateSelective(HBorrowRecord record);

    int insertSelective(HBorrowRecord record);

    HBorrowRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HBorrowRecord record);

    int updateByPrimaryKey(HBorrowRecord record);

    int updateBatch(List<HBorrowRecord> list);

    int updateBatchSelective(List<HBorrowRecord> list);

    int batchInsert(List<HBorrowRecord> list);

}
