package composite;

public class Main {
    public static void main(String[] args) {
        // Создание простых компонентов
        Graphic circle = new Circle();
        Graphic square = new Square();

        // Создание компоновщика
        CompositeGraphic composite = new CompositeGraphic();

        // Добавление простых компонентов в компоновщик
        composite.add(circle);
        composite.add(square);

        // Добавление компоновщика в другой компоновщик
        CompositeGraphic nestedComposite = new CompositeGraphic();
        nestedComposite.add(composite);

        // Вызов метода draw() на верхнем уровне
        nestedComposite.draw();
    }
}
