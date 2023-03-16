package lessons._10_02_23._17_02_23;

public class C extends A{
    @Override
    public void method() {
        super.method();//наследует метод родителя(класс А)
        System.out.println("В методе C method() класса C");//создан свой метод в классе С

    }
}
