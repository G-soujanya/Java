import java.lang.*;

class MethodPractice {
    int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String arg[]) {
        int a = 10, b = 15;
        MethodPractice mp=new MethodPractice();
        System.out.println(mp.max(a, b));
    }
}
