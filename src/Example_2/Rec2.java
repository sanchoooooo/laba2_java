package Example_2;

public class Rec2 {
    public static void m(int x) { //функція
        if ((2*x+1)<20){ //обчислюється результат, поки буде менше 20
            m(2*x+1); //обчислюємий вираз
        }
        System.out.println("x = " + x); //вивід інформації
    }
    public static void main(String[] args) {
        m(1); //виклик функції з вхідним значенням 1
    }
}

