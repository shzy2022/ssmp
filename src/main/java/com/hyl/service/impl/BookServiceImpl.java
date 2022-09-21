package com.hyl.service.impl;

import com.hyl.entity.Book;
import com.hyl.dao.BookDao;
import com.hyl.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
