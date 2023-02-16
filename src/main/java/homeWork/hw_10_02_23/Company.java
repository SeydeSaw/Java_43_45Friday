package homeWork.hw_10_02_23;

public class Company {
    private String name;// поле для хранения названия фирмы


    public Company() {// конструктор по умолчанию
    }

    public Company(String name) {// конструктор с параметрами
        this.name = name;
    }

    public String getName() {// геттер для получения названия фирмы
        return name;
    }

    public void setName(String name) {// сеттер для установки названия фирмы
        this.name = name;
    }
}