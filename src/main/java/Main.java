public class Main {
    public static void main(String[] args) {
        int result = sum(10,10);
        int resultDivision  = division(20,2);
        System.out.println(result);
        System.out.println(resultDivision);
    }

    static int sum(int a, int b){
        return  a+b;
    }

    static int division(int a, int b){
        return  a-b;
    }
}
