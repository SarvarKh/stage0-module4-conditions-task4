package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = 0;
        if (first >= second) {
            if (first >= third) {
                result = first;
            } else {
                result = third;
            }
        } else {
            if (second >= third) {
                result = second;
            } else {
                result = third;
            }
        }

        System.out.println(result);
    }
}
