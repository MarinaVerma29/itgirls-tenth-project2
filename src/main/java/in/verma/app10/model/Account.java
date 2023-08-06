package in.verma.app10.model;
import in.verma.app10.exception.WrongPasswordException;


public class Account {
    private String password;

    public void checkPassword(String password) throws WrongPasswordException{
        if (password == null) throw new WrongPasswordException("Пароль не указан");
        if (password.length() > 5 && password.length() < 20) throw new WrongPasswordException("Не верная длина пароля");

        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}


