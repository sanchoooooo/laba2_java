package Example_1;

public class Rec1 {
    public static void m(int x) { //функція
        System.out.println("x = " + x); //вивід інформації
        if ((2*x+1)<20){ //обчислюється результат, поки буде менше 20
            m(2*x+1); //обчислюємий вираз
        }
    }
    public static void main(String[] args) {
        m(1); //виклик функції з вхідним значенням 1
    }
}
