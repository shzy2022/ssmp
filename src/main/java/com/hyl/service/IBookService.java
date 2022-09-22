package com.hyl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hyl.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hyl
 * @since 2022-09-21
 */
public interface IBookService extends IService<Book> {

//    分页查询
    IPage<Book> MyGetByPage(Integer current, Integer size);

}

