package sudoku.threads.subgrids;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alysson
 */
public class SubGridNine extends SubGrid implements Runnable{

    public SubGridNine(int[][] sudoku){
        super(sudoku);
    }

    @Override
    public void run() {
        for ( int i = 6; i <= 8; i++ ) {
            for ( int j = 6; j <= 8; j++ ) {
                if(this.validNumbers.contains(this.sudoku[i][j])){
                    this.nums.add(this.sudoku[i][j]);
                }else{
                    this.isValid = false;
                    break;
                }
            }
            if(!this.isValid){
                System.out.println("Nona subgrid é INVÁLIDA \n");
                break;
            }
        }

        Collections.sort(this.nums);

        if(this.validNumbers.equals(this.nums)){
            System.out.println("Nona subgrid é VÁLIDA \n");
        }else{
            System.out.println("Nona subgrid é INVÁLIDA \n");
        }
    }

}
