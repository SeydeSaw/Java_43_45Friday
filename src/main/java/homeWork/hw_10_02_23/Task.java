package homeWork.hw_10_02_23;

public class Task {
/*todo hw_10_02_2023
    Создать три класса:
        а) Фирма (с полем Название).
        б) Отдел (с полями Название, Количество сотрудников, Фирма)
        в) Сотрудник (с полями ФИО, Должность, Оклад, Отдел).
    В этом пункте Вам необходимо придумать логичные и правильные
    (с точки зрения именования классов и переменных в Java) названия классов,
    всех полей. Подберите правильные, на Ваш взгляд, типы данных.
    Расставьте нужные модификаторы доступа. Создайте сеттеры и геттеры,
    конструкторы.
        Предположим, что все сотрудники делятся на два типа:
        Штатный сотрудник и Сотрудник по контракту.
        Реализовать этот пункт с помощью наследования.
     */
    //вызываем всё созданное ранее на консоль:
public static void main(String[] args) {
    //осздаём экзэмпляры классов:
    Company apple = new Company("Apple");
    Department security = new Department("Security", 66, apple);
    Employee john = new Employee("John", "operator", 4000, security);

    apple.setName("Apple");
    System.out.println(john.getDepartment().getCompany().getName());

    Department develop = new Department("Develop", 65, new Company("IBM"));

    }
}