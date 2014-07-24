/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

/**
 *
 * @author abdullah
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Hour;
import cinema.Theater;
import model.Ticket;

public class TellerUL extends AbstractUL{

	public static void main(String[] args) {
		TellerUL ui = new TellerUL();
		ui.runMainLoop();
	}

	@Override
	protected void showMenu() {
		System.out.println();
		System.out.println("Please make a selection:");
		System.out.println("1. List theatres");
		System.out.println("2. Sell ticket");
		System.out.println("q. Quit");
	}

	@Override
	protected void runMainLoop() {
		Map<Integer, Theater> theaters = new HashMap<>();
		Collection<Ticket> tickets = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String line = "";

		theaters.put(1, new Theater(1, "Salon A", 5, 5));
		theaters.put(2, new Theater(2, "Salon B", 4, 5));
		theaters.put(3, new Theater(3, "Salon C", 5, 8));

		while(!(line = showMenuAndGetSelection(scanner)).equals("q")){
			int selection = Integer.parseInt(line);
			switch (selection) {
			case 1:
				listTheaters(theaters.values());
				break;
			case 2:
				sellTickets(scanner, theaters, tickets);
				break;

			default:
				System.out.println("Invalid choice, please try again.");
				break;
			}
		}
	}

	private void sellTickets(Scanner scanner, 
			Map<Integer, Theater> theaters, Collection<Ticket> tickets){
		System.out.println("Select a theater:");
		listTheaters(theaters.values());
		Integer selectedTheaterId = Integer.valueOf(scanner.nextLine());
		Theater selectedTheater = theaters.get(selectedTheaterId);
		if(selectedTheater==null){
			System.out.println("Wrong selection");
			return;
		}
		System.out.println("Select an hour:");
		listAllHours();
		Integer selectedHourIndex = Integer.valueOf(scanner.nextLine());
		Hour selectedHour = Hour.values()[selectedHourIndex-1];
		Ticket ticket = new Ticket(1, 1, selectedHour, selectedTheater); //FIXME: placement
		tickets.add(ticket);
		System.out.println(ticket);
	}

	private void listAllHours(){
		int i = 1;
		for (Hour hour : Hour.values()) {
			System.out.println(i+": "+hour.getFormattedHour()+", Price: $"+hour.getPrice());
			i++;
		}
	}















}