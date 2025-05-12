import java.util.Scanner;

public class $01Arith {
    public static void main(String[] args) {
        // 변수 선언/초기화
        int result = 0;
        int num0 = 0, num1 = 0;

        // java에서 입력을 위한 객체 선언
        Scanner sc = new Scanner(System.in);

        System.out.print("더하기 연산을 시작합니다. \n");
        System.out.print("1번째 숫자 입력 >> ");
        num0 = sc.nextInt(); // 입력받은 값을 num0에 저장
        System.out.print("2번째 숫자 입력 >> ");
        num1 = sc.nextInt(); // 입력받은 값을 num1에 저장

        result = num0 + num1; // num0과 num1을 더한 값을 result에 저장
        System.out.println("+ 연산은은 " + result + "입니다."); // 결과 출력
        result = num0 - num1; // num0과 num1을 뺀 값을 result에 저장
        System.out.println("+ 연산은은 " + result + "입니다."); // 결과 출력
        result = num0 * num1; // num0과 num1을 곱한 값을 result에 저장
        System.out.println("+ 연산은은 " + result + "입니다."); // 결과 출력
        result = num0 / num1; // num0과 num1을 나눈 값을 result에 저장
        System.out.println("+ 연산은은 " + result + "입니다."); // 결과 출력
        result = num0 % num1; // num0과 num1을 나머지 값을 result에 저장
        System.out.println("+ 연산은은 " + result + "입니다."); // 결과 출력
        // 입력 종료
        sc.close(); // Scanner 객체를 닫아줍니다.

    }
}