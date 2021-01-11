package Practice_Group1.task1_Cat;
//1) Описать класс «Practice_Group1.task1_Cat.Cat» (в качестве образца можно взять домашнего питомца).
//Наделить его свойствами и методами. Создать несколько экземпляров объектов
//этого класса. Использовать эти объекты.
import java.util.Scanner;

class Cat{
    String color;
    double weight;
    int year;
    double hunger;
    String miyau;
        Cat(String color, double weight,int year, double hunger,String miyau){
            this.color=color;
            this.weight=weight;
            this.year=year;
            this.hunger=hunger;
            this.miyau=miyau;
        }

        void print_info(){
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
        System.out.println("Year car: "+year);
        }

       void say_miyau(){
        System.out.println(miyau);
    }

    public static void main (String[] args){
            Scanner scan=new Scanner(System.in);
            System.out.println("введите количество котов для создания:");
            int amount_of_cat=scan.nextInt();
            Cat [] arr = new Cat[amount_of_cat];
                        for (int zero = 0; zero<amount_of_cat;zero++) {
                            System.out.println("Введите цвет вашего котика");
                            String color = scan.next();
                            System.out.println("Введите вес вашего котика");
                            double weight = scan.nextDouble();
                            System.out.println("Введите возраст вашего котика");
                            int year = scan.nextInt();
                            System.out.println("Введите коеф прожорливости вашего котика");
                            double hunger = scan.nextDouble();
                            System.out.println("Введите как ваш котик мяукает");
                            String miyau = scan.next();
                            Cat cat = new Cat(color, weight, year, hunger, miyau);
                            arr [zero] = cat;
                            System.out.println("Ваш котик под номером:"+zero);
                }
                System.out.println("про скольких котиков вы желаете посмотреть информацию? Введите число:");
                int catInfoIteration=scan.nextInt();
                for (int zero=0; zero<catInfoIteration; zero++){
                    System.out.println("Введите номер котика про которого хотите посмотреть информацию:");
                    int numberOfCat=scan.nextInt();
                        arr[numberOfCat].print_info();
                    arr[numberOfCat].say_miyau();
                        }
                }
        }