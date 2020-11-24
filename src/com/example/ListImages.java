package com.example;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.DescribeImagesRequest;
import com.amazonaws.services.ec2.model.DescribeImagesResult;
import com.amazonaws.services.ec2.model.Image;


public class ListImages {

	public static  void listImages(AmazonEC2 ec2)
	{
		DescribeImagesRequest request = new DescribeImagesRequest();

		DescribeImagesResult response = ec2.describeImages(request);
		

		for(Image image : response.getImages()) {
			System.out.printf(
					"ImageID: %s, " +
					"Name: %s, " + 
					"Owner: %s,"+
					"Is-public: %b"+
					"Stste: %b"+
					"State Reason: %s",
					image.getImageId(),
					image.getName(),
					image.getOwnerId(),
					image.getPublic(),
					image.getState(),
					image.getStateReason()
					);
		}
		
		
		System.out.println("Complete");
		
	}
}
