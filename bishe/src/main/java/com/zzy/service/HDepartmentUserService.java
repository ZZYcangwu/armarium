package com.zzy.service;

import java.util.List;
import com.zzy.pojo.HDepartmentUser;
    /**
 * @Filename: HDepartmentUserService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HDepartmentUserService{


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

    int batchInsert(List<HDepartmentUser> list);

}
