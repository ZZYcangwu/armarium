package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.zzy.mapper.HStatusMapper;
import com.zzy.pojo.HStatus;
import com.zzy.service.HStatusService;
/**
 * @Filename: HStatusServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HStatusServiceImpl implements HStatusService{

    @Resource
    private HStatusMapper hStatusMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hStatusMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HStatus record) {
        return hStatusMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HStatus record) {
        return hStatusMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HStatus record) {
        return hStatusMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HStatus record) {
        return hStatusMapper.insertSelective(record);
    }

    @Override
    public HStatus selectByPrimaryKey(Integer id) {
        return hStatusMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HStatus record) {
        return hStatusMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HStatus record) {
        return hStatusMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HStatus> list) {
        return hStatusMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HStatus> list) {
        return hStatusMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HStatus> list) {
        return hStatusMapper.batchInsert(list);
    }

    @Override
    public List<HStatus> selectAll() {
        List<HStatus> list =  this.hStatusMapper.selectAll();
        return list;
    }

}
