package ledger;

import java.sql.DriverManager;

public class Database {
    try (var connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", postgres, ))
}
