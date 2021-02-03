package Practice_Group1.task4_Phone;
//Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
//класс Network (сеть мобильного оператора). Телефон должен иметь метод
//регистрации в сети мобильного оператора. Также у телефона должен быть метод call
//(номер другого телефона), который переберет все телефоны, зарегистрированные в
//сети. Если такой номер будет найден, то осуществить вызов, если нет - вывести
//сообщение об ошибочности набранного номера

    public class CellPhone {

        public static void main(String[] args) {
            Network lifeCell = new Network();
            lifeCell.setName("Lifecell");

            Network kievStar = new Network();
            kievStar.setName("Kievstar");

            Phone myPhone = new Phone(380931234560L);
            myPhone.registerPhone(lifeCell);

            Phone phone1 = new Phone(380931234561L);
            phone1.registerPhone(lifeCell);

            Phone phone2 = new Phone(380931234562L);
            phone2.registerPhone(lifeCell);

            Phone phone3 = new Phone(380931234563L);
            phone3.registerPhone(lifeCell);

            Phone phone4 = new Phone(380973809798L);
            phone4.registerPhone(kievStar);

            displayPhoneList(lifeCell);
            displayPhoneList(kievStar);

            String result = myPhone.call(phone1.getNumber());
            System.out.println(result);

            String result1 = myPhone.call(phone4.getNumber());
            System.out.println(result1);

        }

        public static void displayPhoneList(Network network){
            long[] phoneListTmp = network.getPhoneList();
            System.out.println(network.getName());
            for(long k : phoneListTmp){
                if(k == 0){
                    break;
                }
                System.out.println(k);
            }
        }
    }