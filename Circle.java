/**
 * Circle Class
 *
 * @ Alexandra Gata
 * @ Project02
 * @ CPE02-01
 *
 **/

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math;

public class Circle implements Shape
{  
   private double radius;
   private Point position;
   private Color color;
   private boolean filled;
   
   public Circle(double radius, Point position, Color color, boolean filled)
   {
      this.radius = radius;
      this.position = position;
      this.color = color;
      this.filled = filled;
   }

   public double getArea() {
      double area = Math.PI*radius*radius;
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
      position.x += point.x;
      position.y += point.y;
   }

   public double getRadius() {
      return radius;      
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public Point getPosition() {
      return position;     
   }
   
   public boolean equals(Object other) {
      if (other == null) {
         return false;}
      if (this.getClass() != other.getClass()) {
         return false;}

      Circle c = (Circle)other;
      
      return radius == c.radius && position.equals(c.position) && color.equals(c.color) && filled == c.filled;
   }
      
}
