package ru.job4j.condition;

public class Triangle {
    public static boolean exist (double ab, double bc, double cd) {
        return (ab+bc>cd)&&(bc+cd>ab)&&(cd+ab>bc)? true:false;
    }
}
