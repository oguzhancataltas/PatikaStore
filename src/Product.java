public abstract class Product {
    private String productName;
    private double price;
    private String mark;
    private int memory;
    private double screen;
    private int ramSize;

    public Product(String productName, double price, String mark, int memory, double screen, int ramSize) {
        this.productName = productName;
        this.price = price;
        this.mark = mark;
        this.memory = memory;
        this.screen = screen;
        this.ramSize = ramSize;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
}
