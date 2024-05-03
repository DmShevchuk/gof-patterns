package templateMethod;

public class Main {
    public static void main(String[] args) {
        Drink tea = new Tea();
        tea.prepare();

        System.out.println("===========================");

        Drink coffee = new Coffee();
        coffee.prepare();
    }
}
