package singleton;

import lombok.Getter;

public final class Database {

    @Getter
    private final String host;

    @Getter
    private final String databaseName;

    @Getter
    private final String login;

    @Getter
    private final String password;

    private static Database DATABASE;


    private Database(String host,
                     String databaseName,
                     String login,
                     String password
    ) {
        this.host = host;
        this.databaseName = databaseName;
        this.login = login;
        this.password = password;
    }

    public static Database getInstance(String host,
                                       String databaseName,
                                       String login,
                                       String password
    ) {
        if (DATABASE == null) {
            DATABASE = new Database(host, databaseName, login, password);
        }
        return DATABASE;
    }

    public String runQuery(String query) {
        return String.format("Запрос успешно выполнен\n==========\n%s\n==========", query);
    }


}
