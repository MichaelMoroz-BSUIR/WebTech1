package Task9_11;

import Task9_11.interfaces.Colorable;

public class BasketUtils {
    public static int getBlueBallsCount(Basket basket) {
        int amount = 0;
        for (Colorable ball : basket.getBalls()) {
            if (ball.getColor() == Color.BLUE) amount++;
        }

        return amount;
    }
}
