package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.zzy.pojo.HDepartmentUser;
import com.zzy.mapper.HDepartmentUserMapper;
import com.zzy.service.HDepartmentUserService;
/**
 * @Filename: HDepartmentUserServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HDepartmentUserServiceImpl implements HDepartmentUserService{

    @Resource
    private HDepartmentUserMapper hDepartmentUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hDepartmentUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HDepartmentUser record) {
        return hDepartmentUserMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HDepartmentUser record) {
        return hDepartmentUserMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HDepartmentUser record) {
        return hDepartmentUserMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HDepartmentUser record) {
        return hDepartmentUserMapper.insertSelective(record);
    }

    @Override
    public HDepartmentUser selectByPrimaryKey(Integer id) {
        return hDepartmentUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HDepartmentUser record) {
        return hDepartmentUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HDepartmentUser record) {
        return hDepartmentUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HDepartmentUser> list) {
        return hDepartmentUserMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HDepartmentUser> list) {
        return hDepartmentUserMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HDepartmentUser> list) {
        return hDepartmentUserMapper.batchInsert(list);
    }

}
