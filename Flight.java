import java.time.LocalTime;
import java.util.Date;

public class Flight 
{
	private String idf;
	private Date date;
	private LocalTime time;
	private String departureairport;
	private String landingairport;
	private String aircraft;
	private String idm2;
	private int totalseats;
	private int takenseats;
	private int n, m;
	private Seat[][] seat = new Seat[n][m];

	Flight(String idf, Date date, LocalTime time, String departureairport, String landingairport,
			String aircraft, String idm2, int totalseats, int takenseats, int n, int m) 
	{
		this.setIdf(idf);
		this.setDate(date);
		this.setTime(time);
		this.setDepartureairport(departureairport);
		this.setLandingairport(landingairport);
		this.setAircraft(aircraft);
		this.setIdm2(idm2);
		this.setTotalseats(totalseats);
		this.setTakenseats(takenseats);
		this.setN(n);
		this.setM(m);
	}
	
	public void setIdf(String idf) 
	{
		this.idf = idf;
	}
	public String getIdf() 
	{
		return this.idf;
	}
	
	public void setDate(Date date) 
	{
		this.date = date;
	}
	public Date getDate() 
	{
		return this.date;
	}
	
	public void setTime(LocalTime time) 
	{
		this.time = time;
	}
	public LocalTime getTime() 
	{
		return this.time;
	}
	
	public void setDepartureairport(String departureairport) 
	{
		this.departureairport = departureairport;
	}
	public String getDepartureairport() 
	{
		return this.departureairport;
	}
	
	public void setLandingairport(String landingairport) 
	{
		this.landingairport = landingairport;
	}
	public String getLandingairport() 
	{
		return this.landingairport;
	}
	
	public void setAircraft(String aircraft) 
	{
		this.aircraft = aircraft;
	}
	public String getAircraft() 
	{
		return this.aircraft;
	}
	
	public void setIdm2(String idm2) 
	{
		this.idm2 = idm2;
	}
	public String getIdm2() 
	{
		return this.idm2;
	}
	
	public void setTotalseats(int totalseats) 
	{
		this.totalseats = totalseats;
	}
	public int getTotalseats() 
	{
		return this.totalseats;
	}
	
	public void setTakenseats(int takenseats) 
	{
		this.takenseats = takenseats;
	}
	public int getTakenseats() 
	{
		return this.takenseats;
	}
	
	public void setN(int getRows) 
	{
		this.n = getRows;
	}
	public int getN() 
	{
		return this.n;
	}
	
	public void setM(int getColumns) 
	{
		this.m = getColumns;
	}
	public int getM() 
	{
		return this.m;
	}
	
	public void setSeat(Seat[][] seat) 
	{
		this.seat = seat;
	}
	public Seat[][] getSeat() 
	{
		return this.seat;
	}
}