package com.hyl.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hyl.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private IBookService service;
    @Test
    void TestGetById(){
        service.getById(2);
    }

    @Test
    void TestGetAll(){
        List<Book> books = service.list(null);
        System.out.println(books);
    }

    @Test
    void TestSave(){
        Book book = new Book();
        book.setName("测试数据");
        book.setType("测试数据");
        book.setDescription("测试数据");
        service.save(book);
    }
    @Test
    void TestRemoveByID(){
        Book book = new Book();
        book.setId(19);
        service.removeById(book);
    }
    @Test
    void TestUpdate(){
        Book book = new Book();
//        book.setId(20);
        book.setName("测试数据2");
        book.setType("测试数据2");
        book.setDescription("测试数据2");
        service.updateById(book);
    }

    @Test
    void TestSelectByPage(){
//        IPage page = new Page(2,5);
//        service.page(page,null);
        service.MyGetByPage(2,3);
    }

    @Test
    void TestSelectBYWrapper(){
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<Book>();
        lambdaQueryWrapper.like(Book::getType,"计算机");
        service.getMap(lambdaQueryWrapper);
    }

}
