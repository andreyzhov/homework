public class Min {
   private static int a[] = {1, 2, 7, 0, 27, 45, -7, 10, -3};
   public static int min = a[0];
    public static void main(String[] args) {
        minNumber();
        index();
    }
    public static void minNumber() {
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
    public static void index(){
        int indexMin = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<a[indexMin]){
                indexMin = i;
            }
        }
        System.out.println(indexMin);
    }
}
