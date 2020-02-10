package ru.job4j.condition;
//вычисление максимального числа из четырех
public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int rst = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    rst = first;
                }
            }
        } else if (second > third) {
            if (second > forth) {
                rst = second;
            }
        } else if (third > forth) {
            rst = third;
        }
        return rst;
    }
}
