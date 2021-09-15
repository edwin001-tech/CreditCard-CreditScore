package com.eduin.creditscore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduin.creditscore.model.CreditScore;

public interface CreditScoreRepo extends JpaRepository<CreditScore, String> {

}
