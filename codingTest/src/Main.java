public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(2, 6, 1) == 9);
        System.out.println(solution.solution(5, 3, 3) == 473);
        System.out.println(solution.solution(4, 4, 4) == 110592);
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181930 코딩테스트 연습 > 코딩 기초 트레이닝 > 주사위 게임 2
    /**                                                                                                              */
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        int a1 = a * a;
        int a2 = a1 * a;
        int b1 = b * b;
        int b2 = b1 * b;
        int c1 = c * c;
        int c2 = c1 * c;
        if(a == b && b == c) answer *= (a1 + b1 + c1) * (a2 + b2 + c2);
        else if(a != b && b != c && a != c) {}
        else answer *= a1 + b1 + c1;
        return answer;
    }
}