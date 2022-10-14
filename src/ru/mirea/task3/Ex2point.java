package ru.mirea.task3;

public class Ex2point {
        private int x;
        private int y;

        public Ex2point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int Getx() {
            return x;
        }

        public void Setx(int x) {
            this.x = x;
        }

        public int Gety() {
            return y;
        }

        public void Sety(int y) {
            this.y = y;
        }
        public String toString() {
            return "Вы ввели слудующие координаты точки: X: " + this.x + ", Y: " +  this.y;
        }


    }

