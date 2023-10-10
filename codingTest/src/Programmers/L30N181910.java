package Programmers;

public class L30N181910 {
    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
    }

    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181910 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열의 뒤의 n글자
    /**                                                                                                                   */

    public static String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}