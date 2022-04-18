package collector;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case {
	
	@BeforeTest
	public static void launch()
	{
		Collector_Functions.BrowserLaunch();
	}
	@Test(priority=1)
	public static void signin() throws InterruptedException
	{
		Collector_Functions.signin();
	}
	@Test(priority=2)
	public static void profile() throws InterruptedException, IOException
	{
		Collector_Functions.profile_update(0);
	}
	@Test(priority=3)
	public static void profile_image() throws InterruptedException, AWTException
	{
		Collector_Functions.profile_image();
	}
	@Test(priority=4)
	public static void remove_image() throws InterruptedException
	{
		Collector_Functions.remove_profile();
	}
	@Test(priority=5)
	public static void connect_wallet() throws InterruptedException
	{
		Collector_Functions.connectwallet();
		Collector_Functions.copywallet();
		//Collector_Functions.disconnectwallet();
	}
	
	@Test(priority=6)
	public static void transfer_momentabe() throws InterruptedException, IOException
	{
		Collector_Functions.Transfer_Momentable(1);
	}
	
	@Test(priority=7)
	public static void copy_the_link() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException
	{
		Collector_Functions.Copy_link();
	}
	
	@Test(priority=8)
	public static void stop_sale() throws InterruptedException
	{
		Collector_Functions.Sale_Stop();
		//Collector_Functions.Utility_tab();
	}
}
	
	