package homeWork.hw_10_02_23;


public class Department {
    private String name;// поле для хранения названия отдела
    private int numberOfEmployees;// поле для хранения количества сотрудников отдела
    private Company company;// поле для хранения фирмы, к которой принадлежит отдел

    public Department() {// конструктор по умолчанию
    }

    // конструктор с параметрами:
    public Department(String name, int staffNumber, Company company) {
        this.name = name;
        this.numberOfEmployees = staffNumber;
        this.company = company;
    }

    public String getName() {// геттер для получения названия отдела
        return name;
    }

    public void setName(String name) {// сеттер для установки названия отдела
        this.name = name;
    }

    public int getStaffNumber() {// геттер для получения количества сотрудников отдела
        return numberOfEmployees;
    }

    public void setStaffNumber(int staffNumber) {// сеттер для установки количества сотрудников отдела
        this.numberOfEmployees = staffNumber;
    }

    public Company getCompany() {// геттер для получения фирмы, к которой принадлежит отдел
        return company;
    }

    public void setCompany(Company company) {// сеттер для установки фирмы, к которой принадлежит отдел
        this.company = company;
    }
}