package com.zzy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzy.entity.Result;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import com.zzy.mapper.HFacilityTypeMapper;
import com.zzy.pojo.HFacilityType;
import com.zzy.service.HFacilityTypeService;
/**
 * @Filename: HFacilityTypeServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HFacilityTypeServiceImpl implements HFacilityTypeService{

    @Resource
    private HFacilityTypeMapper hFacilityTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hFacilityTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HFacilityType record) {
        return hFacilityTypeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HFacilityType record) {
        return hFacilityTypeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HFacilityType record) {
        return hFacilityTypeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HFacilityType record) {
        return hFacilityTypeMapper.insertSelective(record);
    }

    @Override
    public HFacilityType selectByPrimaryKey(Integer id) {
        return hFacilityTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HFacilityType record) {
        return hFacilityTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HFacilityType record) {
        return hFacilityTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HFacilityType> list) {
        return hFacilityTypeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HFacilityType> list) {
        return hFacilityTypeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HFacilityType> list) {
        return hFacilityTypeMapper.batchInsert(list);
    }

    @Override
    public List<HFacilityType> selectAll() {
        return this.hFacilityTypeMapper.selectAll();
    }

    @Override
    public Result selectByPage(Map param) {
        Integer currentPage = (Integer) param.get("currentPage");
        Integer pageSize = (Integer) param.get("pageSize");
        PageHelper.startPage(currentPage,pageSize);

        List<HFacilityType> list = this.hFacilityTypeMapper.selectByPage(param);
        PageInfo<HFacilityType> pageInfo = new PageInfo<>(list);
        return Result.SUCCESS.sData(pageInfo);
    }

}
