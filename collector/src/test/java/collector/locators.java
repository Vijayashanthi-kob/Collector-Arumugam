package collector;
import org.openqa.selenium.By;
public class locators {
	
	
	public static By email=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[1]/input");
	public static By password=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[2]/div/input");
	public static By login_button=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[4]/button");
    
	//profile page
	public static By menu_button=By.xpath("//*[@id=\"headlessui-menu-button-11\"]");
    public static By acc_menu=By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div/div[5]/div/a[1]");
    public static By edit_button=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div/div/button");
    public static By uname=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[1]/div/input");
    public static By gen_button=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[1]/div/button");
    public static By fname=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[2]/input");
    public static By lname=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[3]/input");
    public static By acc_email=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[4]/input");
    public static By bio=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[6]/textarea");
    public static By twitter=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[7]/input");
    public static By instagram=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[8]/input");
    public static By linkedin=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[9]/input");
    public static By acc_save=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[3]/button[2]");
    public static By choose_button=By.xpath("//*[@id=\"banner\"]/div/div[1]/div[1]/div/a");
    public static By acc_upload=By.xpath("//*[@id=\"banner\"]/div/div[1]/div[1]/div[2]/a[1]");
    public static By remove_photo=By.xpath("//*[@id=\"banner\"]/div/div[1]/div[1]/div[2]/a[2]");
    public static By pro_save=By.xpath("//*[@id=\"banner\"]/div/div[1]/div[1]/div[2]/div/div[3]/button[1]");
    public static By pro_complete=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[2]/div[1]/div[3]/h1/span[2]");
    
    //Connect Wallet
    
    public static By c_wallet=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[1]/div[2]/div/div[1]/div/button");
    public static By wallet_frame=By.xpath("//*[@id=\"FCL_IFRAME\"]");
    public static By blocto_email=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/input");
    public static By blocto_button_text=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button/div[1]/span");
    public static By blocto_signin_button=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button");
    public static By confirm_wallet_button=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button[1]");
    public static By disconnect_wallet=By.xpath("//*[@id=\"__next\"]/div/div/div/div/main/div/div/div/div[1]/div[2]/div/div[1]/div[2]/button");
    public static By initialize_wallet_button=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[1]/div[2]/div/button");
    public static By initialize_approve_button=By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/button");
    public static By wallet_address=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/span");
    public static By wallet_balance=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[3]/span");
    public static By copy_address=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/img");
    
    //Transfer Momentables
    public static By collected_tab_count=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/main/div/div/div[2]/div[1]");
    public static By nomomentable=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/section/div/h1");
    public static By grid_dot_icon=By.xpath("/html/body/div/div/div/div[2]/div/main/div/div/div[3]/section/div/div[1]/div/div[1]/span");
    public static By transfer_menu=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/section/div/div[1]/div/div[1]/div/ul/li[3]");
    public static By recepiant_address=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/div[2]/input");
    public static By recepiant_email=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/div[3]/input");
    public static By transfer_button=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/main/div/div/div[3]/div/div[2]/div[5]/button");
    public static By transfer_approve_button=By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/button");
    public static By transfer_finish_button=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/div[3]/button");
    
    
    //For sale Tab Copy Link
    public static By collected_tab=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/main/div/div/div[2]/div[1]");
    public static By for_sale_tab=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div[2]");
    public static By forsale_grid_icon=By.xpath("/html/body/div/div/div/div[2]/div[2]/main/div/div/div[4]/section/div/div[1]/div/div[1]/span");
    public static By copy_link_menu=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[4]/section/div/div[1]/div/div[1]/div/ul/li[3]");
    
    //storefront
    
    public static By store_login_button=By.xpath("//*[@id=\"__next\"]/main/nav/div/div/ul/li[1]/button");
    public static By store_email=By.xpath("//*[@id=\"email\"]");
    public static By store_password=By.xpath("//*[@id=\"password\"]");
    public static By store_signin_button=By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/form/div[3]/button");
    public static By store_wallet_icon=By.xpath("//*[@id=\"__next\"]/main/nav/div/div/ul/li[1]");
    public static By store_useanother_account=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button[2]");
    public static By store_wallet_email=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/input");
    public static By store_wallet_signin_text=By.xpath("//*[@id=\\\"app\\\"]/div/div[2]/div[2]/div/button/div[1]/span");
    public static By store_wallet_signin_button=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button");
    public static By store_buy_button=By.xpath("//*[@id=\"stickyContainer\"]/div/div/div[1]/button");
    public static By NFT_sale_amount=By.xpath("//*[@id=\"stickyContainer\"]/div[1]/div[2]/div/div[1]/table/tbody/tr[3]/td");
    public static By store_wallet_balance=By.xpath("//*[@id=\"stickyContainer\"]/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td");
    public static By buy_confirm=By.xpath("//*[@id=\"stickyContainer\"]/div[1]/div[2]/div/div[2]/button");
    public static By buy_wallet_confirm=By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/button");
    public static By Buy_success_cancel_button=By.xpath("/html/body/div[2]/div/div[6]/button[3]");
    
    
    //Stop Sale
    
    public static By stop_sale_dot_menu=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[4]/section/div/div[1]/div/div[1]/div/ul/li[2]");
    public static By grid_name=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[4]/section/div/div[1]/div/div[3]/h2");
    public static By NFT_name=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/main/div/div[2]/div[2]/div[1]/div[2]/h1");
    public static By stop_sale_button=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[2]/div[2]/div[1]/button");
    public static By stop_confirm_button=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    public static By stop_blocto_approve=By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/button");
    
    public static By collected_tab_grid_name=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/section/div/div[1]/div/div[3]/h2");
    public static By view_menu=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/section/div/div[1]/div/div[1]/div/ul/li[1]");
    public static By view_page_name=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[2]/div[2]/div[1]/div[2]/h1");
    public static By utility_tab_menu=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[2]/div[2]/div[2]/div/ul/li[3]");
    //Menu
    public static By menu_dashboard=By.xpath("/html/body/div/div/div/div/div[1]/div[2]/nav/a[1]");
    public static By menu_momentables=By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div[2]/nav/a[2]");

}
