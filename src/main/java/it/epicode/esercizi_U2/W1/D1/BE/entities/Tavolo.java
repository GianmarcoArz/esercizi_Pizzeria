package it.epicode.esercizi_U2.W1.D1.BE.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tavolo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int numero;
    private int numeroCopertiMax;
    private boolean occupato;

}