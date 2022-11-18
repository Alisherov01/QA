import java.util.Scanner;

public class EmployeeMenu {
    public static void main(Employee employee) {
        Scanner in = new Scanner(System.in);
        Employee employeeApp = new Employee("Vera", 11000, "Tester");
        Employee employeeSam = new Employee("Dima", 21000, "Director");
        Employee employeeXia = new Employee("Egor", 31000, "Gen. Director");
        while (true) {
            System.out.println("1) Вывод информации о сотруднике");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {//Реализуйте вывод информации о сотруднике} else if (command == 0) {break;
            System.out.println("Работник компании Apple - " + employeeApp.getName() + "  | " + employeeApp.getSalary() + " | " + employeeApp.getPositionAtWork());
            System.out.println("Работник компании Samsung - " + employeeSam.getName() + "  | " + employeeSam.getSalary() + " | " + employeeSam.getPositionAtWork());
            System.out.println("Работник компании Xiaomi - " + employeeXia.getName() + "  | " + employeeXia.getSalary() + " | " + employeeXia.getPositionAtWork());}
            else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}
