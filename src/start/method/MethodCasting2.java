package start.method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 1;
        printNumber(number); // int -> double 자동 형변환
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
