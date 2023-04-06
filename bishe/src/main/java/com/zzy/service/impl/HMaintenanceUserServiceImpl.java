package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.zzy.pojo.HMaintenanceUser;
import com.zzy.mapper.HMaintenanceUserMapper;
import com.zzy.service.HMaintenanceUserService;
/**
 * @Filename: HMaintenanceUserServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HMaintenanceUserServiceImpl implements HMaintenanceUserService{

    @Resource
    private HMaintenanceUserMapper hMaintenanceUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hMaintenanceUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HMaintenanceUser record) {
        return hMaintenanceUserMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HMaintenanceUser record) {
        return hMaintenanceUserMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HMaintenanceUser record) {
        return hMaintenanceUserMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HMaintenanceUser record) {
        return hMaintenanceUserMapper.insertSelective(record);
    }

    @Override
    public HMaintenanceUser selectByPrimaryKey(Integer id) {
        return hMaintenanceUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HMaintenanceUser record) {
        return hMaintenanceUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HMaintenanceUser record) {
        return hMaintenanceUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HMaintenanceUser> list) {
        return hMaintenanceUserMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HMaintenanceUser> list) {
        return hMaintenanceUserMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HMaintenanceUser> list) {
        return hMaintenanceUserMapper.batchInsert(list);
    }

}
