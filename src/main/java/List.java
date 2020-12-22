public class List {
    public static void main(String[] args) throws Exception {
        int[] a = new int[]{1,2,3};
        for (int i = a.length -1; i>=0; i--){
            System.out.println(a[i]);
        }
        for (int i = 0; i <= a.length; i++) {
            System.out.println(a[i]);
        }
    }
}