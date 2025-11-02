public class AllZeroTOEnd {
    public static void moveZerosToEnd(int[] arr){
        int lastNonZeroFoundAt = 0;

        for(int current =0;current<arr.length;current++){
            if(arr[current] !=0){
                int temp = arr[lastNonZeroFoundAt];
                arr[lastNonZeroFoundAt] = arr[current];
                arr[current] = temp;
                lastNonZeroFoundAt++;
        }
        lastNonZeroFoundAt++;            
        

    }
}
}