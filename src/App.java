import java.time.LocalDate;
import org.generation.italy.jaita138.oop.model.Impiegato;
import org.generation.italy.jaita138.oop.model.Persona;
import org.generation.italy.jaita138.oop.model.Professionista;

public class App {
    public static void main(String[] args) throws Exception {
        Persona p=new Persona("Mario", "Rossi", LocalDate.of(1980, 4, 12));
       
        p.saluta();
        System.out.println();
        
        Impiegato i=new Impiegato(
            "Pino", "Gialli", 
            LocalDate.of(1984, 3, 25), 
            "XYZ123", 1600, 
            LocalDate.of(2024, 8, 30));
       
        i.saluta();
        i.riceviAumento(100);
        System.out.println(i.toString());
       
        System.out.println();

        Professionista pr=new Professionista(
            "Gino", "Marroni", 
            LocalDate.of(1995, 6, 15), 
            "12354654413", 
            LocalDate.of(2025, 1, 22));

        pr.saluta();
        pr.fattura(1000);
        pr.fattura(1600);
        pr.fattura(2000);
        System.out.println(pr.toString());

    }
}
