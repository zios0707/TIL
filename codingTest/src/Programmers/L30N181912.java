package Programmers;

import java.util.ArrayList;
import java.util.List;

public class L30N181912 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"0123456789","9876543210","9999999999999"}, 50000, 5, 5));
    }

    /*
    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181912 코딩테스트 연습 > 코딩 기초 트레이닝 > 배열 만들기 5
    /**                                                                                                              */

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<String> list = new ArrayList<>();
        for (String s1: intStrs) {
            String str = s1.substring(s, s + l);
            if(Integer.valueOf(str) > k) list.add(str);
        }

        int[] ints = new int[list.size()]; int Iter = 0;
        for (String s1: list) ints[Iter++] = Integer.valueOf(s1);

        return ints;
    }
}