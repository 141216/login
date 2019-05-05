package Dao;

import Entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {
    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/test";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public Connection getConnection() {
        Connection connect = null;
        try {
            Class.forName(DRIVER);//加载驱动
            connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);//获取与数据库的连接
        } catch (Exception ee) {
            ee.printStackTrace();
        }
        return connect;
    }


    public User LoginSelect(User u, String tableName) {
        String sql = "SELECT name,password FROM "+ tableName +" WHERE name='" + u.getName() + "' and password='" + u.getPassword() + "'";
        Connection conn;
        PreparedStatement statement = null;
        ResultSet rs = null;
        conn = getConnection();
        User new_u = new User();
        closeDao c = new closeDao();
        try {
            statement = conn.prepareStatement(sql);
            rs = statement.executeQuery();
            while(rs.next()) {
                String new_name = rs.getString(1);
                String new_password = rs.getString(2);
                new_u.setName(new_name);
                new_u.setPassword(new_password);
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        } finally {
            c.closing(conn,statement,rs);
        }
        return new_u ;
    }
}
