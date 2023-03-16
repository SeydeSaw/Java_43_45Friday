package lessons._10_02_23;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(1.2, 2.3, 4.7);
        b1.print();//вызываем метод
        b1.setWidth(1.5);//меняем значение переменной
        b1.print();

        Box b2 = new Box(8,9,5);
        b2.print();

        Box b3 = b1;
        b3.print();

        B b = new C();
        C c = new C();
    }
}