
import java.util.Scanner;

public class $03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] name = new String[7];
        int[] avg = new int[7];

        int sum = 0;
        int avr = 0;

        System.out.println("7명의 이름과 점수를 입력하세요.");

        for (int i = 0; i < name.length; i++) {
            System.out.println((i + 1) + "번째 이름 :");
            name[i] = sc.nextLine();
            System.out.print((i + 1) + "번째 점수 :");
            avg[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("입력한 이름과 점수 : ");

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + "학생의 점수는" + avg[i]);
            sum += avg[i];
        }
        avr = sum / name.length;
        System.out.println("학생들의 평균 점수는 " + avr + "입니다.");
        System.out.println("학생들의 총 점수는 " + sum + "입니다");
    }
}
