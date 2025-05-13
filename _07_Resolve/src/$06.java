
import java.util.Scanner;

public class $06 {
    public static void main(String[] args) {
        /*
        5명의 학생의 이름과 점수를 입력받고
        해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
        A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
         */
        String[] names = new String[5];
        int[] scores = new int[5];
        String[] avr = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("이름 입력 : ");
            names[i] = sc.next();
            System.out.print("점수 입력 : ");
            scores[i] = sc.nextInt();

            if (scores[i] >= 90) {
                System.out.println(names[i] + " : A");
            } else if (scores[i] >= 80) {
                System.out.println(names[i] + " : B");
            } else if (scores[i] >= 70) {
                System.out.println(names[i] + " : C");
            } else if (scores[i] >= 60) {
                System.out.println(names[i] + " : D");
            } else {
                System.out.println(names[i] + " : F");
            }
            avr[i] = names[i] + " : " + scores[i] + avr[i];
            
        }
        System.out.println("학생명단");
        for (int i = 0; i < names.length; i++) {
            System.out.println(avr[i]);
        }
        sc.close();
    }
}

