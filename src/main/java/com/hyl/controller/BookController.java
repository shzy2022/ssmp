package com.hyl.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hyl.controller.utils.CRM;
import com.hyl.entity.Book;
import com.hyl.service.IBookService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hyl
 * @since 2022-09-21
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;
    //保存数据
    @PostMapping
    public CRM BookSave(@RequestBody Book book){
        Boolean code = bookService.save(book);
        return new CRM(code);
    }
    //通过ID删除数据
    @DeleteMapping("/{id}")
    public CRM BookDeleteByID(@PathVariable Integer id){
        Boolean code = bookService.removeById(id);
        return new CRM(code);
    }
    //通过ID更改数据
    @PutMapping("/{id}")
    public CRM BookUpdateByID(@PathVariable Integer id,@RequestBody Book book){
        book.setId(id);
        Boolean code = bookService.updateById(book);
        return new CRM(code);
    }
    //通过ID查询数据
    @GetMapping("/{id}")
    public CRM BookGetByID(@PathVariable Integer id){
        CRM crm = new CRM();
        crm.setCode(true);
        try {
            Book book = bookService.getById(id);
            crm.setData(book);
        }catch (Exception e){
            crm.setCode(false);
            crm.setMsg("系统出错，请联系工作人员");
        }
        return crm;
    }
    //查询所有数据
    @GetMapping
    public CRM BookGetAll(){
        CRM crm = new CRM();
        crm.setCode(true);
        try {
            List<Book> books = bookService.list(null);
            crm.setData(books);
        }catch (Exception e){
            crm.setCode(false);
            crm.setMsg("系统出错，请联系工作人员");
        }
        return crm;
    }
    //查询分页数据
    @GetMapping("/{current}/{size}")
    public CRM BookGetByPage(@PathVariable Integer current,@PathVariable Integer size){
        CRM crm = new CRM();
        crm.setCode(true);
        try {
            IPage<Book> page = bookService.MyGetByPage(current, size);
            crm.setData(page);
        }catch (Exception e){
            crm.setCode(false);
            crm.setMsg("系统出错，请联系工作人员");
        }
        return crm;
    }
    //查询特定数据
//    public CRM BookGetByWrapper(Book book){
//        return new CRM();
//    }
}

