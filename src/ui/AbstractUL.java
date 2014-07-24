/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import cinema.Theater;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public abstract class AbstractUL 
        {
    protected void listTheaters(Collection<Theater> theaters){
		for (Theater theater : theaters) {
			System.out.println(theater.getId()+": "+theater.getName()+", "+theater.getRows()+"x"+theater.getCols());
		}
	}

	protected String showMenuAndGetSelection(Scanner scanner){
		showMenu();
		return scanner.nextLine();
	}

	protected abstract void showMenu();
	protected abstract void runMainLoop();
    
          }
