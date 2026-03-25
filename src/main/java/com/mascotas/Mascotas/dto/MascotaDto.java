package com.mascotas.Mascotas.dto;

import com.mascotas.Mascotas.model.Mascota;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MascotaDto {
    private String nombre;
    private  String codigo;
}
