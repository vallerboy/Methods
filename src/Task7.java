public class Task7 {
    public static void main(String[] args) {
        System.out.println(isCube(9));
        System.out.println(NWD(6666,12));
        System.out.println(divides(5));
        System.out.println(maxDividers());
    }


    public static boolean isSquare(double a){
        return (Math.sqrt(a) == (int) Math.sqrt(a));
    }

    public static boolean isCube(double a){
        return Math.cbrt(a) == (int) Math.cbrt(a);
        //Math.pow(a, 1/3)
    }

    public static int NWD(int a, int b){
        while (a != b){
            if(a > b){
                a -= b;
            }else if(a < b){
                b -= a;
            }
        }
        return a;
    }

    public static int divides(int a){
        if(a == 1){
            return 1;
        }

        int sumDividers = 2;
        for (int i = 2; i <= a / 2; i++) {
            if(a % i == 0){
                sumDividers++;
            }
        }
        return sumDividers;
    }

    public static int maxDividers(){
       int sumNumber = 0;
       int sumDividers = 0;

        for (int i = 2; i <= 10000; i++) {
             if(sumDividers < divides(i)){
                 sumNumber = i;
                 sumDividers = divides(i);
             }
        }

        return sumNumber;
    }
}
