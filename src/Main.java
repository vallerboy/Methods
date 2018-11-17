public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.add(5, 5));
    }
    //----------------------------------------


    public int add(int a, int b){
        return  a + b;
    }

    public int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Divide by 0");
        }
        return a / b;
    }
}
