package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.zzy.mapper.HBorrowRecordMapper;
import com.zzy.pojo.HBorrowRecord;
import com.zzy.service.HBorrowRecordService;
/**
 * @Filename: HBorrowRecordServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HBorrowRecordServiceImpl implements HBorrowRecordService{

    @Resource
    private HBorrowRecordMapper hBorrowRecordMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hBorrowRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HBorrowRecord record) {
        return hBorrowRecordMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HBorrowRecord record) {
        return hBorrowRecordMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HBorrowRecord record) {
        return hBorrowRecordMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HBorrowRecord record) {
        return hBorrowRecordMapper.insertSelective(record);
    }

    @Override
    public HBorrowRecord selectByPrimaryKey(Integer id) {
        return hBorrowRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HBorrowRecord record) {
        return hBorrowRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HBorrowRecord record) {
        return hBorrowRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HBorrowRecord> list) {
        return hBorrowRecordMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HBorrowRecord> list) {
        return hBorrowRecordMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HBorrowRecord> list) {
        return hBorrowRecordMapper.batchInsert(list);
    }

}
