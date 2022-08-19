import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    //This metod for connecting to DATABASE.
    private String userName = "root";
    private String passwd = "passwd";
    private String dbUrl = "dbUrl";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, passwd);
    }

    public void showErrMsg(SQLException e) {
        System.out.println("Error : " + e.getMessage());
        System.out.println("Error code : " + e.getErrorCode());
    }


}
