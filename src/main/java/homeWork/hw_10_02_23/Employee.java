package homeWork.hw_10_02_23;

public class Employee {
    // Поля для ФИО, должности, оклада и отдела:
    private String fullName;
    private String position;
    private double salary;
    private Department department;//организуем связь между Department и Employee

    // Создание конструктора для сотрудника:
    public Employee(String fullName, String position, double salary, Department department) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {// метод получения ФИО
        return fullName;
    }

    public void setFullName(String fullName) {// метод установки ФИО
        this.fullName = fullName;
    }

    public String getPosition() {// метод получения должности
        return position;
    }

    public void setPosition(String position) {// метод установки должности
        this.position = position;
    }

    public double getSalary() {// метод получения оклада
        return salary;
    }

    public void setSalary(double salary) {// метод установки оклада
        this.salary = salary;
    }

    public Department getDepartment() {// метод получения отдела
        return department;
    }

    public void setDepartment(Department department) {// метод установки отдела
        this.department = department;
    }
}