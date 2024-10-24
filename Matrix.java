package q2;

import java.util.ArrayList;

public class Matrix {

    public class Cell {
        private int row;
        private int column;
        private String description;

        public Cell(int row, int column, String description) {
            this.row = row;
            this.column = column;
            this.description = description;
        }

        @Override
        public String toString() {
            return "Cell at (Row: " + row + ", Column: " + column + ") " + description ;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }
    }

    ArrayList<Cell> cells = new ArrayList<Cell>();
    public void set(int row, int col, String description ){
        cells.add(new Cell(row, col, description));
    }

    public ArrayList<Cell> getDescribedCells(){
        return cells;
    }


}


