import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class sum {
    //  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
 /*       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        if (year % 400 == 0){
            System.out.println("366");
        }
        else {
            if (year % 100 == 0){
                System.out.println("365");
            }
            else{
                if(year % 4 == 0){
                    System.out.println("366");
                }
                else {
                    System.out.println("365");
                }
            }
        }

    }*/
 /*   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    double t = Double.parseDouble(reader.readLine());
        if(t % 5 >= 0 && t % 5 < 3){
        System.out.println("зелёный");
    }
        else if (t%5 >= 3 && t % 5 < 4){
        System.out.println("жёлтый");
    }
        else {
        System.out.println("красный");
    }

}
}*/

    /*    public static void main (String args[]) {
            String str = new String("card4916400491851");
            String str2 = new String("56592ea813b4022c91389942689891c113cea1ff628eac18eb0c05eb224c6f0f5f1fc9edbf8cda2d6e1a08a7425caae3fbdb");
            String str3 = new String("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
            String str4 = new String("22222222222222222222222222222222222222222222aaaaaaa111111111111111111111111111122222222222222222222");
            System.out.println(str.length());
            System.out.println(str2.length());
            System.out.println(str3.length());
            System.out.println(str4.length());
        }
    }*/
 /*       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = 0;
        int e = 0;
        if (a > 0){
            d++;
        }
        if (a < 0){
            e++;
        }
        if (b > 0){
            d++;
        }
        if (b < 0){
            e++;
        }
        if (c > 0) {
            d++;
        }
        if (c < 0){
            e++;
        }
        System.out.println("количество отрицательных чисел: " + e);
        System.out.println("количество положительных чисел: " + d);
    }
}
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m = reader.readLine();
        //String x = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        while (n > 0) {
            System.out.println(m);
            n--;
        }
    }
}

        int s = 1, n = 1;
        while (s <= 10) {
            System.out.print("S");
            while (n < 10){
                n++;
                System.out.print("S");
            }
            s++;
            n=1;
            System.out.println("");
        }
    }
}
        int i=1,n=1;
        while(i<=10)
        {
            System.out.print(i+" ");
            while(n<=9)
            {
                n++;
                System.out.print(i*n+" ");
            }
            i++;
            n=1;
            System.out.println("");
        }
    }
}
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
            else;
        }
    }
}
        for (int i = 0; i < 9; i++) {
            System.out.print("8");
        }
        for (int i = 0; i < 11; i++) {
            System.out.println("8");
        }
    }
}
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }
}
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            System.out.print(8);
            for (int x = 1; x < n; x++){
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}
        for (int h = 0; h < 10; h++) {
            for (int w = 0; w < h; w++) System.out.print(8);
            System.out.println(8);
        }
    }
}
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a <= b && a >= c || a >= b && a <= c){
            System.out.println(a);
        }
        else if (a >= b && b >= c || a <= b && b <= c){
            System.out.println(b);
        }
        else if (c > a && c < b || c < a && c > b) {
            System.out.println(c);
        }
    }
}
        double a = 0;
        double b = 0;
        while (true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = Integer.parseInt(reader.readLine());
            if (sum == -1){
                break;
            }
            b++;
            a = a + sum;
        }
        System.out.println(a/b);
    }
}
        public class sum {
            public static void main(String[] args) {
                //напишите тут ваш код
                Calendar date = new GregorianCalendar();
                date.set(Calendar.DAY_OF_MONTH, 03);
                date.set(Calendar.MONTH, 07);
                date.set(Calendar.YEAR, 2020);
                System.out.println(date.get(Calendar.DAY_OF_MONTH) + " " + date.get(Calendar.MONTH) + " " + date.get(Calendar.YEAR));

public static void main(String[] args) {
    //напишите тут ваш код
    Man man = new Man ("Vasyl", 25, "Peremogy, 17");
    Man man2 = new Man ("Petro", 30, "Vasylkivska, 44");
    Woman woman = new Woman ("Nataly", 22, "Bandery, 28");
    Woman woman2 = new Woman ("Sara", 24, "Leskova, 5");
    System.out.println(man.name + " " + man.age + " " + man.address);
    System.out.println(man2.name + " " + man2.age + " " + man2.address);
    System.out.println(woman.name + " " + woman.age + " " + woman.address);
    System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
}

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;

    public Woman(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        }
    }
}
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //int sum = Integer.parseInt(reader.readLine());
        int x = 0;
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("сумма")) {
                System.out.println(sum);
                break;
            } else {
                x = Integer.parseInt(s);
                sum += x;
            }
        }
    }
}

    public static class Cat {

        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public Cat() {
        }

        public static void main(String[] args) throws Throwable {

            for (int i = 0; i < 1000000; i++) {

                Cat cat = new Cat();
                cat = null;//вот здесь первый объект становится доступен сборщику мусора
            }
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Объект Cat уничтожен!");
        }
    }
}
    public static void main(String[] args) {
        // напишите тут ваш код
        for (int i = 50000; i > 0; i--){
            Cat cat = new Cat();
            cat = null;
            Dog dog = new Dog();
            dog = null;
        }
        ///for (int x = 50000; x > 0; x--){

        ///}
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        String a = Integer.toString(x);
        int c = a.length();
        for (int i = 0; i < c; i++){
            if (x % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
            x = x / 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double index = weight / (height * height);
            if (index < 18.5){
                System.out.println("Недовес: меньше чем 18.5");
            }
            else if (index >= 18.5 && index < 25){
                System.out.println("Нормальный: между 18.5 и 25");
            }
            else if (index >= 25 && index < 30){
                System.out.println("Избыточный вес: между 25 и 30");
            }
            else {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] a = new int[10];
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i < a.length; i++){
            a[i] = Integer.parseInt(num.readLine());
        }
        for (int i = a.length -1; i>=0; i--){
            System.out.println(a[i]);
        }

    }
  */
   /* public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] a = new int[3];
        int even = 0;
        int odd = 0;
        BufferedReader citizen = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(citizen.readLine());
            if (i == 0 | i % 2 == 0){
                even += a[i];
            }
            else {
                odd += a[i];
            }
        }
        if (even >= odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}*/

  /*  public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int array[] = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
*/

 /*   public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length -2; i++) {
            array[i] = reader.readLine();
        }
        for (int i = 9; i>=0; --i){
            System.out.println(array[i]);
        }
    }
}*/

/*    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] ar = new int[10];
        String[] list = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
        }
        for (int a = 0; a < ar.length; a++) {
            ar[a] = list[a].length();
        }
        for (int z = 0; z < 10; z++) {
            System.out.println(ar[z]);
        }
    }
}*/

 /*   public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] big_massiv = new int[10];
        int[] small_one = new int[5];
        int[] small_two = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            big_massiv[i] = Integer.parseInt(reader.readLine());
            if (i < 5){
                small_one[i] = big_massiv[i];
            }
            else if (i >= 5){
                small_two[i-5] = big_massiv[i];
            }
            }
        for (int i = 0; i < 5; i++){
            System.out.println(small_two[i]);
        }
       /*for (int b = big_massiv.length; b <= 10; b++){
            small_one[b] = big_massiv[b];}*/
    //small_two = big_massiv;
    //for (int c = 5; c <= 10; c++){
    //small_two[c] = big_massiv[c];
    //System.out.println(small_two[c]);
    // System.out.println(small_two[c]);
    //}

    /*  for (int z = big_massiv.length; z > 5; z--) {
          System.out.println(small_two[z]);
      }
  }

  public static void main(String[] args) {
      //напишите тут ваш код
      ArrayList<String> list = new ArrayList<String>();
      String s = "String";
      for (int i = 0; i < 5; i++){
          list.add(s);
      }
      System.out.println(list.size());
      for (int i = 0; i < list.size(); i++){

          System.out.println(list.get(i));
      }
  }
}*/
    /*public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(0, s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}*/

    /* public static void main(String[] args) throws Exception {
         //напишите тут ваш код
         ArrayList<String> list = new ArrayList<String>();
         ArrayList<String> listMin = new ArrayList<>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int i = 0; i < 5; i++) {
             String s = reader.readLine();
             list.add(s);
         }
         int min = list.get(0).length();
         int c = 0;
         for(int i = 0; i < 5; i++){
             if (min > list.get(i).length()){
                 min = list.get(i).length();
                 c=0;
                 listMin.clear();
                 listMin.add(c, list.get(i));
             }
             else if (min == list.get(i).length()){
                 listMin.add(c++, list.get(i));
             }
         }
         for (int i = 0; i < listMin.size(); i++){
             System.out.println(listMin.get(i));
         }
     }
 */
 /*   public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        int k = 0;
        for(int i = 0; i < 5; i++){
            s = reader.readLine();
            list.add(s);
            k = i;
        }
        int k2 = 0;
        for (int i = 0; i < 13; i++) {
            s = list.get(k);
            list.remove(k);
            list.add(i - k2, s);
            k2 = k2 + 1;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}*/

/*    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        ArrayList<Integer> maxList = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            maxList.add(strings.get(i).length());
        }
        for (int i = 0; i < strings.size(); i++) {
            if (c < strings.get(i).length()) {
                c = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (maxList.get(i) == c) {
                System.out.println(strings.get(i));
            }
        }
    }
}*/

    public static void main(String[] a) throws IOException {
        //напишите тут ваш код
/*        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int max = list.get(0).length();
        int min = list.get(0).length();
        for (String s : list) {
            if (max < s.length()) {
                max = s.length();
            } else if (min > s.length()) {
                min = s.length();
            }
        }
        for (String s : list) {
            if (s.length() == max) {
                System.out.println(s);
                break;
            } else if (s.length() == min) {
                System.out.println(s);
                break;
            }
        }*/
           /* ArrayList<String> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 5; i++){
                list.add(reader.readLine());
            }
            list.remove(2);
            for (int i = list.size() - 1; i >= 0; i--){
                System.out.println(list.get(i));
            }
        }
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        for (int i = 0; i < (list.size()-1); i++){
            if(list.get(i).length() >= list.get(i+1).length()){
               // String x = list.get(i+1);
                System.out.println(i+1);
                break;
            }
        }
    }
}
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("мама", "мыла", "раму"));
        for (int i = 0; i < list.size(); i++){

        }
    }
}*/
    }}