package com.hyl.dao;

import com.hyl.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hyl
 * @since 2022-09-21
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
