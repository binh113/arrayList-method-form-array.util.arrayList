import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("mot");
        list.add("hai");
        list.add("ba");
        list.add("bon");


//        list.remove(0);
        print(list.getData());

        System.out.println(list.indexOf("hai"));
        System.out.println(list.indexOf("nam"));

        list.add(1, "sau");
        print(list.getData());

        MyList clone = list.clone();
        print(clone.getData());
        System.out.println(clone.contains("mot"));
        System.out.println(clone.contains("bay"));


//        clone.clear();
        print(clone.getData());
    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.print((String) x + "\t");
            }
        }
        System.out.print("\n");
    }
}