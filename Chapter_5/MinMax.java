package Chapter_5;

public class MinMax {

    public static void main (String args[]){

        int nums[] = {1, 5, 6, 10, -4, 7, 2};
        int min, max;

        min = max = nums[0];
        for (int x: nums){
            if (x > max) max = x;
            if (x < min) min = x;
        }

        System.out.println("Min = " + min + "\nMax = " + max);
    }

}
