/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author abdullah
 */
public enum Hour {
    TEN(10,5),
    TWELVE(12,7),
    FOURTEEN(14,7),
    SIXTEEN(16,7),
    EIGTEEN(18,7),
    TWENTY(20,12),
    TWENTYTWO(22,12),
    TWENTYFOUR(24,12);
    private int hour;
    private int price;
    
    private Hour(int hour,int price)
    {
    this.hour=hour;
    this.price=price;
    }

    public int getHour() {
        return hour;
    }

    public int getPrice() {
        return price;
    }
    public String getFormattedHour()
    {
        return getHour()+":00";
    }
    
}
