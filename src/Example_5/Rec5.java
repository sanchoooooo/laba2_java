package Example_5;

public class Rec5 {
    public static int f(int n) {
        if (n==0) { //повернення значення змінної при 0
            return 0;
        }
        else if (n==1) {//повернення значення змінної при 1
            return 1;
        }
        else return f(n-2)+f(n-1); //повернення значення змінної в інших випадках
    }

    public static void main(String[] args) {
        System.out.println("Fibonachi = " + f(20)); //вивід інформації, виклик f
    }
}
