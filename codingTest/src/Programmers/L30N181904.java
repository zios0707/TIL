package Programmers;

public class L30N181904 {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc",4, 2));
    }

    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181904 코딩테스트 연습 > 코딩 기초 트레이닝 > 세로 읽기
    /**                                                                                                            */

    public static String solution(String my_string, int m, int c) {
        String result = "";
        for (int i = c - 1; i < my_string.length(); i += m) result += my_string.charAt(i);
        return result;
    }
}