package fc.java.fc.java.course2.part1;

import fc.java.fc.java.model2.Connection;
import fc.java.fc.java.model2.MySQLDriver;
import fc.java.fc.java.model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        // oracle DB접속
        Connection conn=new OracleDriver();
        conn.getConnection("","","");

        // mysql DB 접속
        conn=new MySQLDriver();
        conn.getConnection("","","");
    }
}
