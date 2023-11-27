import java.util.List;

public class Dealer extends Provider {

    private Manufacturer manufacturer;
    private int extra;


    public Dealer(String INN, String title, String address, Manufacturer manufacturer, int extra) {
        super(INN, title, address);
        this.manufacturer = manufacturer;
        this.extra = extra;
    }

    public double getNewPrice(Item item) {
        return item.getPrice() + (item.getPrice() * (double) extra / 100);
    }


    @Override
    public String toString() {
        return "Title='" + Title + '\'' +
                ", Address='" + Address + '\'' +
                " (" + manufacturer + ")";
    }
}
