package QA;

import FHD.LoginPage;
import baseClass.basepage1;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends basepage1 {

    public loginPage extends basepage1{
        PageFactory.initElements(driver,this);
    }

    public By LoginForm = By.xpath("//form[@name='loginForm']");

    public By TextLogin = By.xpath("//h1[normalize-space()='LOGIN TO YOUR ACCOUNT']");

    public void validLogin(String uname, String pass){
        sendkeys(LoginForm,uname);
        sendkeys(TextLogin,pass);

    }




}
