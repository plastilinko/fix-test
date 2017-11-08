package ru.fixtest;

        import com.codeborne.selenide.Configuration;
        import com.codeborne.selenide.Selenide;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import com.codeborne.selenide.WebDriverRunner;
        import org.openqa.selenium.support.ui.WebDriverWait;

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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
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
        driver.close();
        driver.quit();
    }
    @Test
    public void test21() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
        Configuration.timeout = 10000;

        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(enabled).pressEnter();
        $(withText(String.valueOf(truelogin))).shouldBe(visible);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        driver.close();
        driver.quit();
    }
    @Test
    public void test22() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
        Configuration.timeout = 10000;

        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("password")).val(String.valueOf(truepassword));
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        driver.close();
        driver.quit();
    }
    @Test
    public void test23() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
        Configuration.timeout = 10000;

        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("password")).val("somerandompassword");
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        driver.close();
        driver.quit();
    }
    @Test
    public void test24() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
        Configuration.timeout = 10000;

        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        driver.close();
        driver.quit();
    }
    @Test
    public void test25() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
        Configuration.timeout = 10000;

        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val(String.valueOf(truelogin));
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        driver.close();
        driver.quit();
    }
    @Test
    public void test26() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
        Configuration.timeout = 10000;

        open("http://rulkov.ru/qa/");
        $(byText("Операция сложения")).shouldBe(visible).click();
        $(byText("Login")).shouldBe(visible);
        $(By.name("username")).val("somerandomname");
        $(By.className("btn-success")).shouldBe(disabled);
        $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
        driver.close();
        driver.quit();
    }
    @Test
    public void test27() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
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
        driver.close();
        driver.quit();
    }}
    @Test
    public void test31() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
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
        driver.close();
        driver.quit();
    }
    @Test
    public void test32() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
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
        driver.close();
        driver.quit();
    }
    @Test
    public void test33() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
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
        driver.close();
        driver.quit();
    }}
    @Test
    public void test34() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
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
        driver.close();
        driver.quit();
    }
    @Test
    public void test41() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
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
        driver.close();
        driver.quit();
    }
    @Test
    public void test42() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
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
            WebDriverWait wait = new WebDriverWait(driver, 5001);
/*        $(withText("Итого")).waitUntil((visible),5001);*/
            $(screenshot(Thread.currentThread().getStackTrace()[1].getMethodName()));
/*        Selenide.close();*/
        }finally{
        driver.close();
        driver.quit();
    }}
    @Test
    public void test43() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
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
        driver.close();
        driver.quit();
    }}
    @Test
    public void test44() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.33\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        browser = "driver";
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
        driver.close();
        driver.quit();
    }}
}