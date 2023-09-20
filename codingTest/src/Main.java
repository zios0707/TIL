public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3, 4, new boolean[]{true, false, false, true, true}));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181931 코딩테스트 연습 > 코딩 기초 트레이닝 > 등차수열의 특정한 항만 더하기
    /**                                                                                                                           */
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (boolean b: included) {
            if(b) answer += a;
            a += d;
        }

        return answer;
    }
}