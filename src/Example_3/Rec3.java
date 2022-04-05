package Example_3;

public class Rec3 {
    private static int step=0; //присвоєння змінній 0

    public static void m(int x) {
        space(); //виклик space
        System.out.println(""+x+"->"); //вивід інформації
        step++; //збільшення значення змінної на 1
        if ((2*x+1)<20) { //обчислюється результат, поки буде менше 20
            m(2*x+1); //обчислюємий вираз
        }
        step--; //зменшення значення змінної на 1
        space(); //виклик space
        System.out.println(""+x+"<-"); //вивід інформації
    }

    public static void space() {
        for (int i=0; i<step; i++) {
            System.out.print(" "); //кількість відступів=значенню step
        }
    }

    public static void main(String[] args) {
        m(1); //виклик m
    }
}

