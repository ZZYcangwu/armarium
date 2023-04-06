package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.zzy.mapper.HAdminMapper;
import com.zzy.pojo.HAdmin;
import com.zzy.service.HAdminService;
/**
 * @Filename: HAdminServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class HAdminServiceImpl implements HAdminService{

    @Resource
    private HAdminMapper hAdminMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hAdminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HAdmin record) {
        return hAdminMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(HAdmin record) {
        return hAdminMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(HAdmin record) {
        return hAdminMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(HAdmin record) {
        return hAdminMapper.insertSelective(record);
    }

    @Override
    public HAdmin selectByPrimaryKey(Integer id) {
        return hAdminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HAdmin record) {
        return hAdminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HAdmin record) {
        return hAdminMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<HAdmin> list) {
        return hAdminMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<HAdmin> list) {
        return hAdminMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<HAdmin> list) {
        return hAdminMapper.batchInsert(list);
    }

}
