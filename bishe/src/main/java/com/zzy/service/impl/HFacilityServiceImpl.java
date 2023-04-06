package com.zzy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzy.entity.Result;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zzy.pojo.HFacility;
import java.util.List;
import java.util.Map;

import com.zzy.mapper.HFacilityMapper;
import com.zzy.service.HFacilityService;
/**
 * @Filename: HFacilityServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HFacilityServiceImpl implements HFacilityService{

    @Resource
    private HFacilityMapper hFacilityMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hFacilityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HFacility record) {
        return hFacilityMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HFacility record) {
        return hFacilityMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HFacility record) {
        return hFacilityMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HFacility record) {
        return hFacilityMapper.insertSelective(record);
    }

    @Override
    public HFacility selectByPrimaryKey(Integer id) {
        return hFacilityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HFacility record) {
        return hFacilityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HFacility record) {
        return hFacilityMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HFacility> list) {
        return hFacilityMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HFacility> list) {
        return hFacilityMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HFacility> list) {
        return hFacilityMapper.batchInsert(list);
    }

    @Override
    public Result selectAll(Map param) {
        Integer currentPage = (Integer) param.get("currentPage");
        Integer pageSize = (Integer) param.get("pageSize");
        PageHelper.startPage(currentPage,pageSize);
        List<HFacility> list = this.hFacilityMapper.selectAll(param);
        PageInfo<HFacility> pageInfo = new PageInfo<>(list);
        return Result.SUCCESS.sData(pageInfo);
    }

}
