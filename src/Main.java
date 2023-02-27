public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {

        String fistName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + fistName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {

        String fullName = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —  " + upperFullName);
    }

    public static void task3() {
        String fullName = "Семёнов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace("ё", "е"));
    }

}