package login.entity;

public class Student {


    private String account;

    private String password;

    private String name;

    private int books_number;

    public Student(String account, String password, String name) {
        this.account = account;
        this.password = password;
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBooks_number() {
        return books_number;
    }

    public void setBooks_number(int books_number) {
        this.books_number = books_number;
    }
}
