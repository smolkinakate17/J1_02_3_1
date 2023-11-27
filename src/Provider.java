import java.util.ArrayList;
import java.util.List;

public class Provider {
    protected String INN;
    protected String Title;
    protected String Address;
    protected List<Item> items = new ArrayList<>();

    public Provider(String INN, String title, String address) {
        this.INN = INN;
        Title = title;
        Address = address;

    }
    public List<Item> getItems() {
        return items;
    }


    @Override
    public String toString() {
        return "Title='" + Title +
                ", Address='" + Address;
    }
}
