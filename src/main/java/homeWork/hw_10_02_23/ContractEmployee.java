package homeWork.hw_10_02_23;

// класс сотрудника по контракту, который является наследником класса сотрудник
public class ContractEmployee extends Employee{
    //создание конструктора для сотрудника:
    public ContractEmployee(String fullName, String position, double salary, Department department) {
        super(fullName, position, salary, department);// через super обращаемся к родительскому классу
    }
}