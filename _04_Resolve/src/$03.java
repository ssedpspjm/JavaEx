// while문을 이용해서 1부터 10까지 합을 출력하세요
public class $03 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
            System.out.println("1부터 " + i + "까지의 합은 " + sum + "입니다.");
        }
    }
}

