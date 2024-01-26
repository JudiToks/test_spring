package test.test_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.test_spring.models.Marque;
import test.test_spring.repository.MarqueRepository;

import java.util.List;

@RestController
@RequestMapping("/marque")
public class MarqueController
{
    private final MarqueRepository marqueRepository;

    @Autowired
    public MarqueController(MarqueRepository marqueRepository)
    {
        this.marqueRepository = marqueRepository;
    }

    @GetMapping("/findAll")
    public List<Marque> findAll()
    {
        return (List<Marque>) marqueRepository.findAll();
    }

    @GetMapping("/findById/{id_marque}")
    public Marque findById(@PathVariable int id_marque)
    {
        return marqueRepository.findById(id_marque);
    }

    @PostMapping("/save/{nom}")
    public Marque save(@PathVariable String nom)
    {
        Marque marque = new Marque(0, nom);
        return marqueRepository.save(marque);
    }

    @PostMapping("/delete/{id_marque}")
    public void deleteById(@PathVariable int id_marque)
    {
        marqueRepository.deleteById(id_marque);
    }
}
