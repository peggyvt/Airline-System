import java.util.Date;

public class Ticket 
{
	private String idt;
	private String codef;
	private Date dateissue;
	private String tickettype;
	private String seattype;
	private double ticketprice;
	private String name;
	private String main;
	private String dessert;
	private String beverage;
	
	Ticket(String idt, String codef, Date dateissue, String tickettype, String seattype, double ticketprice, String name, String main, String dessert, String beverage) 
	{
		this.setIdt(idt);
		this.setCodef(codef);
		this.setDateissue(dateissue);
		this.setTickettype(tickettype);
		this.setSeattype(seattype);
		this.setTicketprice(ticketprice);
		this.setName(name);
		this.setMain(main);
		this.setDessert(dessert);
		this.setBeverage(beverage);
	}
	
	public void setIdt(String idt) 
	{
		this.idt = idt;
	}
	public String getIdt() 
	{
		return idt;
	}
	
	public void setCodef(String codef) 
	{
		this.codef = codef;
	}
	public String getCodef() 
	{
		return codef;
	}
	
	public void setDateissue(Date dateissue) 
	{
		this.dateissue = dateissue;
	}
	public Date getDateissue() 
	{
		return dateissue;
	}

	public void setTickettype(String tickettype) 
	{
		this.tickettype = tickettype;
	}
	public String getTickettype() 
	{
		return tickettype;
	}

	public void setSeattype(String seattype) 
	{
		this.seattype = seattype;
	}
	public String getSeattype() 
	{
		return seattype;
	}
	
	public void setTicketprice(double ticketprice) 
	{
		this.ticketprice = ticketprice;
	}
	public double getTicketprice() 
	{
		return ticketprice;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setMain(String main) 
	{
		this.main = main;
	}
	public String getMain() 
	{
		return main;
	}
	
	public void setDessert(String dessert) 
	{
		this.dessert = dessert;
	}
	public String getDessert() 
	{
		return dessert;
	}

	public void setBeverage(String beverage) 
	{
		this.beverage = beverage;
	}
	public String getBeverage() 
	{
		return beverage;
	}
}