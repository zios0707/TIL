import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 4, 2, 5, 3}));
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181918 코딩테스트 연습 > 코딩 기초 트레이닝 > 배열 만들기 4
    /**                                                                                                                  */
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int Iter = 0;
        while(Iter < arr.length)
            if(stk.isEmpty()) stk.add(arr[Iter++]);
            else if(stk.get(stk.size() - 1) < arr[Iter]) stk.add(arr[Iter++]);
            else stk.remove(stk.size() - 1);

        int[] result = new int[stk.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = stk.get(i);
        }
        return result;
    }
}