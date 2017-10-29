package ru.fixtest;

        import com.codeborne.selenide.Configuration;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.support.FindBy;

        import static com.codeborne.selenide.Condition.*;
        import static com.codeborne.selenide.Selectors.*;
        import static com.codeborne.selenide.Selenide.*;

public class fixtest {
    @Test
    public void openSite() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val("WQA");
        $(By.name("password")).val("12345");
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText("WQA")).shouldBe(visible);
        $(By.name("value1")).val("1");
        $(By.name("value2")).val("1");
        $(By.name("value3")).val("1");
        $(byValue("Вперед")).shouldBe(enabled).pressEnter();
        $(withText("Подтверждение данных")).shouldBe(visible);
        $(byValue("Вперед")).shouldBe(enabled).pressEnter();
        $(withText("Результат")).shouldBe(visible);
        $(withText("Итого")).shouldBe(visible);
        $(screenshot("done"));
    }
}