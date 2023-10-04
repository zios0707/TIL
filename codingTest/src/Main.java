public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}}));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181923 코딩테스트 연습 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 2
    /**                                                                                                                  */
    public int[] solution(int[] arr, int[][] queries) {
        int[] List = new int[1000];
        int Iter = 0;
        for (int[] in: queries
             ) {
            int first = in[0], last = in[1], much = in[2];
            int val = 1000001;
            for(int i = first; i <= last; i++) {
                if(arr[i] == -1) {
                    last++;
                    if(last == arr.length) {
                        break;
                    }
                }
                else if(much < arr[i] && arr[i] < val) {
                    val = arr[i];
                }
            }
            if(val == 1000001) {
                List[Iter++] = -1;
            }else {
                List[Iter++] = val;
            }

        }


        int[] result = new int[Iter];
        for (int i = 0; i < Iter; i++) {
            result[i] = List[i];
        }

        for (int i:result
             ) {
            System.out.println(i);
        }

        return result;
    }
}