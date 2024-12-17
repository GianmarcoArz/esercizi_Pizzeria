package it.epicode.esercizi_U2.W1.D1.BE.test;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Ordine;
import it.epicode.esercizi_U2.W1.D1.BE.entities.enums.StatoOrdineEnum;
import it.epicode.esercizi_U2.W1.D1.BE.repository.OrdineRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OrdineRepositoryTest {
    @Autowired
    private OrdineRepository ordineRepository;

    @ParameterizedTest
    @ValueSource(strings = {"in corso", "pronto", "servito"})
    @DisplayName("Test parametrico per la ricerca di Ordine per stato")
    void testFindByStato(String stato) {
        List<Ordine> ordini = ordineRepository.findAll();
        Ordine ordine = ordini.get(1);
         StatoOrdineEnum statoOrdineEnum = ordine.getStato();
        assertEquals(statoOrdineEnum, stato);
    }
}
