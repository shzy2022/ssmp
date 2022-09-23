package com.hyl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hyl.entity.Book;
import com.hyl.dao.BookDao;
import com.hyl.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hyl
 * @since 2022-09-21
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private BookDao bookDao;

    public IPage<Book> MyGetByPage(Integer current, Integer size) {
        IPage page = new Page(current,size);
        return bookDao.selectPage(page,null);
    }

    @Override
    public IPage<Book> MyGetByPage(Integer current, Integer size, LambdaQueryWrapper lwq) {
        IPage page = new Page(current,size);
        return bookDao.selectPage(page,lwq);
    }
}
