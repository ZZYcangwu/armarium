package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zzy.mapper.HBorrowApplicationMapper;
import java.util.List;
import com.zzy.pojo.HBorrowApplication;
import com.zzy.service.HBorrowApplicationService;
/**
 * @Filename: HBorrowApplicationServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HBorrowApplicationServiceImpl implements HBorrowApplicationService{

    @Resource
    private HBorrowApplicationMapper hBorrowApplicationMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hBorrowApplicationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HBorrowApplication record) {
        return hBorrowApplicationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HBorrowApplication record) {
        return hBorrowApplicationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HBorrowApplication record) {
        return hBorrowApplicationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HBorrowApplication record) {
        return hBorrowApplicationMapper.insertSelective(record);
    }

    @Override
    public HBorrowApplication selectByPrimaryKey(Integer id) {
        return hBorrowApplicationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HBorrowApplication record) {
        return hBorrowApplicationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HBorrowApplication record) {
        return hBorrowApplicationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HBorrowApplication> list) {
        return hBorrowApplicationMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HBorrowApplication> list) {
        return hBorrowApplicationMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HBorrowApplication> list) {
        return hBorrowApplicationMapper.batchInsert(list);
    }

}
