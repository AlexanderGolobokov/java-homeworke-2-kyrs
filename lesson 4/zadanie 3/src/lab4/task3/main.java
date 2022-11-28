package lab4.task3;

import java.util.Scanner;

public class main {
    public static String removeLastChar(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceFirst(".$", "");
    }

    public static void main(String[] args){
        while (true){
        Scanner in = new Scanner(System.in);
        eShop user=new eShop();
        user.setLogin("sk");
        user.setPassword(1234);
        boolean enter = false,enter2=false;

        System.out.println("Добро пожаловать в интернет магазин, введите логин и пароль:");

        while (enter==false){
            String enterLogin=in.nextLine();
            enter= user.authLogin(enterLogin);
        }
       System.out.println("Логин введен верно");

       while (enter2==false){
            int enterPassword=in.nextInt();
            enter2= user.auth(enterPassword);

        }
       System.out.println("Пароль введен верно. Поздравляю вход успешен");
        allShop[] types = allShop.values();
        for (allShop s : types) { System.out.println(s); }
        System.out.println("Выберите один из предложенных вариантов(введите от 1 до 3):");
       boolean buy=false;
       String buyDevice="";
       double costDevice=0;
while(true){

    int enterChoice=in.nextInt();
       if(enterChoice==1){
           System.out.println(computers.Acer+"="+computers.Acer.getCost()+"\n"+computers.Lenovo+"="+computers.Lenovo.getCost()+"\n"+computers.Macbook+"="+computers.Macbook.getCost());
           System.out.println("Выберите один из предложенных товаров(введите от 1 до 3) или вернитесть назад введя 4:");
           int enterChoise2=in.nextInt();
           if(enterChoise2==1){costDevice+=computers.Acer.getCost(); buyDevice+="Acer+";}
           if(enterChoise2==2){costDevice+=computers.Lenovo.getCost(); buyDevice+="Lenovo+";}
           if(enterChoise2==3){costDevice+=computers.Macbook.getCost(); buyDevice+="Macbook+";}

       } else if (enterChoice==2) {
           System.out.println(phones.iphone+"="+phones.iphone.getCost()+"\n"+phones.Samsung+"="+phones.Samsung.getCost()+"\n"+phones.Xiaomi+"="+phones.Xiaomi.getCost());
           System.out.println("Выберите один из предложенных товаров(введите от 1 до 3) или вернитесть назад введя 4:");
           int enterChoise2=in.nextInt();
           if(enterChoise2==1){costDevice+=phones.iphone.getCost(); buyDevice+="iphone+";}
           if(enterChoise2==2){costDevice+=phones.Samsung.getCost(); buyDevice+="Samsung+";}
           if(enterChoise2==3){costDevice+=phones.Xiaomi.getCost(); buyDevice+="Xiaomih+";}
       } else if (enterChoice==3) {
           System.out.println(tablets.ipad+"="+tablets.ipad.getCost()+"\n"+tablets.samsung+"="+tablets.samsung.getCost()+"\n"+tablets.lenovo+"="+tablets.lenovo.getCost());
           System.out.println("Выберите один из предложенных товаров(введите от 1 до 3) или вернитесть назад введя 4:");
           int enterChoise2=in.nextInt();
           if(enterChoise2==1){costDevice+=tablets.ipad.getCost(); buyDevice+="ipad+";}
           if(enterChoise2==2){costDevice+=tablets.samsung.getCost(); buyDevice+="samsung+";}
           if(enterChoise2==3){costDevice+=tablets.lenovo.getCost(); buyDevice+="lenovo+";}
       } else if (enterChoice==4) {
           break;
       }
    allShop[] types1 = allShop.values();
    for (allShop s : types1) { System.out.println(s); }
    System.out.println("Выберите один из предложенных вариантов(введите от 1 до 3) если хотите продолжить выбор или введите 4 чтобы перейти к оплате:");
    }
    System.out.println("Корзина:"+removeLastChar((buyDevice))+"="+costDevice+"\n"+"Хотите оплатить товар?(Y/N)");
    String store=in.next();
    String Y="Y";
    if(Y.equalsIgnoreCase(store)){
        System.out.println("Оплата успешна, приходите еще");
        break;
    }else{System.out.println("Оплата отменена, возвращение к началу");}
    }
    }
}
