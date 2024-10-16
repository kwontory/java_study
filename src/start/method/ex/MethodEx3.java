package start.method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        // Extract Method, 메서드 추출
        balance = deposit(balance, 1000); // 1000원 입금
        balance = withdraw(balance, 2000); // 2000원 출금

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

     public static int withdraw(int balance, int withdrawAmount) {
        if(balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        return balance;
     }
}
