public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3, 10));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181920 코딩테스트 연습 > 코딩 기초 트레이닝 > 카운트 업
    /**                                                                                                            */
    public int[] solution(int start_num, int end_num) {
        Integer[] integers = new Integer[50];
        int Iter = 0;
        for(int i = start_num; i <= end_num; i++) {
            integers[Iter++] = i;
        }
        int[] arr = new int[Iter];

        for(int i = 0; i < Iter; i++) {
            arr[i] = integers[i];
        }
        return arr;
    }
}