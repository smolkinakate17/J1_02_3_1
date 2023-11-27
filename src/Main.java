import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Manufacturer firstManufacturer = new Manufacturer("157762406525", "FirstManufacture", "Филиппова площадь 4а, Калининград");
        Manufacturer secondManufacturer = new Manufacturer("368697863755", "SecondManufacture", "улица Ленина 152, Сочи");
        Manufacturer thirdManufacturer = new Manufacturer("188684712393", "ThirdManufacture", "проспект Победы 53б, Тюмень");
        Dealer firstDealer = new Dealer("294273635987", "FirstDealer", "улица Миронова, Новосибирск", firstManufacturer, 300);
        Dealer secondDealer = new Dealer("694631599002", "SecondDealer", "улица Одинцова 92г , Казань", secondManufacturer, 250);

        List<Item> allItems = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int p = random.nextInt(1, 6);
            Provider provider = switch (p) {
                case 1 -> firstManufacturer;
                case 2 -> secondManufacturer;
                case 3 -> thirdManufacturer;
                case 4 -> firstDealer;
                default -> secondDealer;
            };

            Item item = new Item(random.nextLong(10000000, 99999999), random.nextDouble(300, 3000), provider);
            allItems.add(item);
            provider.getItems().add(item);
        }
        System.out.println("Доступные артикулы:");
        for (Item i : allItems) {
            System.out.println(i.getArt());
        }


        Scanner in = new Scanner(System.in);
        long art;
        while (true) {
            System.out.println("Введите артикул для поиска");
            art = in.nextLong();
            long finalArt = art;
            Item i = allItems.stream().filter(item -> item.getArt() == finalArt).findFirst().orElse(null);
            if (i == null) {
                System.out.println("Не найден товар с данным артикулом");
            } else {
                System.out.println(i);
            }
            System.out.println("Вы хотите выйти?");
            in.nextLine();
            String message = in.nextLine();
            if (message.equals("Да") || message.equals("да") || message.equals("Yes") || message.equals("yes")) {
                break;
            }
        }
        in.close();

    }
}