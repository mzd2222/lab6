package datatest.Controller;

import datatest.Dao.BookDao;
import datatest.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    BookDao bookDao;

    @GetMapping("index")
    public String main_page(){
        System.out.println("123");
        return "index";
    }

    @ResponseBody
    @PostMapping("/add_book")   //新增图书
    public String insertBook(Book book) {
        List<Book> all = bookDao.findAll();
        for (Book a : all) {
            if (a.getBook_name().equals(book.getBook_name())) {
                return "error";
            }
        }
        bookDao.save(book);
        return "ok";
    }


    @ResponseBody
    @PostMapping("/delete_book")   //删除图书
    public String deleteBook(Book book) {
        List<Book> all = bookDao.findAll();
        for (Book a : all) {
            if (a.getBook_name().equals(book.getBook_name())) {
                System.out.println("123");
                bookDao.delete(a);
                return "ok";
            }
        }
        return "error";
    }

    @ResponseBody
    @GetMapping("/search_book/{name}")   // 根据书名或作者名查找图书
    public Map search_book_name(@PathVariable("name") String name) {
        List<Book> books1 = bookDao.findByname(name);
        List<Book> books2 = bookDao.findByauthor(name);
        Map<String, Object> map = new HashMap<>();

        books1.addAll(books2);

        if(books1.size() > 0){
            map.put("status", "ok");
            map.put("books", books1);
            return map;
        }

        map.put("status", "error");
        return map;

    }

}
