package Service;

import Dao.JDBC;
import Entity.User;

public class TestService {
    public boolean login(User u){
        JDBC selecter = new JDBC();
        String tableName = "user";

        String name = selecter.LoginSelect(u,tableName).getName();
        String password = selecter.LoginSelect(u,tableName).getPassword();
        System.out.println(selecter.LoginSelect(u,tableName).getName());
        System.out.println(selecter.LoginSelect(u,tableName).getPassword());
        if(name == null || password == null)
            return false;
        else
            return true;
//我自己觉得equals中比较对象要非空，不大适合这里
       /*if(name.equals(u.getName()) && password.equals(u.getPassword()))
            return true;
        else
            return false;*/
    }
}
