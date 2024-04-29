package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {
    private final Map<String, Color> colorMap = new HashMap<>();

    public Color getColor(String colorName) {
        Color color = colorMap.get(colorName);
        if (color == null) {
            color = new Color(colorName);
            colorMap.put(colorName, color);
        }
        return color;
    }
}

