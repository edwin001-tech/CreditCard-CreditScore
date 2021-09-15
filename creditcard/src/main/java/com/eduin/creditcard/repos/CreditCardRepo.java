package com.eduin.creditcard.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduin.creditcard.model.CreditCard;

public interface CreditCardRepo extends JpaRepository<CreditCard, String> {

}
