/**
 * Triangle Class
 *
 * @ Alexandra Gata
 * @ Project02
 * @ CPE102-01
 * 
 * */
 
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math;

public class Triangle implements Shape
{
   private Point a;
   private Point b;
   private Point c;
   private Color color;
   private boolean filled;
   
   public Triangle(Point a, Point b, Point c, Color color, boolean filled) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.color = color;
      this.filled = filled;
   }

   public double getArea() {
      double area = Math.abs((((a.x)*(b.y - c.y))+ ((b.x)*(c.y-a.y)) + ((c.x)*(a.y-b.y))) / (2.0));
      return area;
   }

   public Color getColor() {
      return color;
   }

   public void setColor(Color color) {
      this.color = color;
   }

   public boolean getFilled() {
      return filled;
   }

   public void setFilled(boolean filled) {
      this.filled = filled;
   }

   public void move(Point point) {
      a.x += point.x;
      a.y += point.y;
      b.x += point.x;
      b.y += point.y;
      c.x += point.x;
      c.y += point.y;
   }

   public Point getVertexA() {
      return a;
   }

   public void setVertexA(Point a) {
      this.a = a;
   }

   public Point getVertexB() {
      return b;
   }

   public void setVertexB(Point b) {
      this.b = b;
   }

   public Point getVertexC() {
      return c;
   }

   public void setVertexC(Point c) {
      this.c =c;
   }
   
   public boolean equals(Object other) {
      if (other == null) {
         return false; }
      if (this.getClass() != other.getClass()) {
         return false;}

      Triangle t = (Triangle)other;

      return a.equals(t.a) && b.equals(t.b) && c.equals(t.c) & filled == t.filled;
   
   }
}
