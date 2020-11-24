package com.example;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import java.util.Scanner;


public class Main {

    public static void  main(String[] args) throws Exception {


        final AmazonEC2 ec2= AmazonEC2ClientBuilder.defaultClient();
        
        int menu_num;
        String instance_id;
        
        String instance_test="i-077c7e78bf16a3391";
        
        Scanner num = new Scanner(System.in);
        Scanner id = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("-----------------------------------------------------");

            System.out.print("1. list instance\t");
            System.out.println("2. available zones");
            System.out.print("3. start instance\t");
            System.out.println("4. available regions");
            System.out.print("5. stop instance\t");
            System.out.println("6. create instance");
            System.out.print("7. reboot instance\t");
            System.out.println("8. list images");
            System.out.println("9. Describe Accounts");
            System.out.println("\t\t\t\t\t99. quit");


            System.out.println("-----------------------------------------------------");
            
            System.out.println("Put menu's number");
            menu_num=num.nextInt();
            
            if(menu_num==1)
            {
            	System.out.println("List Instance");
            	ListInstance.listInstance(ec2);
            	
            	System.out.println("Finish");
            }
            
            //Availablezones
            else if(menu_num==2)
            {
            	AvailableZones.availableZone(ec2);
            	
            	
            }
            else if(menu_num==3)
            {
            	System.out.println("Put your instance Id");
            	instance_id=id.nextLine();
            	
            	//StartInstance.startIns(ec2,instance_id);
            	
            	//for testing
            	StartInstance.startIns(ec2,instance_test);
            }
            
            //AvailableRegions
            else if(menu_num==4)
            {
            	AvailableRegions.availableRegions(ec2);
            }
            else if(menu_num==5)
            {
            	System.out.println("Put your instance Id");
            	instance_id=id.nextLine();
            	
            	//StopInstance.stopInstance(ec2,instance_id);
            	
            	//for testing
            	StopInstance.stopInstance(ec2,instance_test);
            	
            	
            }
            
            //MakeInstance
            else if(menu_num==6)
            {
            	System.out.println("You'll make Instance");
            	MakeInstance.makeInstance(ec2);
            	
            }
            
            //rebootInstance
            else if(menu_num==7)
            {
            	System.out.println("Put your instance Id");
            	instance_id=id.nextLine();
            	
            	//RebootInstance.rebootInstance(ec2, instance_id);
            	
            	//for testing
            	RebootInstance.rebootInstance(ec2, instance_test);
            }
            
            //list Images
            else if(menu_num==8)
            {
            	
            	ListImages.listImages(ec2);
            	
            }
            else if(menu_num==9)
            {
            	DescribeAccounts.describeAccounts(ec2);
            	
            	System.out.println("Complete");
            	
            }
            else if(menu_num==99)
            {
            	break;
            }
            
        }
        
     
    }
}
