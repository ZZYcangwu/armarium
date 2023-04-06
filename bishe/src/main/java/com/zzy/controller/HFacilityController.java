package com.zzy.controller;

import com.zzy.entity.Result;
import com.zzy.pojo.HFacility;
import com.zzy.service.HFacilityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * @Filename: HFacilityController
 * @Author: zhangzhaoyang
 * @Data:2023年4月4日 0004 11:22
 * @Description: TODO
 */
@RestController
@RequestMapping("/facility")
public class HFacilityController {

    @Resource
    private HFacilityService hFacilityService;

    @PostMapping("/list")
    public Result list(@RequestBody Map param){
        return this.hFacilityService.selectAll(param);
    }

    @PostMapping("/add")
    public Result add(@RequestBody HFacility facility){
        System.out.println(facility);
        facility.setCreateTime(new Date());
        facility.setFacilityDepartmentId(0);
        facility.setFacilityStatusId(1);
        this.hFacilityService.insert(facility);
        return Result.SUCCESS.sMessage("添加成功");
    }

    @GetMapping("/getone/{id}")
    public Result getOne(@PathVariable("id")Integer id){
        return Result.SUCCESS.sData(this.hFacilityService.selectByPrimaryKey(id));
    }

    @PostMapping("/update")
    public Result update(@RequestBody HFacility hFacility){
        this.hFacilityService.updateByPrimaryKey(hFacility);
        return Result.SUCCESS.sMessage("修改成功");
    }

    @GetMapping("/delete/{id}")
    public Result delete(@PathVariable("id")Integer id){
        this.hFacilityService.deleteByPrimaryKey(id);
        return Result.SUCCESS.sMessage("删除成功");
    }
}
