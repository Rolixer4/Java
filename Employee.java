package HW;

public class Employee {
    String FIO;
    String jobTitle;
    String email;
    int phone;
    int salary;
    int age;

    public Employee(String FIO, String jobTitle, String email, int phone, int salary, int age) {
        this.FIO = FIO;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void statusEmployee() {
        System.out.printf("Сотрудник %s с должностью %s имеет данные: email: %s номер телефона: %d зарплата: %d возраст: %d%n ", FIO, jobTitle, email, phone, salary, age);
    }
}
