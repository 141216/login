package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class closeDao {
    public void closing(Connection conn, PreparedStatement statement, ResultSet resultset){

        try {
            resultset.close();
            statement.close();
            conn.close();//由内到外，关闭数据库连接
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
