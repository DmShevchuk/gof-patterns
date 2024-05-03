package templateMethod;

public class Tea extends Drink {
    @Override
    void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon...");
    }
}
