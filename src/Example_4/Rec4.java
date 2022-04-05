package Example_4;

public class Rec4 {
    public static int fact(int n) {
        int result; //об'явлення змінної
        if (n==1)
            return 1; //при значенні змінної 1-повертається результат 1
        else { //в іншому випадку виконується обчислення
            result=fact(n-1)*n;
            return result; //повернення результату
        }
    }
    public static void main(String[] args) {
        System.out.println("Factorial = " + fact(3)); //вивід інформації, виклик fact
    }
}

