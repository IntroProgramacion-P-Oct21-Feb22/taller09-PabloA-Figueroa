/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        int i;
        double suma = 0;
        double promedio = 0; 
        /*Promedio Regular son todas las notas >=0 y <=5.9
        Promedio Bueno son todas las notas >=6 y <=8.9  
        Promedio Sobresaliente son todas las notas >=9 y <=10*/

        for ( i = 0; i < promediosCualitativos.length; i++) {
            suma = suma + promedios[i];
            if ((promedios[i] >= 0) && (promedios[i] <= 5.9)) {
                promediosCualitativos[i] = String.format("%s" + " promedio: %.2f",
                         estudiantes[i], promedios[i]);
            } else {
                if ((promedios[i] >= 6) && (promedios[i] <= 8.9)) {
                    promediosCualitativos[i] = String.format("%s" + " promedio: %.2f",
                             estudiantes[i], promedios[i]);
                } else {
                    if ((promedios[i] >= 9) && (promedios[i] <= 10)) {
                        promediosCualitativos[i] = String.format("%s" + " promedio: %.2f",
                                 estudiantes[i], promedios[i]);
                    }
                }
            }          
        }
        promedio = suma / i;
        
        for ( i = 0; i < promediosCualitativos.length; i++) {
            System.out.printf("%s" + " promedio cualitativo %.2f\n ",promediosCualitativos[i], promedio);
        }
    }

}
