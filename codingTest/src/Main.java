import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{3, 4, 5, 2, 1}) == 0);
        System.out.println(solution.solution(new int[]{5, 7, 8, 3}) == 1);
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181929 코딩테스트 연습 > 코딩 기초 트레이닝 > 원소들의 곱과 합
    /**                                                                                                                */
    public int solution(int[] num_list) {
        int a = Arrays.stream(num_list).sum();
        int b = 1;
        for(int i: num_list) b *= i;
        System.out.println(Math.pow(a, 2) + ", " + b);
        if(Math.pow(a, 2) < b) return 1;
        return 0;
    }
}