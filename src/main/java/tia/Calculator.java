package tia;

public class Calculator {

    public int sum(int a, int b) {
        return sumImpl(a, b);
    }

    private int sumImpl(int first, int second) {
        return first + second;
    }

    public int minus(int first, int second) {
        System.out.println("tia rocks");
        return first - second;
    }

}
