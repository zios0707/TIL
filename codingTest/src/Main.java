public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}}));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181922 코딩테스트 연습 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 4
    /**                                                                                                                  */
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] in: queries
             ) {
            int first = in[0], last = in[1], much = in[2];
            for(int i = first; i <= last; i++) {
                if(i % much == 0) {
                    arr[i]++;
                }
                System.out.print(arr[i]);
            }
            System.out.println("");

        }
        for (int i: arr
             ) {
            System.out.print(i);
        }
        return arr;
    }
}