package datatest.Dao;

import datatest.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


//继承JpaRepository完成对数据库的操作
public interface BookDao extends JpaRepository<Book, Integer>{
    @Query(value = "select * from Book where Book_name like CONCAT('%', :name, '%')", nativeQuery = true)
    List<Book> findByname(@Param("name") String name);

    @Query(value = "select * from Book where Author like CONCAT('%', :name, '%')", nativeQuery = true)
    List<Book> findByauthor(@Param("name") String name);

}
