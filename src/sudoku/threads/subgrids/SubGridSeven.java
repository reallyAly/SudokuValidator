package sudoku.threads.subgrids;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alysson
 */
public class SubGridSeven extends SubGrid implements Runnable{

    public SubGridSeven(int[][] sudoku){
        super(sudoku);
    }

    @Override
    public void run() {
        for ( int i = 6; i <= 8; i++ ) {
            for ( int j = 0; j <= 2; j++ ) {
                if(this.validNumbers.contains(this.sudoku[i][j])){
                    this.nums.add(this.sudoku[i][j]);
                }else{
                    this.isValid = false;
                    break;
                }
            }
            if(!this.isValid){
                System.out.println("Sétima subgrid é INVÁLIDA \n");
                break;
            }
        }

        Collections.sort(this.nums);

        if(this.validNumbers.equals(this.nums)){
            System.out.println("Sétima subgrid é VÁLIDA \n");
        }else{
            System.out.println("Sétima subgrid é INVÁLIDA \n");
        }
    }

}
