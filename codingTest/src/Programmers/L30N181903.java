package Programmers;

public class L30N181903 {
    public static void main(String[] args) {
        System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
    }
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181903 코딩테스트 연습 > 코딩 기초 트레이닝 > qr code
    /**                                                                                                            */
    public static String solution(int q, int r, String code) {
        String result = "";
        for (int i = r; i < code.length(); i += q) result += code.charAt(i);
        return result;
    }
}