public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}}));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181924 코딩테스트 연습 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 3
    /**                                                                                                                  */
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] row: queries) {
            int tmp = arr[row[0]];
            arr[row[0]] = arr[row[1]];
            arr[row[1]] = tmp;
        }
        return arr;
    }
}