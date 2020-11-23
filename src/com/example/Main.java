package com.example;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;


public class Main {

    public static void  main(String[] args) throws Exception {


        final AmazonEC2 ec2= AmazonEC2ClientBuilder.defaultClient();
        
        int menu_num;
        
        Scanner num = new Scanner(System.in);
        

        while(true)
        {
            System.out.println("-----------------------------------------------------");

            System.out.print("1. list instance\t");
            System.out.println("2. available regions");
            System.out.print("3. start instance\t");
            System.out.println("4. available regions");
            System.out.print("5. stop instance\t");
            System.out.println("6. create instance");
            System.out.print("7. reboot instance\t");
            System.out.println("8. list images");
            System.out.println("\t\t\t\t\t99. quit");


            System.out.println("-----------------------------------------------------");
            
            
            
        	
        }
        
        
        
        StartInstance.startIns(ec2,"i-077c7e78bf16a3391");
        
        
        

    }
}
