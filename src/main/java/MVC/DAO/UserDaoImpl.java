package MVC.DAO;

import MVC.entity.User;

import java.util.Collections;
import java.util.List;

public class UserDaoImpl {

    public List<User> findUserList(){
        return Collections.singletonList(new User("GZH", 26));
    }
}
