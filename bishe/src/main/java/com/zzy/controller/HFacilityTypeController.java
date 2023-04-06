package com.zzy.controller;

import com.zzy.entity.Result;
import com.zzy.pojo.HFacilityType;
import com.zzy.service.HFacilityService;
import com.zzy.service.HFacilityTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Filename: HFacilityTypeController
 * @Author: zhangzhaoyang
 * @Data:2023年4月4日 0004 16:38
 * @Description: TODO
 */
@RestController
@RequestMapping("/type")
public class HFacilityTypeController  {
    @Resource
    private HFacilityTypeService hFacilityTypeService;

    @GetMapping("/all")
    public Result getAll(){
        List<HFacilityType> list = this.hFacilityTypeService.selectAll();
        return Result.SUCCESS.sData(list);
    }

    @PostMapping("/list")
    public Result list(@RequestBody Map param){
        return this.hFacilityTypeService.selectByPage(param);
    }

    @PostMapping("/add")
    public Result add(@RequestBody HFacilityType hFacilityType){
        this.hFacilityTypeService.insert(hFacilityType);
        return Result.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public Result delete(@PathVariable("id") Integer id){
        this.hFacilityTypeService.deleteByPrimaryKey(id);
        return Result.SUCCESS;
    }

    @GetMapping("/getone/{id}")
    public Result getOne(@PathVariable("id")Integer id){
        HFacilityType hFacilityType = this.hFacilityTypeService.selectByPrimaryKey(id);
        return Result.SUCCESS.sData(hFacilityType);

    }

    @PostMapping("/update")
    public Result update(@RequestBody HFacilityType hFacilityType){
        this.hFacilityTypeService.updateByPrimaryKey(hFacilityType);
        return Result.SUCCESS;
    }

}
