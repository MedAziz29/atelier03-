package com.aziz.produit;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aziz.produit.entities.Produit;
import com.aziz.produit.service.ProduitService;

@SpringBootApplication
public class ProduitApplication implements CommandLineRunner {
@Autowired
ProduitService produitService;
public static void main(String[] args) {
SpringApplication.run(ProduitApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
produitService.saveProduit(new Produit("PC Dell", 2600.0, new Date()));
produitService.saveProduit(new Produit("PC Asus", 2800.0, new Date()));
produitService.saveProduit(new Produit("Imprimante Epson", 900.0, new Date()));
}
}
