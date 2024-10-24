package q2;

import java.util.ArrayList;

public class Runner2 {
        public static void main(String[] args) {

                Matrix matrix = new Matrix();
                ArrayList<Matrix.Cell> cells = new ArrayList<Matrix.Cell>();

                matrix.set(0, 0, "Top Left");
                matrix.set(1, 1, "Center");
                matrix.set(2, 2, "Bottom Right");

                cells = matrix.getDescribedCells();

                for(Matrix.Cell cell: cells){
                        System.out.println(cell.toString());

                }

        }
}



