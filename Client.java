import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;
import java.util.ArrayList;

public class Client 
{
	public static void main(String[] args) throws ParseException 
	{
		
		String id, descr, idm, idf, date1, time1, departureairport, landingairport, aircraft, idm2, idt, codef, dateissue1, tickettype, seattype, name, ticketid, useridt;
		
		String[][] menu = new String[3][1000000];
		
		int rows, columns, rowsb, num, totalseats, takenseats = 0, n, m, nb;
		
		Double ticketprice;
		
		Date date, dateissue;
		
		LocalTime time;
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		do
		{
			do 
			{
				System.out.println("Please select one of the following numbers:");
				System.out.printf("[1] Insert Airplane\n" + 
						"[2] Insert Menu\n" + 
						"[3] Insert Flight\n" + 
						"[4] Cancel Flight\n" + 
						"[5] Book Ticket\n" + 
						"[6] Cancel Ticket\n" + 
						"[7] Order Menu Items (Available only in Business Seats)\n" + 
						"[8] Seats Capacity for a certain Flight\n" + 
						"[0] Exit\n-> ");
	
			    num = sc.nextInt();
			    
			    if((num != 1) && (num != 2) && (num != 3) && (num != 4) && (num != 5) && (num != 6) && (num != 7) && (num != 8) && (num != 0))
			    {
			    	System.out.println("\nWrong Input.\n");
			    }
			}
			while((num != 1) && (num != 2) && (num != 3) && (num != 4) && (num != 5) && (num != 6) && (num != 7) && (num != 8) && (num != 0));
			
			ArrayList<Airplane> ArrayAirplane = new ArrayList<Airplane>();
			ArrayList<Menu> ArrayMenu = new ArrayList<Menu>();
			ArrayList<Flight> ArrayFlight = new ArrayList<Flight>();
			ArrayList<Ticket> ArrayTicket = new ArrayList<Ticket>();
			ArrayList<Seat> ArraySeat = new ArrayList<Seat>();
			
			if(num == 1)
			{
				System.out.printf("Please enter the unique id of the Airplane.\n-> ");
				id = sc.next();
				
				System.out.printf("Please enter a description of the Airplane.\n-> ");
				descr = sc.next();
				
				System.out.printf("Please enter the total rows of the Airplane.\n-> ");
				rows = sc.nextInt();
				
				System.out.printf("Please enter the columns of the Airplane.\n-> ");
				columns = sc.nextInt();
				
				System.out.printf("Please enter the rows of business class of the airplane.\n-> ");
				rowsb = sc.nextInt();
				
				Airplane Airplane1 = new Airplane(id, descr, rows, columns, rowsb);
				
				int w = 0;
				
				for(int i=0; i<ArrayAirplane.size(); i++)
				{
					if(id.equals((ArrayAirplane).get(i).getId()))
					{
						System.out.println("\nThe id you entered already exists.\n");
						w = 1;
						id = null;
						break;
					}
				}
				
				if(w == 0)
				{
					ArrayAirplane.add(Airplane1);
				}
			} //end if 1
			else if(num == 2)
			{
				
				System.out.printf("Please enter the unique id of the menu.\n-> ");
				idm = sc.next();
				
				//main plates
				int r = 0;
				String answer = "Y";
				while(answer.equals("Y"))
				{
					System.out.printf("Please enter a main plate to the menu.\n-> ");
					menu[0][r] = sc.next();
					r++;
					
					do
					{
						System.out.printf("Would you like to continue adding main plates to the menu?(Y/N)\n-> ");
						answer = sc.next();
					}
					while(!(answer.equals("Y")) && !(answer.equals("N")));	
				}
				
				//desserts
				r = 0;
				answer = "Y";
				while(answer.equals("Y"))
				{
					System.out.printf("Please enter a dessert to the menu.\n-> ");
					menu[1][r] = sc.next();
					r++;
					
					do
					{
						System.out.printf("Would you like to continue adding desserts to the menu?(Y/N)\n-> ");
						answer = sc.next();
					}
					while(!(answer.equals("Y")) && !(answer.equals("N")));	
				}
				
				//beverages
				r = 0;
				answer = "Y";
				while(answer.equals("Y"))
				{
					System.out.printf("Please enter a beverage to the menu.\n-> ");
					menu[2][r] = sc.next();
					r++;
					
					do
					{
						System.out.printf("Would you like to continue adding beverages to the menu?(Y/N)\n-> ");
						answer = sc.next();
					}
					while(!(answer.equals("Y")) && !(answer.equals("N")));	
				}
				
				Menu Menu1 = new Menu(idm, menu);
				
				ArrayMenu.add(Menu1);
				
				int w = 0;
				
				for(int i=0; i<ArrayMenu.size()-1; i++)
				{
					if(idm.equals((ArrayMenu).get(i).getIdm()))
					{
						System.out.println("The id you entered already exists.\n");
						w = 1;
						break;
					}
				}
				if(w==1)
				{
					ArrayMenu.remove(Menu1);
				}
				
			} //end if 2
			else if(num == 3)
			{
				System.out.printf("Please enter the unique id of the flight.\n-> ");
				idf = sc.next();
				
				System.out.printf("Please enter the date of the aircraft departure.(dd-mm-yyyy)\n-> ");
				date1 = sc.next();
				date = sdf.parse(date1); 
				
				System.out.printf("Please enter the time of the aircraft deperature.(hh:mm)\n-> ");
				time1 = sc.next();
				time = LocalTime.parse(time1);
				
				System.out.printf("Please enter the departure airport of the aircraft.\n-> ");
				departureairport = sc.next();
				
				System.out.printf("Please enter the landing airport of the aircraft.\n-> ");
				landingairport = sc.next();
				
				System.out.printf("Please enter the aircraft.\n-> ");
				aircraft = sc.next();
				
				System.out.printf("Please enter the menu code of the flight.\n-> ");
				idm2 = sc.next();
				
				System.out.printf("Please enter the number of total seats of the aircraft.\n-> ");
				totalseats = sc.nextInt();
				
				takenseats = 0;
				
				int q = 0;
				
				for(int i=0; i<ArrayFlight.size(); i++)
				{
					if(idf.equals((ArrayFlight).get(i).getIdf()))
					{
						q=i;
						break;
					}
				}
				
				Flight Flight1 = new Flight(idf, date, time, departureairport, landingairport, aircraft, idm2, totalseats, takenseats, 0, 0);
				
				ArrayFlight.add(Flight1);
				
				int w = 0;
				
				for(int i=0; i<ArrayFlight.size()-1; i++)
				{
					if(date.equals((ArrayFlight).get(i).getDate()) && aircraft.equals((ArrayFlight).get(i).getAircraft()))
					{
						System.out.println("\nThere is already one flight programmed for that day.\n");
						w = 1;
						break;
					}
				}
				
				if(w == 1)
				{
					ArrayFlight.remove(Flight1);
				}
			} //end if 3
			else if(num == 4)
			{
				System.out.printf("Please enter the id of the flight you wish to cancel.\n-> ");
				String idc = sc.next();
				
				int a=0;
				for(int i=0; i<ArrayFlight.size(); i++)
				{
					if(idc.equals((ArrayFlight).get(i).getIdf()))
					{
						ArrayFlight.remove(i);
						
						System.out.printf("\nThe flight is now cancelled.\n");
						a=1;
						
						for(int j=0; j<ArrayTicket.size(); j++)
						{
							System.out.printf(ArrayTicket.get(j).getName() + ArrayTicket.get(j).getTicketprice() + "EUR\n\n");
						}
						
						ArrayTicket.remove(i);
					}
				}
				if(a==0)
				{
					System.out.println("\nThe flight id you entered doesn't exist.\n");
				}
			} //end if 4
			else if(num == 5)
			{
				String main = null, dessert = null, beverage = null;
				
				System.out.printf("Please enter the unique id of the ticket.\n-> ");
				idt = sc.next();
				
				System.out.printf("Please enter the flight code of the ticket.\n-> ");
				codef = sc.next();
				
				System.out.printf("Please enter the date issue of the ticket.(dd-mm-yyyy)\n-> ");
				dateissue1 = sc.next();
				dateissue = sdf.parse(dateissue1);
				
				System.out.printf("Please enter the ticket type.\n-> ");
				tickettype = sc.next();
				
				System.out.printf("Please enter the seat type.(Economy/Business)\n-> ");
				seattype = sc.next();
				
				System.out.printf("Please enter the ticket price.\n-> ");
				ticketprice = sc.nextDouble();
				
				System.out.printf("Please enter your full name.\n-> ");
				name = sc.next();
				
				takenseats += 1;
				
				Ticket Ticket1 = new Ticket(idt, codef, dateissue, tickettype, seattype, ticketprice, name, main, dessert, beverage);
				
				ArrayTicket.add(Ticket1);
				
			    for(int i=0; i<ArrayTicket.size(); i++)
				{
					if(codef.equals(ArrayTicket.get(i).getCodef()))
					{
						int r = ArrayAirplane.get(i).getRows();
						int c = ArrayAirplane.get(i).getColumns();
						int rb = ArrayAirplane.get(i).getRowsb();
						
						int re = r - rb;
						
						int totale = re * c;
						int totalb = rb * c;
						
						if((totale <= 0) && (ArrayTicket.get(i).getSeattype().equals("Economy")))
						{
							ArrayTicket.remove(i);
							System.out.println("Remove");
						}
						else if((totalb <= 0) && (ArrayTicket.get(i).getSeattype().equals("Business")))
						{
							ArrayTicket.remove(i);
						}
						
						i++;
						
						break;
					}
				}
			    
			    if(seattype.equals("Economy"))
			    {
			    	EconomySeat EconomySeat1 = new EconomySeat(null, null, 0, 0);
			    }
			    else if(seattype.equals("Business"))
			    {
			    	BusinessSeat BusinessSeat1 = new BusinessSeat(null, null, 0, 0);
			    }
			}//end if 5
			else if(num == 6)
			{
                int a = 0;
                
                System.out.printf("Please enter the ticket id you wish to delete.\n-> ");
                ticketid = sc.next();
               
                for (int i=0; i<ArrayTicket.size(); i++) 
                {
                    if(ticketid.equals(ArrayTicket.get(i).getIdt()))
                    {
                        ArrayTicket.remove(i);                                          
                        System.out.printf("\nThe ticket is now deleted.\n");
                        a = 1;
                    }
                    
                    if(a == 0)
                    {
                    	System.out.printf("\nThe ticket id you entered doesn't exist.\n");
                    }
                }
			} //end if 6
			else if(num == 7)
			{
				System.out.printf("Please enter your ticket id.\n-> ");
				useridt = sc.next();
				
				int t=0;
				
				for(int i=0; i<ArrayTicket.size(); i++)
				{
					if(useridt.equals(ArrayTicket.get(i).getIdt()))
					{
						t=i;
						break;
					}
				}
				
				if(ArrayTicket.get(t).getSeattype().equals("Business"))
				{
					System.out.println("Menu:\n");
					System.out.print(ArrayMenu.get(t).getMenu() + "\n");
					
					System.out.printf("Please enter one of the above main plates you wish to eat.\n-> ");
					String main = sc.next();
					
					System.out.printf("Please enter one of the above desserts you wish to eat.\n-> ");
					String dessert = sc.next();
					
					System.out.printf("Please enter one of the above beverages you wish to drink.\n-> ");
					String beverage = sc.next();
					
					Ticket Ticket2 = new Ticket(ArrayTicket.get(t).getIdt(), ArrayTicket.get(t).getCodef(), ArrayTicket.get(t).getDateissue(), ArrayTicket.get(t).getTickettype(), ArrayTicket.get(t).getSeattype(), ArrayTicket.get(t).getTicketprice(), ArrayTicket.get(t).getName(), main, dessert, beverage);
					
					ArrayTicket.set(t, Ticket2);
				}
			} //end if 7
			else if(num == 8)
			{
				int f = 0;
				
				do
				{
					System.out.printf("Please enter the flight code to view the capacity of the specific flight.\n-> ");
					String flightcode = sc.next();
					
					for(int i=0; i<ArrayFlight.size(); i++)
					{
						if(flightcode.equals(ArrayFlight.get(i).getIdf()))
						{
							f = i;
							break;
						}
					}
					
					if(f == 0)
					{
						System.out.println("This flight code doesn't exist.\n");
					}
				}
				while(f == 0);
				
				String[][] seat = new String[ArrayAirplane.get(f).getColumns()][ArrayAirplane.get(f).getRows()];
				
				for(int i=0; i<ArrayAirplane.get(f).getColumns(); i++)
				{
					for(int j=0; j<ArrayAirplane.get(f).getRows(); j++)
					{
						seat[i][j] = "[ ]";
					}
				}
					
				int rb = ArrayAirplane.get(f).getRowsb();
				
				for(int e=0; e<ArrayTicket.size(); e++)
				{
					if(ArrayTicket.get(e).getSeattype().equals("Economy"))
					{
						seat[ArraySeat.get(e).getNumcolumn()][ArraySeat.get(e).getNumrow()] = "[X]";
					}
					else if(ArrayTicket.get(e).getSeattype().equals("Business")) 
					{
						seat[ArraySeat.get(e).getNumcolumn()][ArraySeat.get(e).getNumrow()] = "[[X]]";
					}
				}
				
				for(int i=0; i<ArrayAirplane.get(f).getRows(); i++)
				{
					for(int j=0; j<ArrayAirplane.get(f).getColumns(); j++)
					{
						System.out.printf(seat[j][i]);
					}
					System.out.println("");
				}
			} //end if 8
		}
		while(num != 0); //end loop
	} //end main
} //end class