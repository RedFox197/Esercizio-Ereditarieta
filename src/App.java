import org.generation.italy.jaita138.oop.model.Impiegato;
import org.generation.italy.jaita138.oop.model.Persona;
import org.generation.italy.jaita138.oop.model.Professionista;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Persona> list = new ArrayList<>();

        list.add(new Persona("Albero", "Fiore", LocalDate.of(2010, 2, 1), "Albero", "1234"));
        list.add(new Persona("Albero2", "Fiore2", LocalDate.of(1990, 2, 1), "Albero2", "12345"));
        list.add(new Persona("Albero3", "Fiore3", LocalDate.of(1980, 2, 1), "Albero3", "12343"));
        list.add(
                new Impiegato(
                        "Albero4", "Fiore4", LocalDate.of(1970, 2, 1), "Tesserino", 1203,
                        LocalDate.of(2020, 2, 1), "Lello", "bello"
                )
        );
        list.add(
                new Impiegato(
                        "Albero5", "Fiore5", LocalDate.of(1970, 2, 1), "Tesserino13", 1203,
                        LocalDate.of(2020, 2, 1), "Lello1", "bello2"
                )
        );
        list.add(
                new Professionista(
                        "Albero4", "Fiore4", LocalDate.of(1970, 2, 1), "12345678901",
                        LocalDate.of(2020, 1, 2), "Boh", "1234"
                )
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci username:");
        String username = scanner.nextLine();

        System.out.println("Inserisci password");
        String password = scanner.nextLine();

        Persona trovato = login(username, password, list);
        if (trovato != null) {
            System.out.println("Login Effettuato");
        } else {
            System.out.println("Username o Password non valida!");
        }
        scanner.close();

    }

    public static Persona login(String username, String password, ArrayList<Persona> list) {
        for (Persona persona : list) {
            if (persona.getUsername().equals(username) && persona.getPassword().equals(password)) {
                return persona;
            }
        }
    }
}
