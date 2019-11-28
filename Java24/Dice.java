package Java24hours;

import java.util.Random;

class Dice {
    public static void main(Test[] arguments) {
        Random generator = new Random();
        int value = generator.nextInt();
        System.out.println("Случайное число " + value);
    }
}