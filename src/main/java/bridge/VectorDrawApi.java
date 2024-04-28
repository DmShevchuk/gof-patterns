package bridge;

public class VectorDrawApi implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red," +
                " radius: " + radius
                + ", x: " + x
                + ", y: " + y + " ]"
                + " using VECTOR graphics.");
    }
}