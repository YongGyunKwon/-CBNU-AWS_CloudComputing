package com.example;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import java.util.Scanner;


public class Main {

    public static void  main(String[] args) throws Exception {


        final AmazonEC2 ec2= AmazonEC2ClientBuilder.defaultClient();
        
        int menu_num;
        String instance_id;
        
        
        Scanner num = new Scanner(System.in);
        Scanner id = new Scanner(System.in);
        
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
            
            System.out.println("Put menu's number");
            menu_num=num.nextInt();
            
            if(menu_num==1)
            {
            	System.out.println("Put your instance Id");
            	instance_id=id.nextLine();
            	
            	//StartInstance.startIns(ec2,instance_id);
            	
            	StartInstance.startIns(ec2,"i-077c7e78bf16a3391");
            }
            
            
            else if(menu_num==2)
            {
            	
            }
            else if(menu_num==3)
            {
            	
            }
            else if(menu_num==4)
            {
            	
            }
            else if(menu_num==5)
            {
            	
            }
            else if(menu_num==6)
            {
            	
            }
            else if(menu_num==7)
            {
            	
            }
            else if(menu_num==8)
            {
            	
            }
            else if(menu_num==9)
            {
            	return;
            }
            
        }
        
        
        
     
    }
}
