package ru.mirea.task3;
import ru.mirea.task3.Ex2point;

public class Ex2circle {
   private int Radius;
   private float Lenth;
   private Ex2point point;

   public Ex2circle(int Radius, Ex2point p) {
      this.point = p;
      this.Radius = Radius;
      Lenth = 2*3.14f*Radius;
   }
   public int getRadius(){
      return Radius;
   }


}
