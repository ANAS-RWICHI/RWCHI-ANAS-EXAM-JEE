package com._38_.anasrwchi.web;

import com._38_.anasrwchi.Dtos.AgenceDto;
import com._38_.anasrwchi.services.AgenceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
//@CrossOrigin("*")
public class AgenceRestController {

    private final AgenceService agenceService;

    @GetMapping("/agences")
    public List<AgenceDto> listAgences() {
        return agenceService.getAllAgences();
    }

    @GetMapping("/agences/{id}")
    public AgenceDto getAgence(@PathVariable(name = "id") Long id) {
        return agenceService.getAgence(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AgenceDto saveAgence(@RequestBody AgenceDto agenceDto) {
        return agenceService.saveAgence(agenceDto);
    }

    @PutMapping("/agences/{id}")
    public AgenceDto updateAgence(@PathVariable Long id, @RequestBody AgenceDto agenceDto) {
        return agenceService.updateAgence(id, agenceDto);
    }

    @DeleteMapping("/agences/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }
}