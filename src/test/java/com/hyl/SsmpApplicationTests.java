package com.hyl;

import com.hyl.dao.BookDao;
import com.hyl.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SsmpApplicationTests {
    @Autowired
    BookDao bookDao;

    @Test
    void contextLoads() {
        List<Book> books = bookDao.selectList(null);
        for (Book book:books
             ) {
            System.out.println(book);
        }
    }

}
