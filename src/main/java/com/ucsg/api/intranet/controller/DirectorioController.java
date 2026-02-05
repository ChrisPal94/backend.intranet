package com.ucsg.api.intranet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ucsg.api.intranet.model.ContactoDTO;
import com.ucsg.api.intranet.model.UnidadResponse;
import com.ucsg.api.intranet.service.DirectorioService;

@RestController
@RequestMapping("/api/directorio")
public class DirectorioController {
    @Autowired
    private DirectorioService service;

    @GetMapping("/unidades")
    public List<UnidadResponse> getJerarquiaCompleta() {
        return service.obtenerJerarquiaPorUnidad();
    }

    // Ejemplo: GET /api/directorio/contactos?unidad=2&padre=184
    // @GetMapping("/contactos")
    // public List<ContactoDTO> getContactos(
    //         @RequestParam("unidad") Integer unidad,
    //         @RequestParam("padre") Integer padre) {
    //     return service.obtenerContactos(unidad, padre);
    // }

//     @GetMapping("/contactos")
// public List<ContactoDTO> getContactos(
//         @RequestParam(value = "unidad", required = false) String unidad,
//         @RequestParam(value = "padre", required = false) String padre) {
//     return service.obtenerContactos(unidad, padre);
// }

@GetMapping("/contactos")
public List<ContactoDTO> getContactos(
        @RequestParam(value = "unidad", required = false) String unidad,
        @RequestParam(value = "padre", required = false) String padre,
        @RequestParam(value = "hija", required = false) String hija) {
    return service.obtenerContactos(unidad, padre, hija);
}
}
