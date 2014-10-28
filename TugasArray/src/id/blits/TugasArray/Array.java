

package id.blits.TugasArray;

import java.util.Scanner;




public class Array {

    
    public static void main(String[] args) 
    {
        Scanner input  = new Scanner(System.in);
        String[] nama  = new String[5];
        int[] npm = new int[5];
        
        for(int i= 0;i<5; i++){
        System.out.println("In nama ke"+(i+1)+":");
        nama[i] = input.nextLine();
        }
        for(int i= 0;i<5; i++){
        System.out.println("In npm ke"+(i+1)+":");
        npm[i] = input.nextInt();
        } 
        for(int i=0; i<5;i++){
            System.out.println("Npm ke"+(i+1)+":"+npm[i]);
        }
         for(int i=0; i<5;i++){
            System.out.println("Nama ke"+(i+1)+":"+nama[i]);
        }
        
    }
}
