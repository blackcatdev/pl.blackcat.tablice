public class SumOfTwoElements {
     private static int sum(int[] numbers){
        return numbers[0] + numbers[1];

    }

    public static void main(String[] args) {
        int[] numbers = new int[] {40,45};
        System.out.println(sum(numbers));
    }
}
