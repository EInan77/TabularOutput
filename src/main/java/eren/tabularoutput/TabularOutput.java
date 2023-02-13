/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.tabularoutput;

/**
 *
 * @author ereni
 */
public class TabularOutput {

    public static void main(String[] args) {
       System.out.println("N\t10*N\t100*N\t1000*N");
   for(int i=1;i<6;i++)
    System.out.println(i + "\t" + i * 10 + "\t" + i * 100 + "\t" + i * 1000);
} 
} 