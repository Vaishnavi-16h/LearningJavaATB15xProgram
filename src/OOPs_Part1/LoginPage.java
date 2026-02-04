package OOPs_Part1;

public class LoginPage
{
    String email;
    int a;

    LoginPage()
    {
        System.out.println("DC");
    }

    public LoginPage(String email,String password)
    {
        this.email = email;
        this.password = password;
    }

    String password;

    //Constructor Chaining
    //The following this(email,password); will automatically call the
    //public LoginPage(String email,String password)
    //i.e. One Constructor can call the another Constructor, By using 'this' keyword.
    public LoginPage(String email, String password,String submitButton, int a)
    {
        //this.email = email;
        //this.password = password;
        this(email,password);
        this.submitButton = submitButton;
        this.a = a;
    }
    String submitButton;

}