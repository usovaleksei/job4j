package ru.job4j.condition;

public class MultiMaxx {
    public int max(int first, int second, int third) {
        int tempresult = (first > second) ? first : second;
        return (tempresult > third) ? tempresult : third;
    }
}
