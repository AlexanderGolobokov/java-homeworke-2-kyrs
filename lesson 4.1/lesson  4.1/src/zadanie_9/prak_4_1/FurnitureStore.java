package zadanie_9.prak_4_1;

import java.util.HashMap;
import java.util.Scanner;

public class FurnitureStore {
    static private Chair[] chairs = {new Chair(4, 5, 4, "tree", "classic chair"), new Chair(3, 4, 3, "steel", "minimalism chair"), new Chair(6, 6, 2, "steel", "modern chair")};
    static private Table[] tables = {new Table(10, 15, 4, "tree", "classic table"), new Table(12, 14, 3, "steel", "modern table"), new Table(16, 13, 3, "steel", "minimalism table")};
    static private Shelf[] shelves = {new Shelf(3, 7, 17, "steel", "classsic shelf"), new Shelf(4, 8.7, 20, "steel", "modern shelf"), new Shelf(5, 9.6, 22, "steel", "minimalism shelf")};
    private HashMap<String, Integer> furnitureHashMap;
    {
        furnitureHashMap = new HashMap<>();
    }
    FurnitureStore(){}

    public void addFurniture(String str, int i){
        for (int j = 0; j < chairs.length; j++){
            if (chairs[j].name.equals(str)){
                if (furnitureHashMap.containsKey(str)){
                    furnitureHashMap.put(str, furnitureHashMap.get(str) + i);
                    return;
                }else {
                    furnitureHashMap.put(str, i);
                    return;
                }
            }
        }
        for (int j = 0; j < tables.length; j++){
            if (tables[j].name.equals(str)){
                if (furnitureHashMap.containsKey(str)){
                    furnitureHashMap.put(str, furnitureHashMap.get(str) + i);
                    return;
                }else {
                    furnitureHashMap.put(str, i);
                    return;
                }
            }
        }
        for (int j = 0; j < shelves.length; j++){
            if (shelves[j].name.equals(str)){
                if (furnitureHashMap.containsKey(str)){
                    furnitureHashMap.put(str, furnitureHashMap.get(str) + i);
                    return;
                }else {
                    furnitureHashMap.put(str, i);
                    return;
                }
            }
        }
        System.out.println("error, try again");
    }

    public double costOfFurniture(){
        double sum = 0;
        for (String i : furnitureHashMap.keySet()){
            sum += 5999 * furnitureHashMap.get(i);
        }
        return sum;
    }

    public void Katalog(){
        System.out.println("Our chairs:\n");
        for (int i = 0; i < chairs.length; i++){
            System.out.println("-" + chairs[i].name);
        }
        System.out.println();
        System.out.println("Our tables:\n");
        for (int i = 0; i < tables.length; i++){
            System.out.println("-" + tables[i].name);
        }
        System.out.println();
        System.out.println("Our shaelfs:\n");
        for (int i = 0; i < shelves.length; i++){
            System.out.println("-" + shelves[i].name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FurnitureStore furnitureStore = new FurnitureStore();
        String name;
        int i;
        System.out.println("Choose any furniture. If you will want end chosen input zero\n");
        furnitureStore.Katalog();
        System.out.println();
        do {
            i = scanner.nextInt();
            if (i == 0){
                break;
            }
            scanner.nextLine();
            name = scanner.nextLine();
            furnitureStore.addFurniture(name, i);
        }while (i != 0);
        System.out.println();
        System.out.println("Your price for all items:\n");
        System.out.println(furnitureStore.costOfFurniture());
    }
}
