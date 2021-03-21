package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {

}
