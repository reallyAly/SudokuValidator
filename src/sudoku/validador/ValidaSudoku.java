package sudoku.validador;

import sudoku.threads.ThreadColuna;
import sudoku.threads.ThreadLinha;
import sudoku.threads.subgrids.*;
import sudoku.Sudoku;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alysson
 */
public class ValidaSudoku {
      
    public static void main(String[] args) throws InterruptedException {
        List<Integer> validSudoku = Arrays.asList(
                2,3,7,8,4,1,5,6,9,
                1,8,6,7,9,5,2,4,3,
                5,9,4,3,2,6,7,1,8,
                3,1,5,6,7,4,8,9,2,
                4,6,9,5,8,2,1,3,7,
                7,2,8,1,3,9,4,5,6,
                6,4,2,9,1,8,3,7,5,
                8,5,3,4,6,7,9,2,1,
                9,7,1,2,5,3,6,8,4
        );

        Sudoku meuSudoku = new Sudoku();

        meuSudoku.preencherSudoku(validSudoku);

        meuSudoku.printMatriz();

        Thread tColuna = new Thread(new ThreadColuna(meuSudoku.getMatriz()));
        Thread tLinha = new Thread(new ThreadLinha(meuSudoku.getMatriz()));
        Thread tSubGridOne = new Thread(new SubGridOne(meuSudoku.getMatriz()));
        Thread tSubGridTwo = new Thread(new SubGridTwo(meuSudoku.getMatriz()));
        Thread tSubGridThree = new Thread(new SubGridThree(meuSudoku.getMatriz()));
        Thread tSubGridFour = new Thread(new SubGridFour(meuSudoku.getMatriz()));
        Thread tSubGridFive = new Thread(new SubGridFive(meuSudoku.getMatriz()));
        Thread tSubGridSix = new Thread(new SubGridSix(meuSudoku.getMatriz()));
        Thread tSubGridSeven = new Thread(new SubGridSeven(meuSudoku.getMatriz()));
        Thread tSubGridEight = new Thread(new SubGridEight(meuSudoku.getMatriz()));
        Thread tSubGridNine = new Thread(new SubGridNine(meuSudoku.getMatriz()));

        System.out.println();

        tColuna.start();
        tColuna.join();

        tLinha.start();
        tLinha.join();

        tSubGridOne.start();
        tSubGridOne.join();

        tSubGridTwo.start();
        tSubGridTwo.join();

        tSubGridThree.start();
        tSubGridThree.join();

        tSubGridFour.start();
        tSubGridFour.join();

        tSubGridFive.start();
        tSubGridFive.join();

        tSubGridSix.start();
        tSubGridSix.join();

        tSubGridSeven.start();
        tSubGridSeven.join();

        tSubGridEight.start();
        tSubGridEight.join();

        tSubGridNine.start();
        tSubGridNine.join();
    }
}