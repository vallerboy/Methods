public class BinaryGap {
    public static void main(String[] args) {
        int[] data = {1,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};


        System.out.println(binaryGap(data));
    }

    public static int binaryGap(int[] data){
        boolean weAreLookingForZero = false;
        int maxSumOfZero = 0;
        int localSumOfZero = 0;

        for (int datum : data) {
            if(datum == 1){
                if(weAreLookingForZero){
                    if(localSumOfZero > maxSumOfZero){
                        maxSumOfZero = localSumOfZero;
                    }
                    weAreLookingForZero = false;
                }else{
                    localSumOfZero = 0;
                    weAreLookingForZero = true;
                }
            }else{
                localSumOfZero++;
            }
        }

        return maxSumOfZero;
    }
}
