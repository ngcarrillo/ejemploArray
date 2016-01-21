/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class MetodoMatriz {

    int[][] notas = new int[3][4];
    int[] notasMedias = new int [3];
    int[] notasMod = new int [4];

    public void cargarMatriz() {
        // int[][]notaM = {{7,9,5,4}{5,5,5,5}{6,7,8,9}}
        for (int f = 0; f < notas.length; f++) { //fila
            for (int c = 0; c < notas[f].length; c++) {//columna
                notas[f][c] = pedirNota();
            }
        }
    }

    public int pedirNota() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce a nota"));
    }

    public void amosarMatriz() {
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                System.out.print(notas[f][c] + " ");
            }
             System.out.println(""+ ""+notasMedias[f]); // para que no se imprima seguido
        }
    }
    public void calcularMediaNotas(){
        for (int f = 0; f < notas.length; f++) { //notas.length da 3 que son las filas
          int a = 0;
            for (int c = 0; c < notas[f].length; c++) {
                a = a + notas[f][c];
            }
        notasMedias[f] = a/notas[f].length;
        }

}
    public void notaMediaModulo(){
    
        for (int c = 0; c < notas.length; c++){ //notas.length 3 (filas)
            int media = 0;
             for (int f = 0; f < notas[c].length; f++){
        }
   
    }
 }
}
