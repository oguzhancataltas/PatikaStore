import java.util.Iterator;
import java.util.TreeSet;

public class Mark{
    protected static TreeSet<String> treeset = new TreeSet<>(new OrderByNoComparator());

    public Mark(){

    }

    static {
        treeset.add("Samsung");
        treeset.add("Lenovo");
        treeset.add("Apple");
        treeset.add("Huawei");
        treeset.add("Casper");
        treeset.add("Asus");
        treeset.add("HP");
        treeset.add("Xiaomi");
        treeset.add("Monster");

    }

    public void markList(){
        Iterator<String> itr = treeset.iterator();
        while (itr.hasNext()){
            System.out.println("- " + itr.next());
        }
    }

}
