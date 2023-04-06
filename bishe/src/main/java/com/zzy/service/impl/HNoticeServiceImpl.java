package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.zzy.mapper.HNoticeMapper;
import com.zzy.pojo.HNotice;
import com.zzy.service.HNoticeService;
/**
 * @Filename: HNoticeServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HNoticeServiceImpl implements HNoticeService{

    @Resource
    private HNoticeMapper hNoticeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hNoticeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HNotice record) {
        return hNoticeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HNotice record) {
        return hNoticeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HNotice record) {
        return hNoticeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HNotice record) {
        return hNoticeMapper.insertSelective(record);
    }

    @Override
    public HNotice selectByPrimaryKey(Integer id) {
        return hNoticeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HNotice record) {
        return hNoticeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HNotice record) {
        return hNoticeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HNotice> list) {
        return hNoticeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HNotice> list) {
        return hNoticeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HNotice> list) {
        return hNoticeMapper.batchInsert(list);
    }

}
