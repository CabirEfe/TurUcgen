/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class türüçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 3 Tane Sayı Giriniz: ");
        int sayi = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();
        
        
        if(sayi == sayi2 && sayi == sayi3 && sayi2 == sayi3){
        System.out.println("Üçgen Eşitkenar Üçgendir.");
        }
        else if(sayi == sayi2 || sayi2 == sayi3 || sayi == sayi3 ){
        System.out.println("Üçgen İkizkenar Üçgendir.");
        }
        else{
        System.out.println("Üçgen Çeşitkenar Üçgendir.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
