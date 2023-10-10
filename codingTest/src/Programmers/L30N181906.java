package Programmers;

public class L30N181906 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ban"));
    }
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181906 코딩테스트 연습 > 코딩 기초 트레이닝 > 접두사인지 확인하기
    /**                                                                                                            */
    public static int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}