package com.zzy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Filename: Result
 * @Author: zhangzhaoyang
 * @Data:2023年4月4日 0004 11:23
 * @Description: TODO
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private boolean flag;
    private String message;
    private Object data;
    public static final Result SUCCESS = new Result(true,"success",null);


    public Result sData(Object data){
        this.data = data;
        return this;
    }
    public Result sMessage(String message){
        this.message = message;
        return this;
    }

    public Result(Object data) {
        this.data = data;
    }

    public Result(boolean flag) {
        this.flag = flag;
    }
}
