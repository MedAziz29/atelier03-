package com.aziz.produit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.aziz.produit.entities.Produit;
import com.aziz.produit.repos.ProduitRepository;
@Service
public class ProduitServiceImpl implements  ProduitService{
	@Autowired
	ProduitRepository produitRepository;
	
	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
	}

	public Produit updateProduit(Produit p) {
	return produitRepository.save(p);
	}
	
	public void deleteProduit(Produit p) {
	produitRepository.delete(p);
	}

	public void deleteProduitById(Long id) {
	produitRepository.deleteById(id);
	}

	public Produit getProduit(Long id) {
	return produitRepository.findById(id).get();
	}

	public List<Produit> getAllProduits() {
	return produitRepository.findAll();
	}
	public Page<Produit> getAllProduitsParPage(int page, int size) {
	return produitRepository.findAll(PageRequest.of(page, size));
	}
}
