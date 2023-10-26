public class Menu
{
	private String idm;
	private String[][] menu = new String[3][1000000];
	
	Menu(String idm, String menu[][])
	{
		this.setIdm(idm);
		this.setMenu(menu);
	}
	
	public void setIdm(String idm) 
	{
		this.idm = idm;
	}
	public String getIdm() 
	{
		return idm;
	}
	
	public void setMenu(String[][] menu) 
	{
		this.menu = menu;
	}
	public String[][] getMenu() 
	{
		return menu;
	}
}