package com.hyl.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.annotations.Delete;

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

    private Integer deleted;


}
