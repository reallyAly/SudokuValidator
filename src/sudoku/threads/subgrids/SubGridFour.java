package sudoku.threads.subgrids;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alysson
 */
public class SubGridFour extends SubGrid implements Runnable{

    public SubGridFour(int[][] sudoku){
        super(sudoku);
    }

    @Override
    public void run() {
        for ( int i = 3; i <= 5; i++ ) {
            for ( int j = 0; j <= 2; j++ ) {
                if(this.validNumbers.contains(this.sudoku[i][j])){
                    this.nums.add(this.sudoku[i][j]);
                }else{
                    this.isValid = false;
                    break;
                }
            }
            if(!this.isValid){
                System.out.println("Quarta subgrid é INVÁLIDA \n");
                break;
            }
        }

        Collections.sort(this.nums);

        if(this.validNumbers.equals(this.nums)){
            System.out.println("Quarta subgrid é VÁLIDA \n");
        }else{
            System.out.println("Quarta subgrid é INVÁLIDA \n");
        }
    }

}
