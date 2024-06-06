import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String []args) {
        Car car1 = new Car("Mercedes class A ", 2011);
        Car car2 = new Car("Mercedes class B", 2022);
        Car car3 = new Car("Mercedes class C", 2019);
        Car car4 = new Car("Mercedes class E", 2017);
        Car car5 = new Car("Mercedes class S", 2024);
        Car car6 = new Car("Mercedes class G", 2011);
        Car car7 = new Car("Mercedes cla", 2014);
        Car car8 = new Car("Mercedes clb", 2021);
        Car car9 = new Car("Mercedes cls", 2022);
        Car car10 = new Car("Mercedes cle", 2024);
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        cars.sort(null);
        for(Car car: cars) 
            System.out.println(car.getYearOfProduction());
        
        ArrayList<Item> items = new ArrayList<>();
        Item i = new Item(1, "Usz");
        Item i2 = new Item(2, "Usz");
        Item i3 = new Item(3, "Usz");
        Item i4 = new Item(4, "Usz");
        Item i5 = new Item(5, "Usz");
        items.add(i);
        items.add(i4);
        items.add(i2);
        items.add(i3);
        items.add(i5);
        HashMap<Integer, String> itemsHash = new HashMap<Integer, String>();
        for(int usz=0; usz<items.size(); usz++) {
            items.get(usz).show();
            itemsHash.put(items.get(usz).getId(), items.get(usz).getName());
        }
        for(Map.Entry<Integer, String> entry: itemsHash.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append(" ");
            sb.append(entry.getValue());
            System.out.println(sb.toString());
        }

        Item i6 = new Item(6, "Usza");
        Item i7 = new Item(7, "Uszak");
        Item i8 = new Item(8, "Usza");
        Item i9 = new Item(9, "Uszak");
        Item i10 = new Item(10, "Usza");
        Item i11 = new Item(11, "Uszak");
        Item i12 = new Item(12, "Usza");
        Item i13 = new Item(13, "Uszak");
        Item i14 = new Item(14, "Usza");
        Item i15 = new Item(15, "Uszak");
        ArrayList<Item> items2 =  new ArrayList<>();
        items2.add(i6);
        items2.add(i7);
        items2.add(i8);
        items2.add(i9);
        items2.add(i10);
        items2.add(i11);
        items2.add(i12);
        items2.add(i13);
        items2.add(i14);
        items2.add(i15);
        HashSet<Item> hashUszak = new HashSet<Item>();
        for(Item uszak: items2.subList(0,4))
            hashUszak.add(uszak);
        
        int numbers[] = new int[10];

        numbers = fillArray(numbers);

        for(int result: numbers) 
            System.out.println(result);
        
    }

    public static int[] fillArray(int[] numbers) {
        Scanner s = new Scanner(System.in);
        for(int iterator = 0; iterator<10; iterator++) {
            try {
                numbers[iterator] = 0;
                numbers[iterator] = readNumber(s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return numbers;
    }
    public static int readNumber(Scanner s) throws NegativeNumberException {
        int readInt = s.nextInt();
        if(readInt < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed", 0);
        }
        return readInt;
    }
}