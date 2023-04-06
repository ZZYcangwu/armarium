package com.zzy.mapper;

import com.zzy.pojo.HStatus;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HStatusMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HStatusMapper {
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

    int batchInsert(@Param("list") List<HStatus> list);

    List<HStatus> selectAll();

}