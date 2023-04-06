package com.zzy.mapper;

import com.zzy.pojo.HBorrowApplication;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HBorrowApplicationMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HBorrowApplicationMapper {
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

    int batchInsert(@Param("list") List<HBorrowApplication> list);
}