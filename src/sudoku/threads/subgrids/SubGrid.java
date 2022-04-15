package sudoku.threads.subgrids;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class SubGrid {
    protected int[][] sudoku;

    protected List<Integer> nums;

    protected List<Integer> validNumbers;

    protected boolean isValid;

    public SubGrid(int[][] sudoku){
        this.sudoku = sudoku;
        this.nums = new ArrayList<>();
        this.isValid = true;
        this.validNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
