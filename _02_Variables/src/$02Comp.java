public class $02Comp {
    public static void main(String[] args) {
        int num0 = 100, num1 = 10, num2 = 100;

        boolean isLarge = num0 > num1; // num0이 num1보다 큰지 비교
        System.out.println(isLarge); // 결과 출력
        isLarge = num0 < num1; // num0이 num1보다 작은지 비교
        System.out.println(isLarge); // 결과 출력
        isLarge = num0 == num2; // num0과 num2가 같은지 비교
        System.out.println(isLarge); // 결과 출력
        isLarge = num0 >= num2;
        System.out.println(isLarge); // 결과 출력
    }

}