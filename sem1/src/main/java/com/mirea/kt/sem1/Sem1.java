/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.sem1;

import java.util.Scanner;

/**
 *
 * @author yansi
 */
public class Sem1 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       
        System.out.print (" Введите сумму вклада\n");
        int sum=scan.nextInt();
        
        System.out.print (" Введите процент\n");
        int percent=scan.nextInt();
        if (percent>100 || percent<0){
            System.out.print("Error");
            return;
        }
        
        System.out.print (" Введите срок (в месяцах)\n");
        int period=scan.nextInt();
        int month = 1;
        int gain = 0;
        int result = 0;
   
        
            do{ gain=sum/100*percent;
                sum=sum+gain;
                System.out.println("месяц " + month + " " + gain);
                month=month+1;
                result = result + gain;
            }while (month<=period);
        System.out.println("Итоговый доход" + " " + result); }}    
   
 