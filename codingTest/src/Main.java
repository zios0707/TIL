import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(false, true, true, true));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181917 코딩테스트 연습 > 코딩 기초 트레이닝 > 간단한 논리 연산
    /**                                                                                                                */
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 || x2) && (x3 || x4);
        return answer;
    }
}