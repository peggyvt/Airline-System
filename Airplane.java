public class Airplane
{
	private String id, descr;
	private int rows, columns, rowsb;
	
	Airplane(String id, String descr, int rows, int columns, int rowsb)
	{
		this.setId(id);
		this.setDescr(descr);
		this.setRows(rows);
		this.setColumns(columns);
		this.setRowsb(rowsb);
	}
	
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	
	public void setDescr(String descr) 
	{
		
		this.descr = descr;
	}
	public String getDescr() 
	{
		return this.descr;
	}
	
	public void setRows(int rows) 
	{
		this.rows = rows;
	}
	public int getRows() 
	{
		return this.rows;
	}
	
	public void setColumns(int columns) 
	{
		this.columns = columns;
	}
	public int getColumns() 
	{
		return this.columns;
	}
	
	public void setRowsb(int rowsb) 
	{
		this.rowsb = rowsb;
	}
	public int getRowsb() 
	{
		return this.rowsb;
	}
}