package com.zzy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.zzy.pojo.Department;
import com.zzy.mapper.DepartmentMapper;
import com.zzy.service.DepartmentService;
/**
 * @Filename: DepartmentServiceImpl
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Department record) {
        return departmentMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Department record) {
        return departmentMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Department record) {
        return departmentMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Department record) {
        return departmentMapper.insertSelective(record);
    }

    @Override
    public Department selectByPrimaryKey(Integer id) {
        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Department record) {
        return departmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Department record) {
        return departmentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Department> list) {
        return departmentMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Department> list) {
        return departmentMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Department> list) {
        return departmentMapper.batchInsert(list);
    }

}
