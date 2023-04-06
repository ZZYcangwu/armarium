package com.zzy.mapper;

import com.zzy.pojo.HApplicationStatus;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HApplicationStatusMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HApplicationStatusMapper {
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

    int batchInsert(@Param("list") List<HApplicationStatus> list);
}