public class SeleniumMain {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = " https://www.tutorialspoint.com/questions/index.php";
        driver.get(url);
    }
}
