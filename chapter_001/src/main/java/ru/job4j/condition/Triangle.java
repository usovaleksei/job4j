package ru.job4j.condition;

public class Triangle {

        private Point first;
        private Point second;
        private Point third;

        public Triangle(Point ap, Point bp, Point cp) {
            this.first = ap;
            this.second = bp;
            this.third = cp;
        }

        /**
         * Метод проверяет можно ли построить треугольник с такими длинами сторон.
         *
         *
         * @param a Длина от точки a b.
         * @param b Длина от точки a c.
         * @param c Длина от точки b c.
         * @return да или нет
         */
        public static boolean exist(double a, double b, double c) {
            return (a + b > c) && (b + c > a) && (c + a > b);
        }

        /**
         * Метод вычисления периметра по длинам сторон.
         *
         * Формула.
         *
         * (a + b + c) / 2
         *
         * @param a расстояние между точками a b
         * @param b расстояние между точками a c
         * @param c расстояние между точками b c
         * @return Периметр.
         */
        public double period(double a, double b, double c) {
            return ((a + b + c) / 2);
        }

        /**
         * Метод должен вычислить площадь треугольника.
         *
         * Формула.
         *
         * √ p *(p - ab) * (p - ac) * (p - bc)
         *
         * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
         *
         * @return Вернуть площадь, если треугольник существует или -1 (если не существует).
         */
        public double area() {
            double rsl = -1;
            double a = first.distance(second);
            double b = first.distance(third);
            double c = second.distance(third);
            double p = period(a, b, c);
            if (this.exist(a, b, c)) {
                // формула для расчета площади треугольника.
                rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            }
            return rsl;
        }
}
