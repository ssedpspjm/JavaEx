import java.util.Scanner;

public class $04CompLogic {
    public static void main(String[] args) {
        int score = 0;
        String pass = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("시험 점수를 입력하세요 (0 ~ 100) >>");
        score = sc.nextInt(); // 입력받은 값을 score에 저장
        System.out.print("당신의 면접 분위기는? (happy/attack) >>");
        pass = sc.next(); // 입력받은 값을 pass에 저장

        // 숫자는 비교연산자 사용, 문자열은 equals() 메서드 사용
        if (score >= 90 && pass.equals("happy") == true)
            System.out.println("합격입니다.");
        else
            System.out.println("당신은 더 좋은 곳과 인연이 닿을 것입니다.");

        System.out.println(pass);

        sc.close();
    }
}
