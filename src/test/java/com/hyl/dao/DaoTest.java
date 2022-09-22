package com.hyl.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hyl.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTest {
    @Autowired
    BookDao bookDao;

    @Test
    void TestSelectByID(){
        bookDao.selectById(1);

    }
    @Test
    void TestSelectAll(){
        bookDao.selectList(null);
    }
    @Test
    void TestInsert(){
        Book book = new Book();
        book.setName("测试数据");
        book.setType("测试数据");
        book.setDescription("测试数据");
        bookDao.insert(book);
    }
    @Test
    void TestDeleteByID(){
        Book book = new Book();
        book.setId(19);
        bookDao.deleteById(book);
    }
    @Test
    void TestUpdate(){
        Book book = new Book();
        book.setId(20);
        book.setName("测试数据1");
        book.setType("测试数据1");
        book.setDescription("测试数据1");
        bookDao.updateById(book);
    }

    @Test
    void TestSelectByPage(){
        IPage page = new Page(2,5);
        bookDao.selectPage(page,null);
    }

    @Test
    void TestSelectBYWrapper(){
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<Book>();
        lambdaQueryWrapper.like(Book::getType,"计算机");
        bookDao.selectList(lambdaQueryWrapper);
    }

}
