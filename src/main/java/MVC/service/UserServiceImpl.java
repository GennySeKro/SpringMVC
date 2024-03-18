package MVC.service;

import MVC.DAO.UserDaoImpl;
import MVC.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl {


    @Autowired
    private UserDaoImpl userDao;

    public List<User> findUserList(){
        return userDao.findUserList();
    }

}
