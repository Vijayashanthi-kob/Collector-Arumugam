package collector;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collector_Functions {
	
	public static WebDriver driver;
	
	public static XSSFCell cell;
	
	public static void BrowserLaunch() 
	{

		System.setProperty("webdriver.chrome.driver", inputdata.chrome_path);
		driver=new ChromeDriver();
		driver.get(inputdata.url);
		driver.manage().window().maximize();
		System.out.println("Browser Launched successfully");
	}
	
	public static void signin() throws InterruptedException 
	{
		
		Thread.sleep(5000);
		driver.findElement(locators.email).sendKeys(inputdata.email);
		driver.findElement(locators.password).sendKeys(inputdata.password);
		driver.findElement(locators.login_button).click();
		Thread.sleep(5000);
		System.out.println("Successfully Logged in ");
	}
	
	@SuppressWarnings("deprecation")
	public static void profile_update(int sheetno) throws InterruptedException, IOException
	{
		
		Thread.sleep(10000);
		driver.findElement(locators.menu_button).click();
		Thread.sleep(2000);
		driver.findElement(locators.acc_menu).click();
		Thread.sleep(3000);
		
		File src =new File("E:\\Kocha SS\\Testdata\\profile-test-data.xlsx");
		FileInputStream finput =new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(finput);
		XSSFSheet sheet1 = wb.getSheetAt(sheetno);
		
		//System.out.println(sheet1);
		
	    for(int i=1;i<=sheet1.getLastRowNum();i++)
	    {
	      //Thread.sleep(10000);
		  driver.findElement(locators.edit_button).click();
		  driver.findElement(locators.uname).clear();
		  driver.findElement(locators.fname).clear();
		  driver.findElement(locators.lname).clear();
		  driver.findElement(locators.acc_email).clear();		  
		  driver.findElement(locators.bio).clear();
		  driver.findElement(locators.twitter).clear();
		  driver.findElement(locators.instagram).clear();
		  driver.findElement(locators.linkedin).clear();
		  Thread.sleep(3000);
		  //username
		  //Cell cell=sheet1.getRow(i).getCell(1);
		  //cell.setCellType(CellType.STRING);
		  //driver.findElement(locators.uname).sendKeys(cell.getStringCellValue());
		  driver.findElement(locators.gen_button).click();
		  Thread.sleep(2000);
		  
		  //firstname
		  Cell cell1=sheet1.getRow(i).getCell(1);
		  cell1.setCellType(CellType.STRING);
		  driver.findElement(locators.fname).sendKeys(cell1.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //lastname
		  Cell cell2=sheet1.getRow(i).getCell(2);
		  cell2.setCellType(CellType.STRING); 
		  driver.findElement(locators.lname).sendKeys(cell2.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //Email
		  Cell cell3=sheet1.getRow(i).getCell(3);
		  cell3.setCellType(CellType.STRING);
		  driver.findElement(locators.acc_email).sendKeys(cell3.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //About
		  Cell cell4=sheet1.getRow(i).getCell(4);
		  cell4.setCellType(CellType.STRING);
		  driver.findElement(locators.bio).sendKeys(cell4.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //Twitter
		  Cell cell5=sheet1.getRow(i).getCell(5);
		  cell5.setCellType(CellType.STRING);
		  driver.findElement(locators.twitter).sendKeys(cell5.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //Instagram
		  Cell cell6=sheet1.getRow(i).getCell(6);
		  cell6.setCellType(CellType.STRING);
		  driver.findElement(locators.instagram).sendKeys(cell6.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //LinkedIn
		  Cell cell7=sheet1.getRow(i).getCell(7);
		  cell7.setCellType(CellType.STRING);
		  driver.findElement(locators.linkedin).sendKeys(cell7.getStringCellValue());
		  Thread.sleep(2000);
		  
		  driver.findElement(locators.acc_save).click();
		  Thread.sleep(2000);
		  driver.navigate().refresh();
		  Thread.sleep(10000);
		
	    }
	    System.out.println("User Details Updated Successfully ");
	}
	
	public static void profile_image() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		driver.findElement(locators.choose_button).click();
		Thread.sleep(1000);
		WebElement element = driver.findElement(locators.acc_upload);
		element.click();
		Thread.sleep(10000);
		uploadFile("E:\\Kocha SS\\photo.png");
		Thread.sleep(10000);
		driver.findElement(locators.pro_save).click();
		Thread.sleep(10000);
		System.out.println("Profile update completed successfully");
		
	}
	public static void remove_profile() throws InterruptedException
	{
		driver.findElement(locators.choose_button).click();
		Thread.sleep(1000);
		driver.findElement(locators.remove_photo).click();
		Thread.sleep(2000);
		System.out.println("Profile picture Removed successfully");
		Thread.sleep(2000);
		driver.findElement(locators.menu_dashboard).click();
	}

	public static void setClipboard(String file) 
	{
		
		   StringSelection stringSelection = new StringSelection(file);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}
	
	public static void uploadFile(String fileLocation) throws AWTException 
	{
            setClipboard(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void connectwallet() throws InterruptedException	
	{
		Thread.sleep(3000);
		driver.findElement(locators.c_wallet).click();
		Thread.sleep(20000);
		driver.switchTo().frame(driver.findElement(locators.wallet_frame));
		Thread.sleep(3000);
		System.out.println("Inside Blockto Window");
		driver.findElement(locators.blocto_email).sendKeys(inputdata.wallet_email);
		Thread.sleep(3000);
		String blocto_button_text=driver.findElement(locators.blocto_button_text).getText();
		System.out.println(blocto_button_text);
		if(blocto_button_text.equals("SIGN IN"))
		{
			Thread.sleep(5000);
			driver.findElement(locators.blocto_signin_button).click();
			Thread.sleep(30000);
			driver.findElement(locators.confirm_wallet_button).click();
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			System.out.println("Wallet connected Successfully");
			Thread.sleep(1000);
			driver.findElement(locators.wallet_address).isDisplayed();
			String walletaddress=driver.findElement(locators.wallet_address).getText();
			driver.findElement(locators.wallet_balance).isDisplayed();
			String walletbalance=driver.findElement(locators.wallet_balance).getText();
			System.out.println("Connected Wallet Address:" + walletaddress);
			System.out.println("Connected Wallet Balance:" + walletbalance);
		}
		else if(blocto_button_text.equals("REGISTER"))
		{
			Thread.sleep(3000);
			driver.findElement(locators.blocto_signin_button).click();
			Thread.sleep(20000);
			driver.findElement(locators.confirm_wallet_button).click();
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			driver.findElement(locators.initialize_wallet_button).click();
			Thread.sleep(60000);
			driver.switchTo().frame(driver.findElement(locators.wallet_frame));
			Thread.sleep(10000);
			driver.findElement(locators.initialize_approve_button).click();
			Thread.sleep(60000);
			System.out.println("Wallet connected Successfully");
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			driver.findElement(locators.wallet_address).isDisplayed();
			String walletaddress=driver.findElement(locators.wallet_address).getText();
			driver.findElement(locators.wallet_balance).isDisplayed();
			String walletbalance=driver.findElement(locators.wallet_balance).getText();
			System.out.println("Connected Wallet Address:" + walletaddress);
			System.out.println("Connected Wallet Balance:" + walletbalance);
			
		}
		
	}
	
	public static void copywallet() throws InterruptedException
	{
       Thread.sleep(3000);
       driver.findElement(locators.copy_address).click();
       System.out.println("Wallet Address Copied Successfully");
	}
	
	public static void disconnectwallet() throws InterruptedException
	{
       Thread.sleep(3000);
       driver.findElement(locators.disconnect_wallet).click();
       System.out.println("Wallet Disconnected Successfully");
	}
	
	@SuppressWarnings("deprecation")
	public static void Transfer_Momentable(int sheetno) throws InterruptedException, IOException
	{
       Thread.sleep(3000);
       driver.findElement(locators.menu_momentables).click();
       Thread.sleep(5000); 
       String collected_count=driver.findElement(locators.collected_tab_count).getText();
       Thread.sleep(2000);
       String collected_tab_text=collected_count.replaceAll("[^0-9]","");
       int count_collected=Integer.parseInt(collected_tab_text);
       System.out.println(count_collected);
       if(count_collected==0)
       {
    	   Thread.sleep(3000);
    	   WebElement nomoentable_text=driver.findElement(locators.nomomentable);
    	   System.out.println(nomoentable_text.getText());
    	   nomoentable_text.isDisplayed();
       }else if(count_collected>0)
       {
    	 Thread.sleep(3000);
    	 driver.findElement(locators.grid_dot_icon).click();
    	 Thread.sleep(2000);
    	 driver.findElement(locators.transfer_menu).click();
    	 
    	 File src =new File("E:\\Kocha SS\\Testdata\\profile-test-data.xlsx");
 		 FileInputStream finput =new FileInputStream(src);
 		 XSSFWorkbook wb = new XSSFWorkbook(finput);
 		 XSSFSheet sheet1 = wb.getSheetAt(sheetno);
    	 
 		 for(int i=1;i<=sheet1.getLastRowNum();i++)
	     {
    	 
    	   Thread.sleep(3000);
    	   driver.findElement(locators.recepiant_address).clear();
    	   driver.findElement(locators.recepiant_email).clear();
    	   Thread.sleep(2000);
    	   
    	   Cell cell1=sheet1.getRow(i).getCell(1);
 		   cell1.setCellType(CellType.STRING);
    	   driver.findElement(locators.recepiant_address).sendKeys(cell1.getStringCellValue());
    	   Thread.sleep(2000);
    	   
    	   Cell cell2=sheet1.getRow(i).getCell(2);
 		   cell2.setCellType(CellType.STRING);
    	   driver.findElement(locators.recepiant_email).sendKeys(cell2.getStringCellValue());
    	   Thread.sleep(2000);
	    }
 		 
 		 Thread.sleep(10000);
 		 driver.findElement(locators.transfer_button).click();
 		 Thread.sleep(50000);
 		 driver.switchTo().frame(driver.findElement(locators.wallet_frame));
		 Thread.sleep(10000);
		 driver.findElement(locators.transfer_approve_button).click();
 		 Thread.sleep(50000);
		 driver.switchTo().defaultContent();
		 driver.findElement(locators.transfer_finish_button).click();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
 		 
       }

	}
	
	public static void Copy_link() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException
	{
       Thread.sleep(3000);
       driver.findElement(locators.menu_momentables).click();
       Thread.sleep(5000); 
       driver.findElement(locators.for_sale_tab).click();
       Thread.sleep(2000);
       String forsale_count=driver.findElement(locators.for_sale_tab).getText();
       String forsale_tab_text=forsale_count.replaceAll("[^0-9]","");
       int count_forsale=Integer.parseInt(forsale_tab_text);
       System.out.println(count_forsale);
       if(count_forsale==0)
       {
    	   Thread.sleep(3000);
    	   @SuppressWarnings("unused")
		   String nomoemtable_text=driver.findElement(locators.nomomentable).getText();
    	   System.out.println("No Momentables are available in your wallet");
       }else if(count_forsale>0)
       {
    	 Thread.sleep(3000);
      	 driver.findElement(locators.forsale_grid_icon).click();
      	 Thread.sleep(2000);
      	 driver.findElement(locators.copy_link_menu).click();
      	 Thread.sleep(2000);
      	 System.out.println("Marketplace Link is copied");
      	 Thread.sleep(2000);
      	 String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
      	 System.out.println("Market Place URL:"+myText);
      	 
      	 Thread.sleep(3000);
      	 //Buy Flow
      	 
      	 ((JavascriptExecutor) driver).executeScript("window.open()");
      	 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
      	 driver.switchTo().window(tabs.get(1));
      	 Thread.sleep(2000);
      	 driver.get(myText);
      	 Thread.sleep(10000);
      	 driver.findElement(locators.store_login_button).click();
      	 Thread.sleep(2000);
      	 driver.findElement(locators.store_email).sendKeys(inputdata.storefront_email);
      	 driver.findElement(locators.store_password).sendKeys(inputdata.storefront_password);
      	 Thread.sleep(2000);
      	 driver.findElement(locators.store_signin_button).click();
      	 Thread.sleep(3000);
      	 driver.findElement(locators.store_wallet_icon).click();
      	 Thread.sleep(20000);
      	 driver.switchTo().frame(driver.findElement(locators.wallet_frame));
		 Thread.sleep(3000);
		 System.out.println("Inside Blockto Window");
      	 driver.findElement(locators.store_useanother_account).click();
      	 Thread.sleep(5000);
      	 driver.findElement(locators.store_wallet_email).sendKeys(inputdata.storefront_wallet_email);
      	 
      	Thread.sleep(3000);
		String blocto_button_text=driver.findElement(locators.blocto_button_text).getText();
		System.out.println(blocto_button_text);
		if(blocto_button_text.equals("SIGN IN"))
		{
			Thread.sleep(5000);
			driver.findElement(locators.blocto_signin_button).click();
			Thread.sleep(30000);
			driver.findElement(locators.confirm_wallet_button).click();
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			System.out.println("Wallet connected Successfully");
			Thread.sleep(10000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 500)");
			Thread.sleep(5000);
			driver.findElement(locators.store_buy_button).click();
			Thread.sleep(3000);
			
			//item price
			
			   String item_price=driver.findElement(locators.NFT_sale_amount).getText();
		       String nft_sale_price=item_price.replaceAll("[^0-9]","");
		       int sale_price=Integer.parseInt(nft_sale_price);
		       
		   //Balance
		       String balance=driver.findElement(locators.store_wallet_balance).getText();
		       String storefront_wallet_balance=balance.replaceAll("[^0-9]","");
		       int wallet_balance=Integer.parseInt(storefront_wallet_balance);
		       
		   if(wallet_balance > sale_price) {
			   
			   Thread.sleep(5000);
			   driver.findElement(locators.buy_confirm).click();
			   Thread.sleep(50000);
			   driver.switchTo().frame(driver.findElement(locators.wallet_frame));
			   Thread.sleep(3000);
			   driver.findElement(locators.buy_wallet_confirm).click();
			   Thread.sleep(60000);
			   driver.switchTo().defaultContent();
			   driver.findElement(locators.Buy_success_cancel_button).click();
		   }
		       
		}
		else if(blocto_button_text.equals("REGISTER"))
		{
			
		}
      	 
       }
	}
	
	public static void Sale_Stop() throws InterruptedException
	{
		   Thread.sleep(3000);
	       driver.findElement(locators.menu_momentables).click();
	       Thread.sleep(5000); 
	       driver.findElement(locators.for_sale_tab).click();
	       Thread.sleep(2000);
	       String forsale_count=driver.findElement(locators.for_sale_tab).getText();
	       String forsale_tab_text=forsale_count.replaceAll("[^0-9]","");
	       int count_forsale=Integer.parseInt(forsale_tab_text);
	       System.out.println(count_forsale);
	       if(count_forsale==0)
	       {
	    	   Thread.sleep(3000);
	    	   @SuppressWarnings("unused")
			   String nomoemtable_text=driver.findElement(locators.nomomentable).getText();
	    	   System.out.println("No Momentables are available in your wallet");
	       }else if(count_forsale>0)
	       {
	    	 Thread.sleep(3000);
	      	 driver.findElement(locators.forsale_grid_icon).click();
	      	 Thread.sleep(2000);
	      	 String grid_name=driver.findElement(locators.grid_name).getText();
	      	Thread.sleep(2000);
	      	 driver.findElement(locators.stop_sale_dot_menu).click();
	      	 Thread.sleep(10000);
	      	 String NFT_name=driver.findElement(locators.NFT_name).getText();
	      	 if(grid_name.equals(NFT_name))
	      	 {
	      		 Thread.sleep(2000);
	      		 driver.findElement(locators.stop_sale_button).click();
	      		 Thread.sleep(2000);
	      		 driver.findElement(locators.stop_confirm_button).click();
	      		 Thread.sleep(50000);
	    		 driver.switchTo().frame(driver.findElement(locators.wallet_frame));
	   		     Thread.sleep(10000);
	   		     driver.findElement(locators.stop_blocto_approve).click();
	      	 }
	      	 }
	       }
	
	public static void Utility_tab() throws InterruptedException
	{
		   Thread.sleep(3000);
	       driver.findElement(locators.collected_tab).click();
	       Thread.sleep(5000); 
	       String collected_count=driver.findElement(locators.collected_tab_count).getText();
	       String collect_tab_text=collected_count.replaceAll("[^0-9]","");
	       int count_tab_collect=Integer.parseInt(collect_tab_text);
	       System.out.println(count_tab_collect);
	       if(count_tab_collect==0)
	       {
	    	   Thread.sleep(3000);
	    	   WebElement nomoentable_text=driver.findElement(locators.nomomentable);
	    	   System.out.println(nomoentable_text.getText());
	    	   nomoentable_text.isDisplayed();
	       }else if(count_tab_collect>0)
	       {
	    	 Thread.sleep(3000);
	      	 driver.findElement(locators.grid_dot_icon).click();
	      	 Thread.sleep(2000);
	      	 String grid_name=driver.findElement(locators.collected_tab_grid_name).getText();
	      	 Thread.sleep(2000);
	      	 driver.findElement(locators.view_menu).click();
	      	 Thread.sleep(10000);
	      	 String NFT_name=driver.findElement(locators.view_page_name).getText();
	      	 if(grid_name.equals(NFT_name))
	      	 {
	      		 Thread.sleep(2000);
	      		 driver.findElement(locators.utility_tab_menu).click();
	      	 }
	      	 }
	       }	

}