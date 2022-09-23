package com.hyl.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hyl.controller.utils.CRM;
import com.hyl.entity.Book;
import com.hyl.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

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
    public CRM BookSave(@RequestBody Book book) throws IOException {
//        if(book.getName().equals("123")){
//            throw new IOException();
//        }
        Boolean code = bookService.save(book);
        return new CRM(code,code?"添加成功":"添加失败");
    }
    //通过ID删除数据
    @DeleteMapping("/{id}")
    public CRM BookDeleteByID(@PathVariable Integer id){
        Boolean code = bookService.removeById(id);
        return new CRM(code,code?"删除成功":"删除失败");
    }
    //通过ID更改数据
    @PutMapping("/{id}")
    public CRM BookUpdateByID(@PathVariable Integer id,@RequestBody Book book){
        book.setId(id);
        Boolean code = bookService.updateById(book);
        return new CRM(code,code?"更新成功":"更新失败");
    }
    //通过ID更改数据
    @PutMapping
    public CRM BookUpdate(@RequestBody Book book){
        Boolean code = bookService.updateById(book);
        return new CRM(code,code?"更新成功":"更新失败");
    }
    //通过ID查询数据
    @GetMapping("/{id}")
    public CRM BookGetByID(@PathVariable Integer id){
        CRM crm = new CRM();
        crm.setCode(true);
        try {
            Book book = bookService.getById(id);
            crm.setData(book);
            crm.setMsg("查询成功");
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
            crm.setMsg("查询成功");
        }catch (Exception e){
            crm.setCode(false);
            crm.setMsg("系统出错，请联系工作人员");
        }
        return crm;
    }
    //查询分页数据
//    @GetMapping("/{current}/{size}")
//    public CRM BookGetByPage(@PathVariable Integer current,@PathVariable Integer size){
//        CRM crm = new CRM();
//        crm.setCode(true);
//        try {
//            IPage<Book> page = bookService.MyGetByPage(current, size);
//            if(current>page.getPages()){
//                page = bookService.MyGetByPage((int)page.getPages(), size);
//            }
//            crm.setData(page);
//            crm.setMsg("查询成功");
//        }catch (Exception e){
//            crm.setCode(false);
//            crm.setMsg("系统出错，请联系工作人员");
//        }
//        return crm;
//    }
    //查询特定数据
//查询分页数据
    @GetMapping("/{current}/{size}")
    public CRM BookGetByPage(@PathVariable Integer current,@PathVariable Integer size,Book book){
//        System.out.println(book);
        CRM crm = new CRM();
        crm.setCode(true);
        try {
            LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
            lqw.like(!(book.getName().equals("")),Book::getName,book.getName())
                    .like(!(book.getName().equals("")),Book::getType,book.getType())
                    .like(!(book.getName().equals("")),Book::getDescription,book.getDescription());
            IPage<Book> page = bookService.MyGetByPage(current, size,lqw);
            if(current>page.getPages()){
                page = bookService.MyGetByPage((int)page.getPages(), size,lqw);
            }
            crm.setData(page);
            crm.setMsg("查询成功");
        }catch (Exception e){
            crm.setCode(false);
            crm.setMsg("系统出错，请联系工作人员");
        }
        return crm;
    }
}

