package com.hyl.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * <p>
 * 
 * </p>
 *
 * @author hyl
 * @since 2022-09-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
//@TableName("tbl_book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String type;

    private String name;

    private String description;

    @TableField(select = false)
    private Integer deleted;


}
