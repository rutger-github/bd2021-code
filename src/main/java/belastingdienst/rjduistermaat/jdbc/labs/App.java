package belastingdienst.rjduistermaat.jdbc.labs;

public class App {
    public static void main(String[] args) {
        var authorDao = new AuthorDao(new DbConnection());

        var searchResult = authorDao.findName("John");

        searchResult.forEach(
                System.out::println
        );
    }
}
