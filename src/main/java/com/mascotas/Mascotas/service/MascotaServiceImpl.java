package com.mascotas.Mascotas.service;

import com.mascotas.Mascotas.dto.MascotaDto;
import com.mascotas.Mascotas.model.Mascota;
import com.mascotas.Mascotas.repository.MascotaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService {

    private final MascotaRepository mascotaRepository;

    public MascotaServiceImpl(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }


    @Override
    public Mascota agregar(MascotaDto mascotaDto) {
        Mascota mascotaCr = new Mascota();
        mascotaCr.setNombre(mascotaDto.getNombre());
        mascotaCr.setCodigo(mascotaDto.getCodigo());
        return mascotaRepository.save(mascotaCr);
    }

    @Override
    public List<Mascota> obtenerTodo() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota obtenerPorId(Long id) {
        return mascotaRepository.findById(id)
                .orElseThrow(()->new RuntimeException("No se encontro mascota con id:"+ id));
    }

    @Override
    public Mascota actualizar(Long id, MascotaDto mascotaDto) {
        Mascota mascotaAc = mascotaRepository.findById(id)
                .orElseThrow(()->new RuntimeException("No se encontro mascota con id: " + id));
        mascotaAc.setNombre(mascotaDto.getNombre());
        mascotaAc.setCodigo(mascotaDto.getCodigo());
        return mascotaRepository.save(mascotaAc);
    }

    @Override
    public void eliminar(Long id) {
         Mascota mascotaDe = mascotaRepository.findById(id)
                 .orElseThrow(()-> new RuntimeException( "No se encontro mascota con id: " + id));
         mascotaRepository.delete(mascotaDe);

    }
}
