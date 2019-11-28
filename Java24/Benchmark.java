package Java24;

public class Benchmark {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 60000;
        long index = 0;
        System.out.println("Время начала теста " + startTime);
        while (true) {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now > endTime) {
                break;
            }
            index ++;
        }
        System.out.println("Время окончания теста " + endTime);
        System.out.println(index + " циклов за 1 минуту.");
    }
}
