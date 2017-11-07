package ru.fixtest;

        import com.codeborne.selenide.Configuration;
        import org.junit.Test;
        import org.openqa.selenium.By;

        import static com.codeborne.selenide.Condition.*;
        import static com.codeborne.selenide.Selectors.*;
        import static com.codeborne.selenide.Selenide.*;

public class fixtest {
    /*объявим заранее известные тру учетные данные
    *нужны для тех тестов где используются заведомо правильные значения
    * на случай их смены не нужно будет перебивать везде руками*/

    String truelogin = "WQA";
    String truepassword = "12345";

    @Test
    public void test01() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;

        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText(String.valueOf(truelogin))).shouldBe(visible);
        $(By.name("value1")).val("1");
        $(By.name("value2")).val("1");
        $(By.name("value3")).val("1");
        $(byValue("Вперед")).shouldBe(enabled).pressEnter();
        $(withText("Подтверждение данных")).shouldBe(visible);
        $(byValue("Вперед")).shouldBe(enabled).pressEnter();
        $(withText("Результат")).shouldBe(visible);
        $(withText("Итого")).shouldBe(visible);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        close();
    }
    @Test
    public void test21() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText(String.valueOf(truelogin))).shouldBe(visible);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        close();
    }
    @Test
    public void test22() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        close();
    }
    @Test
    public void test23() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("password")).val("somerandompassword");
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        close();
    }
    @Test
    public void test24() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        close();
    }
}