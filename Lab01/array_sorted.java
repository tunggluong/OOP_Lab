//6.5
import java.util.Arrays;
public class array_sorted {
    public static void main(String[] args){
        int[] nums={2, 0, 2, 2, 5, 0, 3, 1};
        Arrays.sort(nums);
        System.out.println("The sorted array is: "+Arrays.toString(nums));
        int total = Arrays.stream(nums).sum();
        System.out.println("The sum of array is: "+total);
        double average = Arrays.stream(nums).average().orElse(0.0);
        System.out.println("The average of array is: "+average);
    }
}
