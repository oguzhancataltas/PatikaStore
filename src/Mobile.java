public class Mobile extends Product{
    static int count = 0;
    private int id;
    private int camera;
    private double 	battery;
    private String color;


    public Mobile(String productName, double price, String mark, int memory, int camera, double battery, String color) {
        super(productName, price, mark, memory, 6.1, 6);
        this.id = count+1;
        this.camera = camera;
        this.battery = battery;
        this.color = color;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
