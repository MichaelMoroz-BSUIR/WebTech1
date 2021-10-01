package Task9_11;

import Task9_11.interfaces.Colorable;
import Task9_11.interfaces.Weightable;

public class Ball implements Weightable, Colorable {
    private final Color color;
    private final int weight;

    public Ball(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "\nBall{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}
