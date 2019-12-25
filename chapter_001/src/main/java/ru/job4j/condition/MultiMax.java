package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int tempresult = (first>second) ? first:second;
        int result = (tempresult>third) ? tempresult:third;
        return result;
    }

}
