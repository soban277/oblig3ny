package com.example.oblig3ny;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class BillettController {

    public final List<Billett> alleBillett = new ArrayList<>();

    @PostMapping("/lagreBillett")
    public void lagreBillett(Billett innBillett){
        Billett.add(innBillett);
    }

    @GetMapping("/henteBillett")
    public List<Billett> Billett(){return alleBillett;}

    @GetMapping("/slettBillett")
    public void slettAlle(){
        alleBillett.clear();
    }
}