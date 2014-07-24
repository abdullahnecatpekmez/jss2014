/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinema;

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
    
    
    
}
