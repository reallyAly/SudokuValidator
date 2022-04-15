package sudoku;

import java.util.List;
import java.util.Scanner;

public class Sudoku {
    
    private int linhas;
    private int colunas;
    private int[][] matriz;
    private int[] diagonalPrincipal;
    private int[] diagonalSecundaria;
    private Boolean isMatrizQuadrada = false;

    /**
     * Constructor for objects of class Sudoku
     */
    public Sudoku() {
        this.linhas = 9;
        this.colunas = 9;
        this.matriz = new int[this.linhas][this.colunas];

        this.gerarMatriz();
    }

    // generating data
    private void gerarMatriz(){
        for ( int i = 0 ; i < this.linhas ; i++ ) {
            for ( int j = 0 ; j < this.colunas ; j++ ) {
                int randomNumber = (int)Math.round(Math.random()*9);
                this.matriz[i][j] = randomNumber;
            }
        }
    }

    // output
    public void printMatriz(){
        for ( int i = 0 ; i < this.linhas ; i++ ) {
            for ( int j = 0 ; j < this.colunas ; j++ ) {
                System.out.print( matriz[i][j] + "\t" );
            }
            System.out.println();
        }
    }

    public void preencherSudoku(List<Integer> validSudoku){
        int counter = 0;
        for ( int i = 0 ; i < this.linhas ; i++ ) {
            for ( int j = 0 ; j < this.colunas ; j++ ) {
                this.matriz[i][j] = validSudoku.get(counter);
                counter++;
            }
        }
    }

    public void preencherSudoku(){
        Scanner read = new Scanner(System.in);
        for ( int i = 0 ; i < this.linhas ; i++ ) {
            for ( int j = 0 ; j < this.colunas ; j++ ) {
                System.out.println("Insira o número \n");
                int num = read.nextInt();
                this.matriz[i][j] = num;
            }
        }
    }
    
    public int[][] getMatriz(){
        return this.matriz;
    }

}