public class $07TransType {
    public static void main(String[] args) {
        int total = 297; // 총점
        int stNum = 4; // 학생 수
        double avg = 0.; // 평균
        System.out.println("총점 : " + total + "입니다.");
        // java의 int 연산끼리의 결과는 int
        // 실수가 나오지 않음
        System.out.println("평균 : " + (total / stNum) + "입니다.");

        // 둘 중에 1개 값을 double형으로 변환하면 결과가 double형으로 나옴
        avg = (double) total / stNum; // 강제 형변환
        System.out.println("평균 : " + avg + "입니다.");
    }
}
