import java.util.Scanner;

public class $01Array {
    public static void main(String[] args) {
        /*
         * 3명의 국어점수 입력 후 총점과 평균 계산
         * 
         * 만약에 전교생의 국어점수로 계산해야 한다면?
         * => 배열 탄생
         */
        Scanner sc = new Scanner(System.in);

        int[] kor = new int[3];

        System.out.print("1번째 학생 국어점수 입력 >> ");
        kor[0] = sc.nextInt();
        System.out.print("2번째 학생 국어점수 입력 >> ");
        kor[1] = sc.nextInt();
        System.out.print("3번째 학생 국어점수 입력 >> ");
        kor[2] = sc.nextInt();
        

        int total = kor[0] + kor[1] + kor[2];
        double avg = (double)total / 3;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        System.out.printf("평균 : %.2f\n", avg);

        sc.close();
    }
}
