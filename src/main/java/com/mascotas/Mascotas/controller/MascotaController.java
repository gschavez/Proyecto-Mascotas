package com.mascotas.Mascotas.controller;

import com.mascotas.Mascotas.dto.MascotaDto;
import com.mascotas.Mascotas.model.Mascota;
import com.mascotas.Mascotas.service.MascotaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")

@RequiredArgsConstructor
public class MascotaController {
    private final MascotaService mascotaService;

    @PostMapping
    public ResponseEntity<Mascota> guardar(@RequestBody MascotaDto mascotaDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(mascotaService.agregar(mascotaDto));
    }

    @GetMapping
    public ResponseEntity<List<Mascota>> obtenerTodo(){
        return ResponseEntity.ok(mascotaService.obtenerTodo());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mascota> obtenerPorId(@PathVariable Long id){
        return ResponseEntity.ok(mascotaService.obtenerPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mascota> actualizar(@PathVariable Long id,@RequestBody MascotaDto mascotaDto){
        return ResponseEntity.ok(mascotaService.actualizar(id , mascotaDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        mascotaService.eliminar(id);
        return ResponseEntity.noContent().build();

    }
}
