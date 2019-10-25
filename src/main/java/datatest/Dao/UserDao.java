package datatest.Dao;

import datatest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


//继承JpaRepository完成对数据库的操作
public interface UserDao extends JpaRepository<User, Integer> {

}
