package koddilla.course.calculator;

public class Calculator {
    int x;
    int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add() {
        System.out.println(x + y);
    }

    public int subtract() {
        return x - y;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 3);
        calculator.add();
        calculator.subtract();
    }
}
