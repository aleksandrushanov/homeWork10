public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Александр" ;
        String middleName= "Евгеньевич" ;
        String lastName= "Ушанов";
        String fullName= lastName + " " + firstName + " " + middleName ;
        System.out.println("ФИО сотрудника - " + fullName);/// задание 1
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpper);//// задание 2
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName2);//ЗАдание 3



    }
}