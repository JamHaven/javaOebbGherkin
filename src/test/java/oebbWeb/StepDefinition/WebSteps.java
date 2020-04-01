package oebbWeb.StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WebSteps extends BaseSteps {
    WebDriver driver;

    @Given("Open Browser and go to ÖBB")
    public void openBrowserAndGoToÖBB() throws Throwable {

        this.driver = this.startFirefoxDriver();
        this.driver.get("https://tickets.oebb.at/de/ticket/relation?cref=oebb-header");
        System.out.println("Browser opened..");
    }


    @When("Chooses ([^\"]*) ticket from ([^\"]*) nach ([^\"]*) on the ([^\"]*), ([^\"]*) at ([^\"]*) with ([^\"]*) discount on the website$")
    public void choosesTicketsTicketSFromFromNachToOnTheDateIsDepartureAtTimeWithDiscountDiscountOnTheWebsite(Integer numberOfTickets,String from, String to,String date, String departure, String time, String discount) throws InterruptedException {
        //Allgemeiner Timer zwischen Steps die ladezeit brauchen.
        int timetowait = 2000;
        Thread.sleep(	timetowait);
        driver.findElement(By.className("time-wrapper")).click();
        driver.findElement(By.className("time-wrapper")).click();
        //Thread.sleep(	timetowait);
        driver.findElements(By.cssSelector("mat-form-field .mat-form-field-infix .mat-input-element")).get(0).sendKeys(date);
        //Thread.sleep(	timetowait);
        driver.findElements(By.cssSelector("mat-form-field .mat-form-field-infix .mat-input-element")).get(1).sendKeys(time.replace(":",""));
        //Thread.sleep(	timetowait);
        driver.findElements(By.cssSelector("mat-form-field .mat-form-field-infix .mat-input-element")).get(1).sendKeys(Keys.ENTER);
        //Thread.sleep(	timetowait);

        driver.findElement(By.name("stationFrom")).click();
        driver.findElement(By.name("stationFrom")).sendKeys(from);
        Thread.sleep(	timetowait);
        driver.findElement(By.name("stationFrom")).sendKeys(Keys.ENTER);
        //Thread.sleep(	timetowait);
        driver.findElement(By.name("stationTo")).click();
        driver.findElement(By.name("stationTo")).sendKeys(to);
        Thread.sleep(	timetowait);
        driver.findElement(By.name("stationTo")).sendKeys(Keys.ENTER);
        Thread.sleep(	timetowait);
        //Reise anklicken
        driver.findElement(By.cssSelector(".travelActionWrapper:nth-child(1) .text")).click();
        Thread.sleep(	timetowait + timetowait);
        //Abfahrt oder Ankuft
        driver.findElement(By.cssSelector(".mat-select-trigger.mat-select-trigger span span")).click();
        Thread.sleep(	timetowait);

        if (departure.equals("departure")){
            //Abfahrt
            driver.findElements(By.cssSelector(".mat-option-text.mat-option-text")).get(0).click();
        } else {
            //Ankunft
            driver.findElements(By.cssSelector(".mat-option-text.mat-option-text")).get(1).click();
        }
        Thread.sleep(	timetowait);

        //Personen
        driver.findElement(By.className("passengers")).click();
        Thread.sleep(	timetowait);
        int i = numberOfTickets;
        while (i > 1){
            //Mehrere Personen
            driver.findElements(By.cssSelector(".addPersonButton")).get(0).click();
            //Thread.sleep(	timetowait);
            i--;
        }

        //Vorteilscard
        if (discount.equals("Vorteilscard Classic")) {
            i = 0;
            while (i < numberOfTickets) {
                driver.findElements(By.cssSelector(".addDiscount.addDiscount")).get(i).click();
                //Thread.sleep(timetowait);
                driver.findElements(By.cssSelector(".topTen .discountCard")).get(0).click();
                //Thread.sleep(timetowait);
                driver.findElements(By.cssSelector(".focusLinkImportant")).get(0).click();
                //Thread.sleep(timetowait);
                i++;
            }
        }
        // Weiter Button
        driver.findElements(By.cssSelector(".mat-button-wrapper.mat-button-wrapper")).get(0).click();
        Thread.sleep(	timetowait);

    }

    @Then("^The ticket price on website is ([^\"]*) Euros$") //
    public void theTicketPriceOnWebsiteIsPriceEuros(String expectedprice) throws InterruptedException {
        //Wichtiger delay bis der Endgültige Preis geladen ist
        Thread.sleep(5500);
        String actualPrice = driver.findElements(By.cssSelector(".price .ng-star-inserted")).get(0).getText();
        Assert.assertEquals(expectedprice,actualPrice);
    }

    @When("Choose Einfach-raus-Ticket for website")
    public void chooseEinfachRausTicketForWebsite() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".travelActionWrapper:nth-child(1) .text")).click();

    }

    @Then("^The ticket price on website is ([^\"]*) Euros for Einfach-raus$")
    public void theTicketPriceOnWebsiteIsPriceEurosForEinfachRaus(String expectedprice) throws InterruptedException {
        Thread.sleep(5000);
        String actualPrice = driver.findElement(By.xpath("//offer-price/div/div[2]/h2")).getText();
        Assert.assertEquals(expectedprice,actualPrice);
    }
}
