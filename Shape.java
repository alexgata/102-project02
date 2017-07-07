/*
 * Shape Interface
 *
 * @ Alexandra Gata
 * @ Project02
 * @ CPE102-01
 */
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public interface Shape
{
   /**
    * Method calculates area of specific shape.
    * @return area
    */

   double getArea();
   
   /** 
    * Method retrieves color of the specified shape.
    * @return the color of the shape
    */

   Color getColor();
   
   / **
    * Method sets the color of specified shape.
    * @param color is the object color that the shape is to be set to
    */
  
   void setColor(Color color);
   
   /**
    * Method checks if the shape is filled.
    * @return true or false if the shape is filled
    */

   boolean getFilled();
   
   /**
    * Method sets the shape to be filled.
    * @param filled passes through the boolean of whether the shape is already filled or not
    */

   void setFilled(boolean filled);
   
   /** Method moves the shape to another point.
    * @param point is the location where the shape is to move to.
    */

   void move(Point point);
}
