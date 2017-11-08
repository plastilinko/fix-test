package ru.fixtest;

        import com.codeborne.selenide.Configuration;
        import com.codeborne.selenide.Selenide;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import static com.codeborne.selenide.Condition.*;
        import static com.codeborne.selenide.Configuration.browser;
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
        browser = "chrome";
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
        Selenide.close();
    }
    @Test
    public void test21() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText(String.valueOf(truelogin))).shouldBe(visible);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        Selenide.close();
    }
    @Test
    public void test22() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        Selenide.close();
    }
    @Test
    public void test23() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("password")).val("somerandompassword");
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        Selenide.close();
    }
    @Test
    public void test24() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        Selenide.close();
    }
    @Test
    public void test25() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        Selenide.close();
    }
    @Test
    public void test26() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val("somerandomname");
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        Selenide.close();
    }
    @Test
    public void test27() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val("somerandomname");
        $(By.name("password")).val("somerandompassword");
        try {
            $(By.className("btn-success")).shouldBe(disabled);
            $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        }finally{
        Selenide.close();
    }}
    @Test
    public void test31() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText(String.valueOf(truelogin))).shouldBe(visible);
        $(byValue("Вперед")).shouldBe(disabled);
        $(By.name("value1")).val("1");
        $(byValue("Вперед")).shouldBe(disabled);
        $(By.name("value2")).val("1");
        $(byValue("Вперед")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        Selenide.close();
    }
    @Test
    public void test32() {
        browser = "chrome";
        Configuration.timeout = 10000;

        String value1 = "11";
        String value2 = "12";
        String value3 = "13";

        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText(String.valueOf(truelogin))).shouldBe(visible);
        $(By.name("value1")).val(String.valueOf(value1));
        $(By.name("value2")).val(String.valueOf(value2));
        $(By.name("value3")).val(String.valueOf(value3));
        $(byValue("Вперед")).shouldBe(enabled).pressEnter();
        $(withText("Подтверждение данных")).shouldBe(visible);
        $(By.tagName("table")).shouldHave(text(String.valueOf(value1)));
        $(By.tagName("table")).shouldHave(text(String.valueOf(value2)));
        $(By.tagName("table")).shouldHave(text(String.valueOf(value3)));
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        Selenide.close();
    }
    @Test
    public void test33() {
        browser = "chrome";
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
        try {
            $(byValue("Назад")).shouldBe(enabled);
            $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        }finally{
        Selenide.close();
    }}
    @Test
    public void test34() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText(String.valueOf(truelogin))).shouldBe(visible);
        $(By.name("value1")).val("00000000000000000000000000000000000000000000000000");
        $(By.name("value2")).val("00000000000000000000000000000000000000000000000000");
        $(By.name("value3")).val("00000000000000000000000000000000000000000000000000");
        $(byValue("Вперед")).shouldBe(enabled).pressEnter();
        $(withText("Подтверждение данных")).shouldBe(visible);
        $(byValue("Вперед")).shouldBe(enabled).pressEnter();
        $(withText("Результат")).shouldBe(visible);
        $(withText("Итого")).shouldBe(visible);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        Selenide.close();
    }
    @Test
    public void test41() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText(String.valueOf(truelogin))).shouldBe(visible);
        $(withText("logout")).shouldBe(visible).pressEnter();
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        Selenide.close();
    }
    @Test
    public void test42() {
        browser = "chrome";
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
        try {
        $(withText("Итого")).waitUntil((visible),5001);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        }finally{
        Selenide.close();
    }}
    @Test
    public void test43() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText(String.valueOf(truelogin))).shouldBe(visible);
        refresh();
        try {
            $(withText(String.valueOf(truelogin))).shouldBe(visible);
            $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        }finally{
        Selenide.close();
    }}
    @Test
    public void test44() {
        browser = "chrome";
        Configuration.timeout = 10000;
        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText(String.valueOf(truelogin))).shouldBe(visible);
        $(By.name("value1")).val("12345678901234567890");
        $(By.name("value2")).val("1");
        $(By.name("value3")).val("1");
        $(byValue("Вперед")).shouldBe(enabled).pressEnter();
        $(withText("Подтверждение данных")).shouldBe(visible);
        $(byValue("Вперед")).shouldBe(enabled).pressEnter();
        $(withText("Результат")).shouldBe(visible);
        try {
            $(withText("Итого")).shouldBe(text("12345678901234567892"));
            $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        }finally{
        Selenide.close();
    }}
}