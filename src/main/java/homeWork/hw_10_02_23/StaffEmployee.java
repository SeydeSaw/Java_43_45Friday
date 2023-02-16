package homeWork.hw_10_02_23;
// класс штатного сотрудника, который является наследником класса сотрудник
public class StaffEmployee extends Employee{
    //создание конструктора для сотрудника:
    public StaffEmployee(String fullName, String position, double salary, Department department) {
        super(fullName, position, salary, department);// через super обращаемся к родительскому классу
    }
}
/*
Конструктор вызывает конструктор класса Employee с теми же параметрами.
Это позволяет инициализировать поля fullName, position, salary,
department в объекте StaffEmployee.
 */