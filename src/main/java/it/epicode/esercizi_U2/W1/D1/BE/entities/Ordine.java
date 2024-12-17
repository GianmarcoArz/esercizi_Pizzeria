package it.epicode.esercizi_U2.W1.D1.BE.entities;

import it.epicode.esercizi_U2.W1.D1.BE.entities.enums.StatoOrdineEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NamedQuery(name = "Trova_tutto_Ordine", query = "SELECT a FROM Ordine a")
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int numeroOrdine;
    private StatoOrdineEnum stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private double importoTotale;

    @ManyToOne
    private Tavolo tavolo;

    @ManyToMany
    private List<Menu> elementiMenu;


}