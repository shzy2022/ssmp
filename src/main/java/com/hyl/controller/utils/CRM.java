package com.hyl.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CRM {
    private Boolean Code;
    private Object data = null;
    private String msg = null;

    public CRM(Boolean code) {
        Code = code;
    }
}
