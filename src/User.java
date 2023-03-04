import java.util.ArrayList;

public class User {
    private Mark mark;
    static ArrayList<Mobile> arrayListMobile = new ArrayList<>();
    static ArrayList<NoteBook> arrayListNoteBook = new ArrayList<>();

    public User() {
        this.mark = new Mark();
    }

    static {

        arrayListMobile.add(new Mobile("SAMSUNG GALAXY A51",3199.0,"Samsung",128, 32, 4000.0, "Siyah"));
        arrayListMobile.add(new Mobile("iPhone 11 64 GB",7379.0,"Apple",64, 5, 3046.0, "Mavi"));
        arrayListMobile.add(new Mobile("Redmi Note 10 Pro 8GB",4012.0,"Xiaomi",128, 35, 4000.0, "Beyaz"));

    }
    static {

        arrayListNoteBook.add(new NoteBook("HUAWEI Matebook 14", 7000.0, "Huawei"));
        arrayListNoteBook.add(new NoteBook("LENOVO V14 IGL", 3699.0, "Lenovo"));
        arrayListNoteBook.add(new NoteBook("ASUS Tuf Gaming", 8199.0, "Asus"));

    }
    public void mobileList(){
        for (Mobile m : arrayListMobile){
            System.out.println(m.getId() + " " + m.getProductName() + " " +  m.getPrice());
        }
    }
    public void noteBookList(){
        for (NoteBook m : arrayListNoteBook){
            System.out.println(m.getId() + " " + m.getProductName() + " " +  m.getPrice());
        }
    }

    public void markList(){
        this.mark.markList();
    }
    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

}
