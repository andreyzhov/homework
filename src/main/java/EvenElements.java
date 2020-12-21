public class EvenElements {
    private static int array[] = {1, 2, 3, 20, 21, 22, 26, 32, 67, 24, 25, 30, 33, 99};
    public static void main(String[] args) {
        sumEven();
        amountEvenElemnt();
    }
    public static void sumEven(){
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 20 && array[i] <= 30 && array[i] % 2 == 0){
                even += array[i];
            }
        }
        System.out.println(even);
    }
    public static void amountEvenElemnt(){
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 20 && array[i] <= 30 && array[i] % 2 == 0) {
                amount++;
            }
        }
        System.out.println(amount);
    }
}
