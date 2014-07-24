/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import cinema.Theater;

/**
 *
 * @author abdullah
 */
public class Ticket {
    private int id;
    private int row;
    private int col;

    public int getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Hour getHour() {
        return hour;
    }

    public Ticket(int id, int row, int col, Hour hour, Theater theater) {
        this.id = id;
        this.row = row;
        this.col = col;
        this.hour = hour;
        this.theater = theater;
    }
    public Ticket( int row, int col, Hour hour, Theater theater) {
        this.id = id;
        this.row = row;
        this.col = col;
        this.hour = hour;
        this.theater = theater;
    }

    public Theater getTheater() {
        return theater;
    }
    private Hour hour;
    private Theater theater;
    
}
