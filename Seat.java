import java.util.Scanner;

public abstract class Seat 
{
	private String ids, ticket;
	private int numrow, numcolumn;
	
	Seat(String ids, String ticket, int numrow, int numcolumn)
	{
		this.setIds(ids);
		this.setTicket(ticket);
		this.setNumrow(numrow);
		this.setNumcolumn(numcolumn);
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void setIds(String ids) 
	{
		System.out.printf("Please enter the unique id of the seat.\n-> ");
		this.ids = sc.next();
	}
	public String getIds() 
	{
		return this.ids;
	}
	
	public void setTicket(String ticket) 
	{
		System.out.printf("Please enter the ticket of the seat.\n-> ");
		this.ticket = sc.next();
	}
	public String getTicket() 
	{
		return this.ticket;
	}
	
	public void setNumrow(int numrow) 
	{
		System.out.printf("Please enter the number of row of the seat.\n-> ");
		this.numrow = sc.nextInt();
	}
	public int getNumrow() 
	{
		return this.numrow;
	}
	
	public void setNumcolumn(int numcolumn) 
	{
		System.out.printf("Please enter the number of column of the seat.\n-> ");
		this.numcolumn = sc.nextInt();
	}
	public int getNumcolumn() 
	{
		return this.numcolumn;
	}
}