package Practice_Group1.task2_Triangle;
//Описать класс «Triangle». В качестве свойств возьмите длины сторон
//треугольника. Реализуйте метод, который будет возвращать площадь этого
//треугольника. Создайте несколько объектов этого класса и протестируйте их.
import java.util.Scanner;

    public class Group1_task2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите какое кол-во екземпляров треугольника вы хотите создать:");
            int amountOfTriangles = scan.nextInt();
            Triangle[] arr = new Triangle[amountOfTriangles];
            for (int index = 0; index < amountOfTriangles; index++) {
                System.out.println("Введите первую сторону треугольника:");
                double side1 = scan.nextDouble();
                System.out.println("Введите вторую сторону треугольника:");
                double side2 = scan.nextDouble();
                System.out.println("Введите третью сторону треугольника:");
                double side3 = scan.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                arr[index] = triangle;
                System.out.println("Ваш треугольник в масиве под номером:" + index);
            }
            System.out.println("Введите номер треугольника который хотите проверить на существование " +
                    "и если он существует, то вы узнаете его площадь");
            int numberOfTtriangle = scan.nextInt();
            arr[numberOfTtriangle].existanceAndSqareofTriangle();

        }
    }
class Triangle {
    double side1;
    double side2;
    double side3;
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void existanceAndSqareofTriangle() {
        if (((side1 + side2) > side3) && ((side2 + side3) > side1) && ((side1 + side3) > side2)){
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double square = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        System.out.println("Данный треугольник существует.Площадь данного треугольника:" + square);
        }
        else{
            System.out.println("Данный треугольник не существует, его площадь подсчитать невозможно");
        }
    }
}
