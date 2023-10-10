public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("78720646226947352489"));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181914 코딩테스트 연습 > 코딩 기초 트레이닝 > 9로 나눈 나머지
    /**                                                                                                                */
    public int solution(String number) {
        int val = 0;

        for (char c: number.toCharArray()) val += Integer.valueOf(c - '0');

        return val % 9;
    }
}