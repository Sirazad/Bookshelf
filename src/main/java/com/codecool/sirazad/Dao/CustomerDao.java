package com.codecool.sirazad.Dao;

import com.codecool.sirazad.model.Customer.Customer;

public interface CustomerDao {

   public Customer findById(int id);
   public void addCustomer(Customer customer);
   public Customer findCustomerByNameAndEmail(String name, String email);
}
