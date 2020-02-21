package com.algaworks.wine.service;

import com.algaworks.wine.model.Vinho;
import com.algaworks.wine.repository.Vinhos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroVinhoService {

    @Autowired
    private Vinhos vinhos;

    public void salvar (Vinho vinho){
        this.vinhos.save(vinho);
    }
    
}