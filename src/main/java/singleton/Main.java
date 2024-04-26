package singleton;

public class Main {
    public static void main(String[] args) {

        // Получаем инстанс подключения к БД
        Database database = Database.getInstance("localhost", "my_db", "admin", "qwerty123");

        // Проверяем наши логины и пароли
        System.out.println(database.getHost());
        System.out.println(database.getDatabaseName());
        System.out.println(database.getLogin());
        System.out.println(database.getPassword());

        // Выполним запрос
        System.out.println(database.runQuery("select * from users;"));
    }
}
