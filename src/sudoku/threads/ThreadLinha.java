package sudoku.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author alysson
 */
public class ThreadLinha implements Runnable{
    
    private int[][] sudoku;
    
    private List<Integer> nums;
    
    private List<Integer> validNumbers;
    
    private boolean isValid;
    
    public ThreadLinha(int[][] sudoku){
       this.sudoku = sudoku;
       this.nums = new ArrayList<>();
       this.isValid = true;
       this.validNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Override
    public void run() {
        for ( int i = 0; i < 9; i++ ) {
            for ( int j = 0; j < 9; j++ ) {
                int num = this.sudoku[i][j];
                if((!this.nums.contains(num)) && this.validNumbers.contains(num)){
                    this.nums.add(num);
                }else{
                    this.isValid = false;
                    break;
                }
            }
            if(!this.isValid){
                break;
            }
            this.nums.clear();
        }
        if(this.isValid){
            System.out.println("Linhas são VÁLIDAS \n");
        }else{
            System.out.println("Linhas são INVÁLIDAS \n");
        }
    }
}
