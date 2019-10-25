package datatest.Entity;

//配置实体类，使用jpa注解配置映射关系

import javax.persistence.*;

@Entity  //告诉JPA这是一个实体类，即和数据表映射的类
@Table(name = "tbl_user")  //告诉和哪个表对应，没有的话自动创建；省略，默认表名为User
public class User {

    @Id  //标记主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //设置自增规则
    private Integer id;
    //  @Column(name = "last_name", length = 50)  可以指定名字和一些额外属性
    @Column
    private String name;
    @Column
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
