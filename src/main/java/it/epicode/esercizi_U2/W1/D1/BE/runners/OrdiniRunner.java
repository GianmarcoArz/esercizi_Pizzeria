package it.epicode.esercizi_U2.W1.D1.BE.runners;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Menu;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Ordine;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Tavolo;
import it.epicode.esercizi_U2.W1.D1.BE.entities.enums.StatoOrdineEnum;
import it.epicode.esercizi_U2.W1.D1.BE.repository.MenuRepository;
import it.epicode.esercizi_U2.W1.D1.BE.repository.OrdineRepository;
import it.epicode.esercizi_U2.W1.D1.BE.repository.TavoloRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;




@Component
@Order(5)
public class OrdiniRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(OrdiniRunner.class);

    @Autowired
    private OrdineRepository ordineRepository;

    @Autowired
    private TavoloRepository tavoloRepository;

    @Autowired
    private MenuRepository menuRepository;

    @Value("${costo.coperto}")
    private double costoCoperto;

//    @Override
//    public void run(String... args) throws Exception {
//
//        Tavolo tavolo = new Tavolo();
//        tavolo.setNumero(1);
//        tavolo.setNumeroCopertiMax(4);
//        tavolo.setOccupato(true);
//        tavoloRepository.save(tavolo);
//
//
//
//        Ordine ordine = new Ordine();
//        ordine.setNumeroOrdine(1);
//        ordine.setStato("in corso");
//        ordine.setNumeroCoperti(3);
//        ordine.setOraAcquisizione(LocalDateTime.now());
//        ordine.setTavolo(tavolo);
//
//        List<Menu> elementiMenu = menuRepository.findAll();
//        ordine.setElementiMenu(elementiMenu);
//
//        double importoTotale = elementiMenu.stream().mapToDouble(Menu::getPrezzo).sum() + (costoCoperto * ordine.getNumeroCoperti());
//        ordine.setImportoTotale(importoTotale);
//
//        ordineRepository.save(ordine);
//
//        logger.info("Ordine creato: {}", ordine);
//    }

    @Override
    public void run(String... args) throws Exception {

        Tavolo tavolo = new Tavolo();
        tavolo.setNumero(1);
        tavolo.setNumeroCopertiMax(4);
        tavolo.setOccupato(true);
        tavoloRepository.save(tavolo);

        Ordine ordine = new Ordine();
        ordine.setNumeroOrdine(1);
        ordine.setStato(StatoOrdineEnum.PRONTO);
        ordine.setNumeroCoperti(3);
        ordine.setOraAcquisizione(LocalDateTime.now());
        ordine.setTavolo(tavolo);


        Ordine ordine2 = new Ordine();
        ordine.setNumeroOrdine(2);
        ordine.setStato(StatoOrdineEnum.IN_CORSO);
        ordine.setNumeroCoperti(2);
        ordine.setOraAcquisizione(LocalDateTime.now());
        ordine.setTavolo(tavolo);

        Ordine ordine3 = new Ordine();
        ordine.setNumeroOrdine(3);
        ordine.setStato(StatoOrdineEnum.SERVITO);
        ordine.setNumeroCoperti(4);
        ordine.setOraAcquisizione(LocalDateTime.now());
        ordine.setTavolo(tavolo);



        List<Menu> elementiMenu = menuRepository.findAll();
        ordine.setElementiMenu(elementiMenu);

        double importoTotale = elementiMenu.stream().mapToDouble(Menu::getPrezzo).sum() + (costoCoperto * ordine.getNumeroCoperti());
        ordine.setImportoTotale(importoTotale);

        ordineRepository.save(ordine);

        StringBuilder ordineInfo = new StringBuilder();
        System.out.println("Ordine creato:");
        System.out.println("Ordine creato:");
        ordineInfo.append("Ordine creato:\n")
                .append("ID: ").append(ordine.getId()).append("\n")
                .append("Numero Ordine: ").append(ordine.getNumeroOrdine()).append("\n")
                .append("Stato: ").append(ordine.getStato()).append("\n")
                .append("Numero Coperti: ").append(ordine.getNumeroCoperti()).append("\n")
                .append("Ora Acquisizione: ").append(ordine.getOraAcquisizione()).append("\n")
                .append("Tavolo: ").append(ordine.getTavolo().getNumero()).append("\n")
                .append("Elementi Menu:\n");


        for (Menu menu : elementiMenu) {
            ordineInfo.append("  - ").append(menu.getNome())
                    .append(" (Calorie: ").append(menu.getCalorie())
                    .append(", Prezzo: ").append(menu.getPrezzo()).append(")\n");
        }

        ordineInfo.append("Importo Totale: ").append(ordine.getImportoTotale()).append("\n");

        logger.info(ordineInfo.toString());
    }

}
