package com.zzy.mapper;

import com.zzy.pojo.HNotice;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HNoticeMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HNoticeMapper {
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

    int batchInsert(@Param("list") List<HNotice> list);
}