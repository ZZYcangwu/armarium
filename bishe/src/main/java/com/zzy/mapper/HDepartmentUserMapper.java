package com.zzy.mapper;

import com.zzy.pojo.HDepartmentUser;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Filename: HDepartmentUserMapper
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/
@Mapper
public interface HDepartmentUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HDepartmentUser record);

    int insertOrUpdate(HDepartmentUser record);

    int insertOrUpdateSelective(HDepartmentUser record);

    int insertSelective(HDepartmentUser record);

    HDepartmentUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HDepartmentUser record);

    int updateByPrimaryKey(HDepartmentUser record);

    int updateBatch(List<HDepartmentUser> list);

    int updateBatchSelective(List<HDepartmentUser> list);

    int batchInsert(@Param("list") List<HDepartmentUser> list);
}