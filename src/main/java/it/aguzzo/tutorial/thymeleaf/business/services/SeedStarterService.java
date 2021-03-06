package it.aguzzo.tutorial.thymeleaf.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aguzzo.tutorial.thymeleaf.business.entities.SeedStarter;
import it.aguzzo.tutorial.thymeleaf.business.entities.repositories.SeedStarterRepository;

@Service
public class SeedStarterService {
	
	@Autowired
    private SeedStarterRepository seedstarterRepository; 
    
    public List<SeedStarter> findAll() {
        return this.seedstarterRepository.findAll();
    }

    public void add(final SeedStarter seedStarter) {
        this.seedstarterRepository.add(seedStarter);
    }
}