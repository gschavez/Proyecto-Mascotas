package com.mascotas.Mascotas.repository;

import com.mascotas.Mascotas.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
