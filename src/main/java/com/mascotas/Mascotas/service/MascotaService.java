package com.mascotas.Mascotas.service;

import com.mascotas.Mascotas.dto.MascotaDto;
import com.mascotas.Mascotas.model.Mascota;

import java.util.List;

public interface MascotaService {
    Mascota agregar(MascotaDto mascotaDto);
    List<Mascota> obtenerTodo();
    Mascota obtenerPorId(Long id);
    Mascota actualizar(Long id, MascotaDto mascotaDto);
    void eliminar(Long id);


}
