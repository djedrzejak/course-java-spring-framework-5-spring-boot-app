package main.service;

import java.util.List;

import main.model.Offer;
import main.model.OfferDTO;

public interface OfferService {

	public List<Offer> getAll();
	
	public Offer getById(int id);
	
	public void saveOrUpdate(Offer offer);
	
	public void delete(int id);
	
	public List<OfferDTO> getAllDTO();
	
	public List<OfferDTO> getAllFromExternalApplication();
	
}
