package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zzy.pojo.HApplicationStatus;
import java.util.List;
import com.zzy.mapper.HApplicationStatusMapper;
import com.zzy.service.HApplicationStatusService;
/**
 * @Filename: HApplicationStatusServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HApplicationStatusServiceImpl implements HApplicationStatusService{

    @Resource
    private HApplicationStatusMapper hApplicationStatusMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hApplicationStatusMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HApplicationStatus record) {
        return hApplicationStatusMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HApplicationStatus record) {
        return hApplicationStatusMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HApplicationStatus record) {
        return hApplicationStatusMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HApplicationStatus record) {
        return hApplicationStatusMapper.insertSelective(record);
    }

    @Override
    public HApplicationStatus selectByPrimaryKey(Integer id) {
        return hApplicationStatusMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HApplicationStatus record) {
        return hApplicationStatusMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HApplicationStatus record) {
        return hApplicationStatusMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HApplicationStatus> list) {
        return hApplicationStatusMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HApplicationStatus> list) {
        return hApplicationStatusMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HApplicationStatus> list) {
        return hApplicationStatusMapper.batchInsert(list);
    }

}
