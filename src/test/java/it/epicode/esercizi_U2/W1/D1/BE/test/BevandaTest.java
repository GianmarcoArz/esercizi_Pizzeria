package it.epicode.esercizi_U2.W1.D1.BE.test;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Bevanda;
import it.epicode.esercizi_U2.W1.D1.BE.repository.BevandaRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest

public class BevandaTest {


@Autowired
private BevandaRepository bevandaRepository;
    @Test
    @DisplayName("Test per il salvataggio della Bevanda Lemonade")
    void testBevandaCreation() {

        Optional<Bevanda> bevanda = bevandaRepository.findById(4L);

        assertTrue(bevanda.isPresent(), "Bevanda con ID 4L non trovata");

        Bevanda foundBevanda = bevanda.get();
        assertEquals("Lemonade", foundBevanda.getNome());
        assertEquals(128, foundBevanda.getCalorie());
        assertEquals(1.3, foundBevanda.getPrezzo());
    }

}
