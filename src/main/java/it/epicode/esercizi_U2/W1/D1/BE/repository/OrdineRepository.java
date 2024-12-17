package it.epicode.esercizi_U2.W1.D1.BE.repository;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdineRepository extends JpaRepository<Ordine, Long> {

}
