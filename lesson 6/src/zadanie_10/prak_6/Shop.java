package zadanie_10.prak_6;

import java.util.HashMap;
import java.util.Scanner;

public class Shop {
    private Computer[] computers;
    private HashMap<Computer, Integer> computerss;
    public Shop(){
        computers = new Computer[0];
        computerss = new HashMap<>();
    }
    public void AddComp(String model, int count){
        if (ModelsOfComputer.isComp(model)){
            Computer comp = ModelsOfComputer.isComputer(model);
            if (computerss.containsKey(comp)){
                computerss.put(comp, computerss.get(comp) + count);
            }else {
                computerss.put(comp, count);
            }
        }
    }
    public void getBag(){
        System.out.println("Your bag:\n");
        for (Computer i : computerss.keySet()){
            System.out.println(i.getModel() + " - " + computerss.get(i));
        }
    }
//    public void addComputer(String model, int count){
//        int k = 0;
//        for (ModelsOfComputer i : ModelsOfComputer.values()){
//            if (i.getComputer().getModel().equals(model)){
//                k++;
//            }
//        }
//        if (k != 0) {
//            Computer[] arr = new Computer[computers.length + 1];
//            for (int i = 0; i < computers.length; i++) {
//                arr[i] = computers[i];
//            }
//            arr[computers.length] = ModelsOfComputer.isComputer(model);
//            computers = new Computer[arr.length];
//            for (int i = 0; i < computers.length; i++){
//                computers[i] = arr[i];
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shoper1 = new Shop();
        ModelsOfComputer.getCatalog();
        String model;
        int count;
        do {
            model = scanner.nextLine();
            if (model.equals("")){
                break;
            }
            count = Integer.parseInt(scanner.nextLine());
            shoper1.AddComp(model, count);
        }while (true);
        System.out.println();
        shoper1.getBag();
    }

}
