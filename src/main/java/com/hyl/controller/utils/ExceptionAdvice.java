package com.hyl.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler
    public CRM doException(Exception e){
//        记录日志
//        通知运维
//        通知开发
        e.printStackTrace();
        return new CRM(false,"服务器故障");
    }}
