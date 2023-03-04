public class NoteBook extends Product {
    int id;
    static int count = 0;

    public NoteBook( String productName, double price, String mark) {
        super(productName, price, mark, 512, 14, 8);
        this.id = count+1;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        NoteBook.count = count;
    }
}
