/** 
 *  Work Space Class
 *
 *  @ Alexandra Gata
 *  @ Project02
 *  @ CPE102-01
 *
 **/

import java.util.ArrayList;
import java.awt.*; 

public class WorkSpace
{ 
   private ArrayList<Shape> objectList;

   public WorkSpace(){
     objectList = new ArrayList<Shape>(); 
   }

   public void add(Shape shape) {
      if (shape instanceof Shape) {
         objectList.add(shape); }
   }

   public Shape remove(int index) {
      if (index < 0 || index > size()){
         return null;
      }
         return objectList.remove(index);
   }

   public Shape get(int index) {
      return  objectList.get(index);  
   }

   public int size() {
      return objectList.size();
   }

   public ArrayList<Circle> getCircles() {
      ArrayList<Circle> circleList = new ArrayList<Circle>(); 
      for (int i = 0; i < objectList.size(); i++) {
         if (objectList.get(i) instanceof Circle) {
            circleList.add((Circle)objectList.get(i));
         }
      }
      return circleList;
   }

   public ArrayList<Rectangle> getRectangles() {
      ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();
      for (int i = 0; i < objectList.size(); i ++) {
         if (objectList.get(i) instanceof Rectangle) {
            rectangleList.add((Rectangle)objectList.get(i));
         }
      }
      return rectangleList;
   }

   public ArrayList<Triangle> getTriangles() {
      ArrayList<Triangle> triangleList = new ArrayList<Triangle>();
      for(int i = 0; i < objectList.size(); i++) {
         if (objectList.get(i) instanceof Triangle) {
            triangleList.add((Triangle)objectList.get(i));
         }
      }
      return triangleList;
   }

   public ArrayList<ConvexPolygon> getConvexPolygons(){
      ArrayList<ConvexPolygon> convexpolygonList = new ArrayList <ConvexPolygon> ();
      for (int i = 0; i < objectList.size(); i++) {
         if (objectList.get(i) instanceof ConvexPolygon) {
            convexpolygonList.add((ConvexPolygon)objectList.get(i));
         }
      }
      return convexpolygonList;
   }

   public ArrayList<Shape> getShapesByColor(Color color) {
      ArrayList<Shape> shapesByColorList = new ArrayList<Shape>(); 
      for (int i =0; i < objectList.size(); i++) {
         if (objectList.get(i).getColor().equals(color)) {
            shapesByColorList.add(objectList.get(i));}     
      }
      return shapesByColorList;
   }

   public double getAreaOfAllShapes() {
      double total = 0;
      for (int i =0; i < objectList.size(); i++) {
          double val = objectList.get(i).getArea();
          total += val;  
      }
      return total;
   }
}

