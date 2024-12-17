package it.epicode.esercizi_U2.W1.D1.BE.repository;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza,Long>  {
}
