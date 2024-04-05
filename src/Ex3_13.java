import java.util.Scanner;

public class Ex3_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend; // 분모
        int divisor; // 분자

        System.out.print("분모를 입력하시오: ");
        dividend = scanner.nextInt(); // 나뉨수 입력
        System.out.print("분자를 입력하시오: ");
        divisor = scanner.nextInt(); // 나눗수 입력
        try {
            System.out.println(dividend+"를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
        }
        catch(ArithmeticException e) { // ArithmeticException 예외 처리 코드
            System.out.println("0으로 나눌 수 없습니다!");
        }
        finally {
            scanner.close(); // 정상적이든 예외가 발생하든 최종적으로 scanner를 닫는다.
        }
    }
}
