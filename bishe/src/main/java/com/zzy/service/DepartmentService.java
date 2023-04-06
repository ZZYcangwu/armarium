package com.zzy.service;

import java.util.List;
import com.zzy.pojo.Department;
    /**
 * @Filename: DepartmentService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface DepartmentService{


    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertOrUpdate(Department record);

    int insertOrUpdateSelective(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    int updateBatch(List<Department> list);

    int updateBatchSelective(List<Department> list);

    int batchInsert(List<Department> list);

}
