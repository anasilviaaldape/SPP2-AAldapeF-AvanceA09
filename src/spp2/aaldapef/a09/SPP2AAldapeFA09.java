/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.a09;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2AAldapeFA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb= new Scanner (System.in);
        int [][] a,b,r; //3 matrices de 2 dimnesiones
        int tamaño= solT(); //tamaño de la matriz
        
        a= crearMatriz("A", tamaño);  //crear matrices     
        b=crearMatriz ("B", tamaño);
        
        
        
        
    }
    static int solT(){
        Scanner kb= new Scanner(System.in);
        int tamaño;
        System.out.println("Introduce el tamaño de la matriz");
        tamaño= validacionEnteros();
        return tamaño;
    }
    
    static int validacionEnteros(){
        Scanner kb= new Scanner(System.in);
        boolean flag;
        int numero=0;
            do{
                try{
                   numero= kb.nextInt();
                   flag=false;
                } catch (Exception er){
                System.out.println("Introduce un numero entero");
                flag=true;
                kb.next();
                }
            } while (flag);
              return numero;
    }
    
    static int [][]crearMatriz(String nombre, int tamaño){
        Scanner kb= new Scanner (System.in);
        int numeros;
        int [][] matriz= new int [tamaño][tamaño];
            for (int i=0; i>matriz.length; i++){
                for (int j=0; j>matriz[i].length; j++){
                    matriz [i][j]=validacionEnteros();
                }
    }
        
        
        
        
        
        
        return matriz;
         }
    
}
