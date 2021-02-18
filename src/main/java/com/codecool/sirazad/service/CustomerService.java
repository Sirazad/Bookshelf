package com.codecool.sirazad.service;

import com.codecool.sirazad.Dao.CustomerDao;
import com.codecool.sirazad.Dao.CustomerDaoImpl;
import com.codecool.sirazad.model.Customer.Customer;
import com.codecool.sirazad.model.Feedback.Opinion;

import java.util.Optional;

public class CustomerService {
    CustomerDao cd;

    CustomerService(CustomerDao customerDao2) {
        cd = customerDao2;
    }

    public void addOpinionToCustomer(long customerId, long bookId, String newOpinion){
        Customer customer = cd.findById(customerId);

        Optional<Opinion> customerOpinion = cd.findOpinionOfBook(customer.getCustomerId(), bookId);
        if (customerOpinion.isPresent()) { //ha már van erre vélemény
            customer.updateOpinion(customerOpinion.get().setOpinion(newOpinion));
        } else { // ha még nincs vélemény a könyvről
            customer.addOpinion(new Opinion(1, bookId, customerId, newOpinion));
        }
        cd.updateCustomer(customer);
    }


}
