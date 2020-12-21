public class RemoveMinMax {
    private static int array[] = {1, 7, 2, 6, 39, 0, 55, 90, 65, 324, 42, 3};
    public static int min = array[0];
    public static int max = array[0];
//    private static int array2[] = new a

    public static int[] removeMaxAndMin(int[] array) {
        int[] result = new int[array.length-2];
        int imax = 0;
        int imin = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        int j = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (i != imax)
            {
                result[j++]=array[i];
            }
            else if (i != imin){
                result[j++]=array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //removeMin();
        removeMaxAndMin(array);
    }
   /* public static void removeMin(){
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }*/
}
