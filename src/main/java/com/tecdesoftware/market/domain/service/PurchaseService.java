package com.tecdesoftware.market.domain.service;


import com.tecdesoftware.market.domain.Purchase;
import com.tecdesoftware.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//quien decide si es posible
@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll(){
        return purchaseRepository.getAll();

    };
    public Optional<List<Purchase>> getByClient(String clientId){
        return purchaseRepository.getByClientes(clientId);
    };

    public Purchase save (Purchase purchase){
        return purchaseRepository.save(purchase);
    };
}
