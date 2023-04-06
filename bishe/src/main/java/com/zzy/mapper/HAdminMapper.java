package com.zzy.mapper;

import com.zzy.pojo.HAdmin;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HAdminMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HAdmin record);

    int insertOrUpdate(HAdmin record);

    int insertOrUpdateSelective(HAdmin record);

    int insertSelective(HAdmin record);

    HAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HAdmin record);

    int updateByPrimaryKey(HAdmin record);

    int updateBatch(List<HAdmin> list);

    int updateBatchSelective(List<HAdmin> list);

    int batchInsert(@Param("list") List<HAdmin> list);
}