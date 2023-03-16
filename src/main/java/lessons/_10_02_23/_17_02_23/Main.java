package lessons._10_02_23._17_02_23;

public class Main {
    public static void main(String[] args) {
        //создаем объект класса:
        A a = new A();
        B b = new B();//b объект класса B
        C c = new C();

        //вызываем методы:
        a.method();
        b.method();
        c.method();

        System.out.println("---  Вызываем методы переменной r  ---");

        A r;//получить ссылку на объект типа А
        r = a;//переменная r ссылает на объект типа А
        r.method();//вызываем метод
        r = b;//переменная r ссылается на объект типа B
        r.method();//вызывем метод
        r = c;
        r.method();

        System.out.println("---  вызываем метод класса D  --");

        D d = new D();
        //r = d;//ошибка. Не соответствие типа! нет наследования
        d.method();

        System.out.println("****  вызываем методы массива  ****");

        A[] arrayA = {a,b,c};//в массив А можем положить объекты классао родителя и наследников
        for (int i = 0; i < arrayA.length; i++) {//проходим по массиву
            arrayA[i].method();//вызываем метод каждого объекта класса А
        }

        //C[] arrayC = {a,b,c};//ошибка

        System.out.println("___  Вызываем метод demo  ___");
        demo(a);
        demo(b);
        demo(c);

        System.out.println("___  Вызываем метод demo1  ___");
        demo1(c);

    }

    private static void demo(A a){//передаем объект родительского класса A и всех его наследников
        a.method();//вызываем метод

    }
    private static void demo1(C c){//передаем объект класса С
        c.method();//вызываем метод
    }


}
