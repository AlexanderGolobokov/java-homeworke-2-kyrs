package lab4.task3;

import java.util.Scanner;

public class eShop {
    private String login;
    private  int password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public  boolean auth( int enterPassword){
        boolean enter = false;
        if(enterPassword==this.password){
            enter = true;
        } else {
            System.out.println("Неверный пароль. Введите пароль ещё раз");
        }
        return enter;
    }
    public  boolean authLogin( String enterLogin){
        boolean enter = false;
        if(enterLogin.equalsIgnoreCase(this.login)){
            enter = true;
        } else {
            System.out.println("Неверный логин. Введите логин ещё раз");
        }
        return enter;
    }


}