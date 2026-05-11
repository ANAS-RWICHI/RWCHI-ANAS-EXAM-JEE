package com._38_.anasrwchi.services;

import com._38_.anasrwchi.Dtos.AgenceDto;
import com._38_.anasrwchi.entities.Agence;
import com._38_.anasrwchi.Mappers.GlobalMapper;
import com._38_.anasrwchi.repositories.AgenceRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class AgenceServiceImpl implements AgenceService {

    private final AgenceRepository agenceRepository;
    private final GlobalMapper mapper;

    @Override
    public AgenceDto saveAgence(AgenceDto agenceDto) {
        Agence agence = mapper.fromAgenceDto(agenceDto);
        Agence savedAgence = agenceRepository.save(agence);
        return mapper.fromAgence(savedAgence);
    }

    @Override
    public AgenceDto getAgence(Long id) {
        Agence agence = agenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agence not found"));
        return mapper.fromAgence(agence); //
    }

    @Override
    public List<AgenceDto> getAllAgences() {
        List<Agence> agences = agenceRepository.findAll();
        return agences.stream()
                .map(mapper::fromAgence)
                .collect(Collectors.toList());
    }

    @Override
    public AgenceDto updateAgence(Long id, AgenceDto agenceDto) {

        Agence existingAgence = agenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agence not found"));

        agenceDto.setId(id);
        Agence agenceToUpdate = mapper.fromAgenceDto(agenceDto);

        Agence updatedAgence = agenceRepository.save(agenceToUpdate);
        return mapper.fromAgence(updatedAgence);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }
}