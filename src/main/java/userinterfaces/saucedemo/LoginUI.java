package userinterfaces.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class LoginUI extends PageObject {

    //public static final Target CATEGORIAS = Target.the("categorías disponibles").locatedBy("//div[@class='list-group']/a[@class='list-group-item' and @id='itemc']");

    public static final Target USER_INPUT = Target.the("Input de Usuario").locatedBy("//input[@id='user-name']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target PASS_INPUT = Target.the("Input de Password").locatedBy("//input[@id='password']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target BTN_LOGIN = Target.the("Btn de Login").locatedBy("//input[@id='login-button']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target BTN_CART = Target.the("Btn de Add to Cart").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']").waitingForNoMoreThan(Duration.ofSeconds(10));

}