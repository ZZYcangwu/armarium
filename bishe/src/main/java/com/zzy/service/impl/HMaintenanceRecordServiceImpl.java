package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.zzy.mapper.HMaintenanceRecordMapper;
import com.zzy.pojo.HMaintenanceRecord;
import com.zzy.service.HMaintenanceRecordService;
/**
 * @Filename: HMaintenanceRecordServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HMaintenanceRecordServiceImpl implements HMaintenanceRecordService{

    @Resource
    private HMaintenanceRecordMapper hMaintenanceRecordMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hMaintenanceRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HMaintenanceRecord record) {
        return hMaintenanceRecordMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HMaintenanceRecord record) {
        return hMaintenanceRecordMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HMaintenanceRecord record) {
        return hMaintenanceRecordMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HMaintenanceRecord record) {
        return hMaintenanceRecordMapper.insertSelective(record);
    }

    @Override
    public HMaintenanceRecord selectByPrimaryKey(Integer id) {
        return hMaintenanceRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HMaintenanceRecord record) {
        return hMaintenanceRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HMaintenanceRecord record) {
        return hMaintenanceRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HMaintenanceRecord> list) {
        return hMaintenanceRecordMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HMaintenanceRecord> list) {
        return hMaintenanceRecordMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HMaintenanceRecord> list) {
        return hMaintenanceRecordMapper.batchInsert(list);
    }

}
