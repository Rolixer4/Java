package HW;

public class HW6 {
    public static void main(String[] args) {
        Dog boris = new Dog();
        Cat billy = new Cat();
        boris.run(350);
        billy.run(120);
        boris.swim(400);
        billy.swim(2);
    }
}

abstract class animal {
    abstract void run (int distance);
    abstract void swim (int distance);
}

class Cat extends animal {
    final int MAX_RUN = 200;
    final int MAX_SWIM = 0;

    @Override
    void run(int distance) {
        if (distance > 0 && distance <= MAX_RUN) {
            System.out.printf("����� ��������� %d ������%n", distance);
        } else {
            System.out.println("����� ������� �� ������");
        }
    }

    @Override
    void swim(int distance) {
        if (distance > MAX_SWIM || distance <= MAX_SWIM) {
            System.out.println("����� �� �������");
        }
    }
}

class Dog extends animal {
    final int MAX_RUN = 500;
    final int MAX_SWIM = 10;

    @Override
    void run(int distance) {
        if (distance > 0 && distance <= MAX_RUN) {
            System.out.printf("������ ��������� %d ������%n", distance);
        } else {
            System.out.println("������ ������� �� ������");
        }
    }

    @Override
    void swim(int distance) {
        if (distance > 0 && distance <= MAX_SWIM) {
            System.out.printf("������ �������� %d ������%n", distance);
        } else {
            System.out.println("������ ������� �� �������");
        }
    }
}


