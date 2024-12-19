package it.epicode.esercizi_U2.W1.D1.BE.repository;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza,Long>  {


    Pizza findByNome(String nome);

    List<Pizza> findByNomeContainingIgnoreCase(String nome);

    List<Pizza> findByOrderByCalorieDesc();


}
