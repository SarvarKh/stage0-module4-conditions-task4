package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = 0;
        if (first > second && first > third) {
            result = first;
        } else if (second > first && second > third) {
            result = second;
        } else {
            result = third;
        }
        System.out.println(result);
    }
}
