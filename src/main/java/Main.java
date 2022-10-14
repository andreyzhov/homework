public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.name);
        changeName(cat);
        System.out.println(cat.name);
    }

    public static void changeName(Cat cat) {
        cat.name = "Jerry";
    }

    public static class Cat {
        String name = "Tom";
    }
}