/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bonusquestion;

import java.util.Scanner;

/**
 *
 * @author Pierre L'Espérance
 * @date 30/08/2021
 */
public class Bonus {
    
    
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a valid positive integer");
        
        int value = 0;
        
        while(true)
        {
            try{
                
                value = Integer.parseInt(sc.nextLine());
                
                break;
                
            }catch(Exception e){
                System.out.println("Enter a valid entry!");
            }
           
        }
        
        int count = 0;
        
        for(int i =0 ; i<= value ; i++)
        {
            if(i % 3 == 0 || i%5 == 0)
            {
                count += i;
            }
        }
        
        System.out.println("the total value of the sum of multiples of 3 and 5 between 0 and "+value+" is");
        System.out.println(count);
    }
    
    
    
    
    
}
