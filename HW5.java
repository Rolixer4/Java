package HW;

public class HW5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("�������� ������� ����������", "���������", "vvv@gmail.com", 888888888, 50000, 30);
        employees[1] = new Employee("������ ���� ��������", "��������", "ppp@gmail.com", 899888888, 150000, 45);
        employees[2] = new Employee("������ ���� ��������", "������� �� ������������", "iii@gmail.com", 888888887, 60000, 23);
        employees[3] = new Employee("����������� ��������� �������������", "����������� �������", "aaa@gmail.com", 888888886, 70000, 42);
        employees[4] = new Employee("�������� ������ ����������", "��������", "mmm@gmail.com", 888888885, 50000, 44);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
            employees[i].statusEmployee();
            }
        }
    }
}
