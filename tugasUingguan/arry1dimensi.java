/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasarry;

import java.util.Scanner;


/**
 *
 * @author NEC
 */
public class arry1dimensi {
    
    public static void main(String[] args) {
    
       
     String Mahasiswa[] = new String[5];
     Scanner Scan = new Scanner(System.in);
     
         for (int i = 0; i < Mahasiswa.length; i++){
        
           System.out.println(" Mahasiswa ke-" + (i + 1) + " = ");
            Mahasiswa[i] = Scan.nextLine();
          
        }        
         System.out.println("-------------------");
         
         for(String m : Mahasiswa){
             System.out.println(m);
            
            
            
            
            
            
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
