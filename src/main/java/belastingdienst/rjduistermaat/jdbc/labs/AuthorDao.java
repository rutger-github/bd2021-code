package belastingdienst.rjduistermaat.jdbc.labs;

import belastingdienst.rjduistermaat.jdbc.labs.author.Name;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class AuthorDao {

    private final DbConnection dbConnection;
    private final String TABLE_NAME = "authors";

    public AuthorDao(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }


    public List<Author> findName(String searchName) {

        List<Author> authorList = new LinkedList<>();
        ResultSet result = null;
        try (this.dbConnection) {

            var preparedStatement = this.dbConnection.preparedStatement("SELECT * FROM " + TABLE_NAME + " WHERE AU_FNAME LIKE ?");
            preparedStatement.setString(1, "%" + searchName + "%");

            result = preparedStatement.executeQuery();


            if (result == null) {
                return authorList;
            }

            while (result.next()) {
                authorList.add(
                        new Author(
                                result.getString("address"),
                                new Name(
                                        result.getString("AU_FNAME"),
                                        result.getString("AU_LNAME")
                                )
                        )
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return authorList;


    }
}
