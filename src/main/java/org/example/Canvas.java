package org.example;

import java.awt.*;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
        initializeMatrix();
    }

    private void initializeMatrix() {
        for (int i = 0; i < height + 2; i++) {
            for (int j = 0; j < width + 2; j++) {
                matrix[i][j] = ' ';
            }
        }
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public char[][] getMatrix() {
        return matrix;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public void setPoint(double x, double y, char c) {
        int roundedX = (int) Math.round(x);
        int roundedY = (int) Math.round(y);

        if(roundedX < 0 || roundedY < 0 || roundedY >= matrix.length || roundedX >= matrix[0].length){
          return;
        }
        matrix[roundedY][roundedX] = c;
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] != 0){
                    setPoint(x + y, y + i, c);
                }
            }
        }
    }

    public void clear() {
        this.matrix = new char[height + 2][width + 2];
    }

    // Metoda wyświetlająca zawartość macierzy
    public void print() {
        for (int i = 0; i < height + 2; i++) {
            for (int j = 0; j < width + 2; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
