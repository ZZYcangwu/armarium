package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.zzy.pojo.HMaintenanceStatus;
import com.zzy.mapper.HMaintenanceStatusMapper;
import com.zzy.service.HMaintenanceStatusService;
/**
 * @Filename: HMaintenanceStatusServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HMaintenanceStatusServiceImpl implements HMaintenanceStatusService{

    @Resource
    private HMaintenanceStatusMapper hMaintenanceStatusMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hMaintenanceStatusMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HMaintenanceStatus record) {
        return hMaintenanceStatusMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HMaintenanceStatus record) {
        return hMaintenanceStatusMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HMaintenanceStatus record) {
        return hMaintenanceStatusMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HMaintenanceStatus record) {
        return hMaintenanceStatusMapper.insertSelective(record);
    }

    @Override
    public HMaintenanceStatus selectByPrimaryKey(Integer id) {
        return hMaintenanceStatusMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HMaintenanceStatus record) {
        return hMaintenanceStatusMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HMaintenanceStatus record) {
        return hMaintenanceStatusMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HMaintenanceStatus> list) {
        return hMaintenanceStatusMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HMaintenanceStatus> list) {
        return hMaintenanceStatusMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HMaintenanceStatus> list) {
        return hMaintenanceStatusMapper.batchInsert(list);
    }

}
