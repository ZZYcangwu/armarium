package com.zzy.mapper;

import com.zzy.pojo.HBorrowRecord;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HBorrowRecordMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HBorrowRecordMapper {
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

    int batchInsert(@Param("list") List<HBorrowRecord> list);
}