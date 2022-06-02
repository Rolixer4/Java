package HW;

public class HW5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Васильев Василий Васильевич", "Бухгалтер", "vvv@gmail.com", 888888888, 50000, 30);
        employees[1] = new Employee("Петров Петр Петрович", "Директор", "ppp@gmail.com", 899888888, 150000, 45);
        employees[2] = new Employee("Иванов Иван Иванович", "Инженер по тестированию", "iii@gmail.com", 888888887, 60000, 23);
        employees[3] = new Employee("Александров Александр Александрович", "Технический инженер", "aaa@gmail.com", 888888886, 70000, 42);
        employees[4] = new Employee("Максимов Максим Максимович", "Аналитик", "mmm@gmail.com", 888888885, 50000, 44);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
            employees[i].statusEmployee();
            }
        }
    }
}
