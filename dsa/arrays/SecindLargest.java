
class SecondLargest {
    public int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else {
                if (num > secondLargest && num != firstLargest) {
                    secondLargest = num;
                }
            }
        }
        return secondLargest;
    }
}