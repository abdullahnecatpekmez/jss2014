/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinema;

import java.util.Arrays;
import java.util.Collection;
import model.Hour;
import model.Ticket;

/**
 *
 * @author abdullah
 */
public class Theater {
            private int id;
            private String name;
            private int rows;
            private int cols;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRows() {
        return rows;
    }

    public Theater(int id, String name, int rows, int cols) {
                this.id = id;
                this.name = name;
                this.rows = rows;
                this.cols = cols;
    }
      public Theater(String name, int rows, int cols) {
                this.name = name;
                this.rows = rows;
                this.cols = cols;
    }

    public int getCols() {
        return cols;
    }
    public boolean [][]getEmtySeats(Collection<Ticket>tickets,Hour hour)
    {
        boolean[][] emptySeats=new boolean[rows][cols];
         for (int i = 0; i < emptySeats.length; i++) {
         boolean[]currentRow=emptySeats[i];
         Arrays.fill(currentRow,true);
        }
         for(Ticket ticket:tickets)
         {
         
         if(ticket.getTheater().equals(this)&& ticket.getHour().equals(hour))
         {
        emptySeats[ticket.getRow()-1]);
       }
            
        }
    return null;
    }
    public Collection<Ticket> getContiguousSeats(Collection<Ticket> tickets, Hour hour, int numPeople){
 		boolean[][] emptySeats = getEmptySeats(tickets, hour);
 		int counter = 0;
 		Collection<Ticket> result = new ArrayList<>();
 			counter = 0;
 			boolean[] currentRow = emptySeats[i];
 			for (int j = 0; j < currentRow.length; j++) {
 				if(currentRow[j]){
 					counter++;
 				}else{
 					counter = 0;
 				}
 				if(counter == numPeople){
 					for (int k = 0; k < numPeople; k++) {
 						result.add(new Ticket(i+1, j+1-k, hour, this));
 					}
 					return result;
 				}
 			}
 		}
 		return result;
 	}
    
    
}
