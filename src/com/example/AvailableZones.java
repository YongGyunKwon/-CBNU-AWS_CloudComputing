package com.example;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.Region;
import com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult;




public class AvailableZones {
	
	public static void availableZone(AmazonEC2 ec2)
	{
		DescribeAvailabilityZonesResult regions_response =ec2.describeRegions();
		
		
		
		
	}
	
}
