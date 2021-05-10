package Pages.Sample;

import Pages.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SampleVerify extends Page {
    public SampleVerify() { setUrl("http://skryabin.com/webdriver/html/sample.html");}

    @FindBy(xpath = "//b[@name='username']")
    private WebElement username;
    @FindBy(xpath = "//b[@name='phone']")
    private WebElement phone;
    @FindBy(xpath = "//b[@name='gender']")
    private WebElement gender;
    @FindBy(xpath = "//b[@name='contactPersonName']")
    private WebElement contactPersonName;
    @FindBy(xpath = "//b[@name='currentTime']")
    private WebElement currentTime;
    @FindBy(xpath = "//button[@id='return']")
    private WebElement returnButton;
    @FindBy(xpath = "//b[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//b[@name='address']")
    private WebElement address;
    @FindBy(xpath = "//b[@name='allowedToContact']")
    private WebElement allowedToContact;
    @FindBy(xpath = "//b[@name='contactPersonPhone']")
    private WebElement contactPersonPhone;
    @FindBy(xpath = "//b[@name='thirdPartyAgreement']")
    private WebElement thirdPartyAgreement;
    @FindBy(xpath = "//b[@name='email']")
    private WebElement email;
    @FindBy(xpath = "//b[@name='countryOfOrigin']")
    private WebElement countryOfOrigin;
    @FindBy(xpath = "//b[@name='dateOfBirth']")
    private WebElement dateOfBirth;
    @FindBy(xpath = "//b[@name='location']")
    private WebElement location;
    @FindBy(xpath = "//b[@name='attachmentName']")
    private WebElement attachmentName;
    @FindBy(xpath = "//b[@name='name']")
    private WebElement name;
    @FindBy(xpath = "//b[@name='carMake']")
    private WebElement carMake;
    @FindBy(xpath = "//b[@name='agreedToPrivacyPolicy']")
    private WebElement agreedToPrivacyPolicy;
    @FindBy(xpath = "//b[@name='currentDate']")
    private WebElement currentDate;

    public String getCurentDate() throws InterruptedException {
        return currentDate.getText();
    }

    public String getAttachmentName() throws InterruptedException {
        return attachmentName.getText();
    }

    public String getUsernameTxt() throws InterruptedException {
        return username.getText();
    }

    public String getPhoneTxt() throws InterruptedException {
        return phone.getText();
    }

    public String getGenderTxt() throws InterruptedException {
        return gender.getText();
    }

    public String getContactPersonNameTxt() throws InterruptedException {
        return contactPersonName.getText();
    }


    public void clickReturnButton() throws InterruptedException {
        click(returnButton);
    }

    public String getPasswordTxt() throws InterruptedException {
        return password.getText();
    }
    public String getAddressTxt() throws InterruptedException {
        return address.getText();
    }

    public String getAllowedToContactTxt() throws InterruptedException {
        return allowedToContact.getText();
    }
    public String getContactPersonPhoneTxt() throws InterruptedException {
        return contactPersonPhone.getText();
    }

    public String getThirdPartyAgreementTxt() throws InterruptedException {
        return thirdPartyAgreement.getText();
    }

    public String getEmailTxt() throws InterruptedException {
        return email.getText();
    }

    public String getCountryTxt() throws InterruptedException {
        return countryOfOrigin.getText();
    }

    public String getDobTxt() throws InterruptedException {
        return dateOfBirth.getText();
    }

    public String getLocationTxt() throws InterruptedException {
        return location.getText();
    }

    public String getNameTxt() throws InterruptedException {
        return name.getText();
    }

    public String getCarMakeTxt() throws InterruptedException {
        return carMake.getText();
    }


    public String getAgreedToPrivacyPolicyTxt() throws InterruptedException {
        return agreedToPrivacyPolicy.getText();
    }

    public String getCurrentDateTxt() throws InterruptedException {
        return currentDate.getText();
    }

    public String getCurrentTimeTxt() throws InterruptedException {
        return currentTime.getText();
    }

}