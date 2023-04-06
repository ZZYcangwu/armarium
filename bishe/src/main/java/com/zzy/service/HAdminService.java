package com.zzy.service;

import java.util.List;
import com.zzy.pojo.HAdmin;
    /**
 * @Filename: HAdminService
 * @Author: zhangzhaoyang
 * @Data:2023年4月3日 0003 17:41
 * @Description: TODO

*/

public interface HAdminService{


    int deleteByPrimaryKey(Integer id);

    int insert(HAdmin record);

    int insertOrUpdate(HAdmin record);

    int insertOrUpdateSelective(HAdmin record);

    int insertSelective(HAdmin record);

    HAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HAdmin record);

    int updateByPrimaryKey(HAdmin record);

    int updateBatch(List<HAdmin> list);

    int updateBatchSelective(List<HAdmin> list);

    int batchInsert(List<HAdmin> list);

}
