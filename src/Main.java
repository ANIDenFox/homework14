public class Main {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(recFactorial(12));
    }
    public static int getFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
    public static int recFactorial(int num) {
        if (num==0)
            return 1;
        return num*recFactorial(num-1);
    }
}