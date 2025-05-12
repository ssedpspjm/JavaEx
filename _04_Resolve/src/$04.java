// while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
public class $04 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
