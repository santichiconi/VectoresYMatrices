/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores.y.matrices;

/**
 *
 * @author chuPac
 */
public class VectoresYMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] vector = new int [5];
        vector[0]=3;
        for (int i=0;i<5;i++){
            vector[i]=i+3;
        }
        for (int i=0; i<5; i++){
            System.out.println("[" + vector[i] + "]");
        }
        System.out.println("");
        
    }
    
}
