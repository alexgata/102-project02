/**
 * Convex Polygon Class
 *
 * @ Alexandra Gata
 * @ Project02
 * @ CPE02-01
 *
 * */

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math;

public class ConvexPolygon implements Shape
{
   private Point[] vertices;
   private Color color;
   private boolean filled;

   public ConvexPolygon(Point[] vertices, Color color, boolean filled) {
      this.vertices = vertices;
      this.color = color;
      this.filled = filled; 
   }

   public double getArea() {
      int listSize = vertices.length;
      double first = 0;
      double second = 0;
      for (int i = 0; i < listSize-1; i++) {
         double sum = (vertices[i].x)*(vertices[i+1].y);
         first += sum;

      }
      
      double lastElement = (vertices[listSize-1].x)*(vertices[0].y);
      first += lastElement;

      for(int i = 0; i < listSize-1; i++) {
         double sum2 = (vertices[i+1].x)*(vertices[i].y);
         second += sum2;
      }

       
      double lastElement2 = (vertices[0].x)*(vertices[listSize-1].y);
         second += lastElement2;
 
      double area = (first-second)/(2);
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
      int listSize = vertices.length;
      for (int i = 0; i < listSize; i++) {
        vertices[i].x += point.x;
        vertices[i].y += point.y;
      }
   }

   public Point getVertex(int vertex) {
      return vertices[vertex];
   }

   public void setVertex(int index, Point point) {
      this.vertices[index].x = point.x;
      this.vertices[index].y = point.y;
   }

   public boolean equals(Object other) {
      if (other == null) {
         return false;}
      if (this.getClass() != other.getClass()) {
         return false;}

      ConvexPolygon c  = (ConvexPolygon)other;

      if (!color.equals(c.color)) {
         return false;}
      if (!filled == c.filled) {
         return false;}
      for (int i = 0; i < vertices.length; i++) {
         if (!(c.getVertex(i)).equals(getVertex(i))){
            return false;}
      }

      return true;
   }

}
