import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("ProgrammerS123", 11));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181907 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열의 앞의 n글자
    /**                                                                                                            */
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}