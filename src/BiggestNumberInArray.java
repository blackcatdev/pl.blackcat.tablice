public class BiggestNumberInArray {
    private static int biggestNumber(int[] numbers)
    {
        int biggest = numbers[0];
        if (numbers[1]>biggest)
            biggest = numbers[1];
        if (numbers[2]>biggest)
            biggest = numbers[2];

        return biggest;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {-100,25,0};
        System.out.println(biggestNumber(numbers));

    }

}


