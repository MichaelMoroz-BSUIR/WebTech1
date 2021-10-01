package Task9_11;

public class Main {
    public static void main(String[] args) {

        var basket = new Basket();
        basket.addBall(new Ball(Color.BLUE, 1));
        basket.addBall(new Ball(Color.BLUE, 1));
        basket.addBall(new Ball(Color.RED, 2));

        int count = (int) (Math.random() * 10) + 1;
        int color = 0;
        for (int i = 0; i < count; i++) {
            color = (int) (Math.random() * 6) + 1;
            switch (color) {
                case (1) -> basket.addBall(new Ball(Color.RED, (int) (Math.random() * 2) + 1));
                case (2) -> basket.addBall(new Ball(Color.BLUE, (int) (Math.random() * 2) + 1));
                case (3) -> basket.addBall(new Ball(Color.GREEN, (int) (Math.random() * 2) + 1));
                case (4) -> basket.addBall(new Ball(Color.YELLOW, (int) (Math.random() * 2) + 1));
                case (5) -> basket.addBall(new Ball(Color.GREY, (int) (Math.random() * 2) + 1));
                case (6) -> basket.addBall(new Ball(Color.BROWN, (int) (Math.random() * 2) + 1));
            }
        }
        System.out.println(basket);
        System.out.println("Weight of basket is: " + basket.getWeight());
        System.out.println("Amount of blue balls: " + BasketUtils.getBlueBallsCount(basket));
    }
}
