package ru.netology;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallbackTest {

    private WebDriver driver;

    @BeforeAll
    static void setupAll() {
        System setProperty ("webdriver.chromedriver", "driver/chromedriver.exe");
    }

    @BeforeEach
    void setup();

    driver =new

    ChromeDriver();
}

    @AfterEach
    void tearDown();
  driver.quit();
          driver=null;
          }

@Test
void test();
        driver get("http://localhost:9999");
        System.out.printIn();
        }


        }
