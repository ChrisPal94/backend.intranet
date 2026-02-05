package com.ucsg.api.intranet.controller;

import com.ucsg.api.intranet.model.CumpleanioMes;
import com.ucsg.api.intranet.repository.CumpleanioMesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cumpleanios")
public class CumpleanioController {
    @Autowired
    private CumpleanioMesRepository cumpleanioMesRepository;

    @GetMapping
    public List<CumpleanioMes> getAllCumpleanioMes() {
        return cumpleanioMesRepository.findAll();
    }
}
