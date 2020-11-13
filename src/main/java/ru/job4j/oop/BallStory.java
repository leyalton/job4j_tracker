package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        hare.meet(ball);
        wolf.meet(ball);
        ball.run(hare, wolf);
        fox.kill(ball);
    }
}
