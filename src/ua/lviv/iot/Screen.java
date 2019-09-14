package ua.lviv.iot;

public class Screen {
    private double height;
    private double width;
    private String producer;
    private MountingType kindOfMounting;

    public Screen() {
    }

    public Screen(double height, double width, String producer, MountingType kindOfMounting) {
        this.height = height;
        this.width = width;
        this.producer = producer;
        this.kindOfMounting = kindOfMounting;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public MountingType getKindOfMounting() {
        return kindOfMounting;
    }

    public void setKindOfMounting(MountingType kindOfMounting) {
        this.kindOfMounting = kindOfMounting;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "height=" + height +
                ", width=" + width +
                ", producer='" + producer + '\'' +
                ", kindOfMounting=" + kindOfMounting +
                '}';
    }
}
