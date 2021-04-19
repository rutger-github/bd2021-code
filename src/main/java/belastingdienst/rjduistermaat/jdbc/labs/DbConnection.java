package belastingdienst.rjduistermaat.jdbc.labs;

import java.sql.*;

public class DbConnection implements AutoCloseable {
    private static final String URL = "jdbc:mysql://localhost:3306/pubs?serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    private Connection connection;

    public DbConnection() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Statement createStatement() throws SQLException {
        return this.connection.createStatement();
    }

    public PreparedStatement preparedStatement(String preQuery) throws SQLException {
        return this.connection.prepareStatement(preQuery);
    }


    @Override
    public void close()  {
        try {
            this.connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
