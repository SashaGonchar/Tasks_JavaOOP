//1) Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
//Наделить его свойствами и методами. Создать несколько экземпляров объектов
//этого класса. Использовать эти объекты.

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
            Cat cat=new Cat("blue", 3.1, 9, 1.25,"miyyyyyyyyauuuuuu");
            cat.print_info();
            cat.say_miyau();
            Cat cat2=new Cat("grey", 6.5, 3, 1.5, "mAu");
            cat2.print_info();
            cat2.say_miyau();
    }
}