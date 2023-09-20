public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{2, 1, 6}));
        System.out.println(solution.solution(new int[]{5, 2, 1, 7, 5}).toString());
    }
}


class Solution {
    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181927 코딩테스트 연습 > 코딩 기초 트레이닝 > 마지막 두 원소
    /**                                                                                                                */
    public int[] solution(int[] list) {
        int length = list.length - 1;
        int[] array = new int[length + 2];
        System.arraycopy(list, 0, array, 0, list.length);
        if (list[length] > list[length - 1]) {
            array[length + 1] = list[length] - list[length - 1];
        } else {
            array[length + 1] = list[length] * 2;
        }

        return array;
    }
}