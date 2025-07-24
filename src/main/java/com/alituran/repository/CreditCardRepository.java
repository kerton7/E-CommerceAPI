package com.alituran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alituran.model.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard , Long>{

}
