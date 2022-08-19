import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        Statement statement = null;
        ResultSet resultSet = null;


        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM sakila.country;");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("country"));
            }

        } catch (SQLException e) {

            dbHelper.showErrMsg(e);

        } finally {
            connection.close();
        }


    }
}