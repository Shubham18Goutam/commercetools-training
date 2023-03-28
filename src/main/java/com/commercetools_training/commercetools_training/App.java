package com.commercetools_training.commercetools_training;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.project.Project;

/**
 * Hello world!
 *
 */
public class App 
{
	static CustomerService cs= new CustomerService();

	
    public static void main( String[] args )
    {
    	ProjectApiRoot apiRoot= Client.createApiClient();
    	Project myProject=apiRoot
    			.get()
    			.execute()
    			.getBody();
    	System.out.println(myProject.getName());
    	  	
    	System.out.println( "Hello World!" );
    }
    public static void createCustomer() {
    	Customer customer = cs.createCustomer("s@gmai.com");
    	String customerID =customer.getId();
    	System.out.println(customerID);
    }
    public static void getCustomerById() {
    	Customer customer =cs.getCustomerByID("62098bff-3785-4b9f-a793-8ed20b6ead76")
    }
}
