public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{3, 4, 5, 2, 1}) == 393);
        System.out.println(solution.solution(new int[]{5, 7, 8, 3}) == 581);
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181928 코딩테스트 연습 > 코딩 기초 트레이닝 > 이어 붙인 수
    /**                                                                                                                */
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(Integer i: num_list) {
            if(i % 2 == 0) even += String.valueOf(i);
            else odd += String.valueOf(i);
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}