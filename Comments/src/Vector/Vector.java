package Vector;

/** <b>Реализация геометрического вектора в R^2</b>
 *
 *
 * @author Kireeva Irina
 * @version 1.0
 * @since  2023-11-18
 */

public class Vector {
     private double x1 = 0.0;
     private double y1 = 0.0;
     private double x2 = 0.0;
     private double y2 = 0.0;

     public Vector(double x1, double y1, double x2, double y2) {
         this.x1 = x1;
         this.y1 = y1;
         this.x2 = x2;
         this.y2 = y2;
     }

    /**
     Возвращает 'x' координату начальной точки вектора
     * @return double
     */
     public double getX1() {
         return x1;
     }

    /**
     * Возвращает 'y' координату начальной точки вектора
     * @return double
     */
     public double getY1() {
         return y1;
     }

    /**
     *Возвращает 'x' координату конечной точки вектора
     * @return double
     */
     public double getX2() {
         return x2;
     }

    /**
     *Возвращает 'y' координату конечной точки вектора
     * @return double
     */
     public double getY2() {
         return y2;
     }


    /**
     *Изменяет 'x' координату начальной точки вектора
     */
     public void setX1(double x1) {
         this.x1 = x1;
     }

     /**
     Изменяет 'y' координату начальной точки вектора
     */
     public void setY1(double y1) {
         this.y1 = y1;
     }

    /**
     *Изменяет 'x' координату конечной точки вектора
     */
     public void setX2(double x2) {
         this.x2 = x2;
     }

    /**
     * Переопределенный метод класса Object
     * @return String
     */
     public void setY2(double y2) {
         this.y2 = y2;
     }

     /**
      * Высчитывает сумму векторов
      * @param v1 первый вектор
      * @param v2 второй вектор
      * @return вектор, который является суммой векторов v1 и v2
      */
     public static Vector sum(Vector v1, Vector v2) {
         return new Vector(v1.getX1() + v2.getX1(), v1.getY1() + v2.getY1(),
                 v1.getX2() + v2.getX2(), v1.getY2() + v2.getY2());
     }

     /**
      * вычисляет скалярное произведение векторов
      * и принимает на вход два обекта класса Vector.Vector.
      * @param v1 Первый объект класса Vector.Vector
      * @param v2 Второй объект класса Vector.Vector
      * @return double
      */
     public static double scal(Vector v1, Vector v2) {
         return v1.getX1() * v2.getX2() + v1.getY1() * v2.getY2();
     }

     /**
      * Высчитывает разность
      * @param v1 - первый вектор
      * @param v2 - второй вектор
      * @return вектор, который является разностью векторов v1 и v2
      */
     public static Vector diff(Vector v1, Vector v2) {
         return new Vector(v1.getX1() - v2.getX1(), v1.getY1() - v2.getY1(),
                 v1.getX2() - v2.getX2(), v1.getY2() - v2.getY2());
     }

     /**
      * Умножает вектор на число типа double.
      * @param v объект класса Vector.Vector
      * @param number число,на которое нужно умножить вектор
      * @return вектор, умноженный на данное число
      */
     public static Vector multiplyN(Vector v, double number) {
         return new Vector(v.x1 * number, v.y1 * number, v.x2 * number, v.y2 * number);
     }

     /**
      * Возвращает длину вектора
      * @return double
      */
     public double length() {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
     }

     /**
      * Переопределенный метод класса Object
      * @return String
      */
     @Override
     public String toString() {
         double x = x2 - x1;
         double y = y2 - y1;
         return "Координаты: " + x + " " + y;
     }
     public static void main(String[] args){
         Vector v1 = new Vector(1,2,3,4);
         Vector v2 = new Vector(3, 16, 26, 15);
         Vector v3 = new Vector(17,19,10,8);
         System.out.println(v1 + "\n" + v2 + "\n" + v3);
         System.out.println();
         System.out.println(Vector.multiplyN(v1, 6));
         System.out.println(Vector.scal(v1,v3));
         System.out.println(Vector.sum(v1,v3));
         System.out.println(Vector.diff(v3,v1));
         System.out.println(v1.length());
     }
 }