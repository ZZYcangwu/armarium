package com.zzy.controller;

import com.zzy.entity.Result;
import com.zzy.pojo.HStatus;
import com.zzy.service.HStatusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Filename: HStatusController
 * @Author: zhangzhaoyang
 * @Data:2023年4月4日 0004 16:28
 * @Description: TODO
 */
@RestController
@RequestMapping("/status")
public class HStatusController {

    @Resource
    private HStatusService hStatusService;

    @GetMapping("/all")
    public Result getAll(){
        List<HStatus> list = this.hStatusService.selectAll();
        return Result.SUCCESS.sData(list);
    }
}
