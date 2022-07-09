public class Main {
    public static void main(String[] args) {
        int result = sum(10,10);
        int resultDivision  = division(20,2);
        System.out.println(result);
        System.out.println(resultDivision);
        System.out.println(multiply(3,3));
        int resultDevide = devide(9,3);
        System.out.println(resultDevide);

        Test test = new Test();
    }

    static int sum(int a, int b){
        return  a+b;
    }

    static int division(int a, int b){
        return  a-b;
    }

    static int multiply(int a,int b){
        return a*b;
    }


    static int devide(int a, int b){
        return a/b;
    }

    void boo(){
        System.out.println("Do something");
    }



}


class Test {

}
