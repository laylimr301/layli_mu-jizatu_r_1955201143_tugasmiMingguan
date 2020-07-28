/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasarry;

import javax.swing.JOptionPane;

        
/**
 *
 * @author NEC
 */
public class tugasarray1dimensi {
    public static void main(String[] args) {
        
   String namaBrng[] = new String[5];
   for (int i=0; i<namaBrng.length; i++){
        namaBrng[i] = JOptionPane.showInputDialog(null,"Inputkan Nama Barang ke " +i);
        System.out.println(namaBrng[i]);
   }
    
   String cariNama = JOptionPane.showInputDialog(null,"Cari Nama Barang");
   
   for(int i=0; i<namaBrng.length; i++){
       if (namaBrng[i].equals(cariNama)){
      JOptionPane.showMessageDialog(null,"Nama yang anda cari adalah" + cariNama + "ketemu pada indexs ke" +i); 
       
       
       
       
       
       
       }
       
       
       
       
   }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    }
   
    
    
    
    
    
    
    
