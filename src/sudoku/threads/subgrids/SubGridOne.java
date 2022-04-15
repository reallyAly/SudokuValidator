package sudoku.threads.subgrids;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alysson
 */
public class SubGridOne extends SubGrid implements Runnable{

    public SubGridOne(int[][] sudoku){
        super(sudoku);
    }

    @Override
    public void run() {
        for ( int i = 0; i <= 2; i++ ) {
            for ( int j = 0; j <= 2; j++ ) {
                if(this.validNumbers.contains(this.sudoku[i][j])){
                    this.nums.add(this.sudoku[i][j]);
                }else{
                    this.isValid = false;
                    break;
                }
            }
            if(!this.isValid){
                System.out.println("Primeira subgrid é INVÁLIDA \n");
                break;
            }
        }

        Collections.sort(this.nums);

        if(this.validNumbers.equals(this.nums)){
            System.out.println("Primeira subgrid é VÁLIDA \n");
        }
    }
    
}
