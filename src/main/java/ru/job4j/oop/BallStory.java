package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Ball ball = new Ball();
        hare.tryEat(ball);
        ball.tryRun(true);
        wolf.tryEat(ball);
        ball.tryRun(true);
        fox.tryEat(ball);
        ball.tryRun(false);
    }
}