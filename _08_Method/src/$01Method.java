import java.util.Scanner;

public class $01Method {
    // public static [결과값 자료형] [함수형] ([매개입력변수0, 매개입력변수1, ...])
    public static int calcArith(String op, int num0, int num1) {
        int result = 0;

        switch(op) {
            case "+":
                result = num0 + num1;
                break;
            case "-":
                result = num0 - num1;
                break;
            case "*":
                result = num0 * num1;
                break;
            case "/":
                result = num0 / num1;
                break;
            case "%":
                result = num0 % num1;
                break;
            default:
                System.out.println("연산이 불가능합니다.");
                break;
        }
        // 메서드를 호출한 곳으로 ressutl값을 반환
        // 이 메서드의 업무처리가 끝나고 결과 보고
        return result;
    }
    public static void main(String[] args) throws Exception {
        // 메서드를 만들기 전의 코드

        /*사칙연산 입력-연산-출력 */
        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 정수 입력 >> ");
        int num0 = sc.nextInt();
        System.out.print("2번째 정수 입력 >> ");
        int num1 = sc.nextInt();
        System.out.print("연산자 입력(+ - * / %) >> ");
        String op = sc.next();
        int result = 0;


        /*
        calcArith에 전달할 값은 괄호에 매개변수로 전달
        calcArithrk return한 값이 result에 저장
        => calcArith의 업무처리가 끝나고 결과값을 받음
         */
        result = calcArith(op, num0, num1);

        System.out.println("결과값은 " + result + "입니다.");

        sc.close();
    }
}
