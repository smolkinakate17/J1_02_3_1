import java.util.Objects;

public class Item {
    private long art;

    private double price;
    private Provider provider;

    public Item(long art, double price, Provider provider) {
        this.art = art;
        this.price = price;
        this.provider = provider;
    }

    public long getArt() {
        return art;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        if (provider instanceof Dealer) {
            return "art=" + art +
                    ", price=" + ((Dealer) provider).getNewPrice(this) +
                    ", " + provider;

        }

        return "art=" + art +
                ", price=" + price +
                ", " + provider;
    }

}
