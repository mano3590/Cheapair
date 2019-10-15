package objectRespostory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class home_page extends baseClass{
	public home_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"tripTypeContainer\"]/div/label[2]/span[1]")
	public WebElement oneway;
	@FindBy(id="from1")
	public WebElement from;
	@FindBy(id="to1")
	public WebElement to;	
	@FindBy(id="dates")
	public WebElement selectDate;
	@FindBy(xpath="//a[text()='1']")
	public WebElement selectDay;
	@FindBy(id="options")
	public WebElement passngr;
	@FindBy(xpath="(//*[@type='button'])[6]")
	public WebElement child;
	@FindBy(xpath="(//*[@type='submit'])[1]")
	public WebElement searchbtn;
	public WebElement getOneway() {
		return oneway;
	}
	public WebElement getFrom() {
		return from;
	}
	public WebElement getTO() {
		return to;
	}
	public WebElement getSelectDate() {
		return selectDate;
	}
	public WebElement getSelectDay() {
		return selectDay;
	}
	public WebElement getPassngr() {
		return passngr;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	

}
