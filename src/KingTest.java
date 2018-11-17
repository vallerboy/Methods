import java.util.Arrays;

public class KingTest {
    public static void main(String[] args) {
        int[] ints = {1,1,1,1,1,2,2,2,3,3};
        Arrays.sort(ints);

        int candidate = ints[ints.length / 2  + (ints.length % 2 == 0 ? 1 : 0)];
        int sum = 0;

        for (int anInt : ints) {
            if(anInt == candidate){
                sum++;
            }
        }

        if(sum >= ints.length){
            System.out.println("Mamy króla: " + candidate);
        }else{
            System.out.println("Brak");
        }
    }
}
