package Programmers;

public class L30N181908 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
    }

    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181908 코딩테스트 연습 > 코딩 기초 트레이닝 > 접미사인지 확인하기
    /**                                                                                                                  */

    public static int solution(String my_string, String is_suffix) {
        return (my_string.endsWith(is_suffix) ? 1 : 0);
    }
}