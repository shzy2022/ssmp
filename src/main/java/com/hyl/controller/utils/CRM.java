package com.hyl.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CRM {
    private Boolean code;
    private Object data = null;
    private String msg = null;

    public CRM(Boolean code) {
        this.code = code;
    }



    public CRM(Boolean code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
