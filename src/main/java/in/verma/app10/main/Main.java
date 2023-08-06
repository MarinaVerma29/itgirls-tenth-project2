package in.verma.app10.main;
import in.verma.app10.model.Account;
import in.verma.app10.exception.WrongPasswordException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваш пароль: ");
        String passwordUser = scanner.nextLine();

        Account account = new Account();
        try{
            account.checkPassword(passwordUser);
            System.out.println(account.getPassword());
        } catch (WrongPasswordException exception){
            exception.printStackTrace();
        }
    }
}

