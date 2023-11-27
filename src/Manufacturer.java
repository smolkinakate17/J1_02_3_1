import java.util.List;

public class Manufacturer extends Provider {

    public Manufacturer(String INN, String title, String address) {
        super(INN, title, address);
    }


    @Override
    public String toString() {
        return "Title='" + Title + '\'' +
                ", Address='" + Address;
    }
}
