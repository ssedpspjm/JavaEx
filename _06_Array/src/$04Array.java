import java.util.Scanner;

public class $04Array {
    public static void main(String[] args) throws Exception {
        /*
         * 3명의 국어점수 입력 후 총점과 평균 계산
         * 
         * 만약에 전교생의 국어점수로 계산해야 한다면?
         * => 배열 탄생
         */
        final int n = 5;

        Scanner sc = new Scanner(System.in);

        int[] kor = new int[n];
        for (int i=0; i<kor.length; i++) {
            System.out.print((i+1)+"번째 학생 국어점수 입력 >> ");
            kor[i] = sc.nextInt();
        }

        int total = 0;
        for (int i=0; i<kor.length; i++) {
            total += kor[i];
        }
        double avg = (double)total / n;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        System.out.printf("평균 : %.2f\n", avg);

        sc.close();
    }
}
