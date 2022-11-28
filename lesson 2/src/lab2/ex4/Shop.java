package lab2.ex4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop implements methodsPC {
    public static List<PC> arrayPCs = new ArrayList<>();

    @Override
    public void addPC() {
        System.out.println(addPC(input()));
    }

    @Override
    public void deletePC() {
        System.out.println(deletePC(input()));
    }

    @Override
    public void searchPC() {
        searchPC(input());
    }

    public String addPC(PC pc) {

        return arrayPCs.add(pc)? "Компьютер успешно добавлен!" + "\n" + pc: "Не удалось";
    }

    public String deletePC(PC pc) {
        PC computer = searchPC(pc);
        if (computer != null) {
            return arrayPCs.remove(computer) ? "Компьютер успешно удален!" : "Компьютер не может быть удален!";
        }
        return "Компьютер не найден";
    }


    public PC searchPC(PC pc) {
        PC computer = null;

        for (PC comp : arrayPCs) {
            if (comp.getModel().equals(pc.getModel()) && comp.getColor().equals(pc.getColor()) && comp.getCpu().equals(pc.getCpu()) && comp.getRam().equals(pc.getRam())) {
                computer = comp;
                System.out.println("Компьютер найден " + computer);

            }else {
                System.out.println("Компьютер не найден");
            }
        }
        return computer;
    }


    public PC input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter model: ");
        String model = scanner.nextLine();
        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        System.out.println("Enter cpu: ");
        String cpu = scanner.nextLine();
        System.out.println("Enter ram: ");
        String ram = scanner.nextLine();

        PC pc = new PC(model, color, cpu, ram);
        return pc;
    }
}