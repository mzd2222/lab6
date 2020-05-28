package datatest.Entity;

//配置实体类，使用jpa注解配置映射关系

import javax.persistence.*;

@Entity  //告诉JPA这是一个实体类，即和数据表映射的类
//@Table(name = "tbl_user")  //告诉和哪个表对应，没有的话自动创建；省略，默认表名为User
public class Book {

    @Id  //标记主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //设置自增规则
    private Integer id;    //  @Column(name = "last_name", length = 50)  可以指定名字和一些额外属性
    @Column
    private String Book_name;  // 书名
    @Column
    private String Description; // 简介
    @Column
    private String Author;     // 作者

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        this.Book_name = book_name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
