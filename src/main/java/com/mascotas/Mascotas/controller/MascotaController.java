package com.mascotas.Mascotas.controller;

import com.mascotas.Mascotas.service.MascotaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/mascotas")
@AllArgsConstructor
public class MascotaController {
    private final MascotaService mascotaService;


}
