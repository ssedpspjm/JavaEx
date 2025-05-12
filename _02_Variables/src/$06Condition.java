public class $06Condition {
    public static void main(String[] args) {
        int score = 90;

        if (score >= 85)
            System.out.println("상위권 입니다.");
        else
            System.out.println("하위권 입니다.");

        System.out.println("----------------------------");

        String result;
        result = (score >= 85) ? "상위권 입니다." : "하위권 입니다.";
        System.out.println(result);
    }
}
