package Practice_Group1;
//Описать класс «Vector3d» (т. е., он должен описывать вектор в трехмерной,
//декартовой системе координат). В качестве свойств этого класса возьмите
//координаты вектора. Для этого класса реализовать методы сложения, скалярного и
//векторного произведения векторов. Создайте несколько объектов этого класса и
//протестируйте их.
import java.util.Scanner;

    public class Group1_task3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите какое кол-во трехмерных векторов вы хотите создать:");
            int amountOfVectors3D = scan.nextInt();
            OriginVector3D [] arr = new OriginVector3D[amountOfVectors3D];
            for (int index = 0; index < amountOfVectors3D; index++) {
                System.out.println("Введите кординату x точки начала вектора:");
                double x_begin = scan.nextDouble();
                System.out.println("Введите кординату y точки начала вектора:");
                double y_begin = scan.nextDouble();
                System.out.println("Введите кординату z точки начала вектора:");
                double z_begin = scan.nextDouble();
                System.out.println("Введите кординату x точки конца вектора:");
                double x_end = scan.nextDouble();
                System.out.println("Введите кординату y точки конца вектора:");
                double y_end = scan.nextDouble();
                System.out.println("Введите кординату z точки конца вектора::");
                double z_end = scan.nextDouble();
                arr[index] = movedToOrigin(x_begin,y_begin,z_begin,x_end,y_end,z_end);
                System.out.println("Ваш вектор в масиве под номером:" + index);
            }
            System.out.println("выбирите первый вектор для проведения операции:");
            int firstVector=scan.nextInt();
            System.out.println("выберите второй векктор для операции:");
            int secondVector=scan.nextInt();
            System.out.println("Выберите действие, которое желаете провести с векторами:\n" +
                    "1-сложение векторов\n" +
                    "2-скалярное произведение векторов\n" +
                    "3-векторное произведение векторов\n");
            int operation=scan.nextInt();
            switch (operation){
                case(1):
                    arr[firstVector].additionVector3D(arr[secondVector]);
                case(2):
                    arr[firstVector].dotProductVector3D(arr[secondVector]);
                case(3):
                    arr[firstVector].vectorProductVector3D(arr[secondVector]);
            }


        }
        public static OriginVector3D movedToOrigin(double x_begin, double y_begin, double z_begin,
                                                   double x_end, double y_end, double z_end){
            double x=x_end-x_begin;
            double y=y_end-y_begin;
            double z=z_end-z_begin;
            return new OriginVector3D(x,y,z);
        }
    }

class OriginVector3D{
    double x;
    double y;
    double z;
    OriginVector3D( double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void additionVector3D(OriginVector3D a) {
        double sumX=x+a.x;
        double sumY=y+a.y;
        double sumZ=z+a.z;
        System.out.println("Результирующий вектор:\nX="+sumX+" Y="+sumY+" Z="+sumZ);
    }

    void dotProductVector3D(OriginVector3D a) {
        double dotProduct=(x*a.x)+(y*a.y)+(z*a.z);
        System.out.println("Скалярное произведение данных векторов="+dotProduct);
         }

    void vectorProductVector3D(OriginVector3D a) {
        double vectorProductX=(y*a.z)-(z*a.y);
        double vectorProductY=(z*a.x)-(x-a.z);
        double vectorProductZ=(x*a.y)-(y-a.x);
        System.out.println("Результирующий вектор векторного произведения:\nX="+vectorProductX+"Y="
                +vectorProductY+"Z="+vectorProductZ);
        }
    }

