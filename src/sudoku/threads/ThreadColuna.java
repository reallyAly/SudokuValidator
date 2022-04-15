/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alysson
 */
public class ThreadColuna implements Runnable{

    private int[][] sudoku;

    private List<Integer> nums;

    private List<Integer> validNumbers;

    private boolean isValid;

    public ThreadColuna(int[][] sudoku){
        this.sudoku = sudoku;
        this.nums = new ArrayList<>();
        this.isValid = true;
        this.validNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Override
    public void run() {
        for ( int i = 0; i < 9; i++ ) {
            for ( int j = 0; j <9; j++ ) {
                int num = this.sudoku[j][i];
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
            System.out.println("Colunas são VÁLIDAS \n");
        }else{
            System.out.println("Colunas são INVÁLIDAS \n");
        }
    }

}
