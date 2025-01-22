import java.time.LocalDate;
import java.util.ArrayList;
import org.generation.italy.jaita138.oop.model.Impiegato;
import org.generation.italy.jaita138.oop.model.Persona;
import org.generation.italy.jaita138.oop.model.Professionista;

public class App {
    public static void main(String[] args) throws Exception {
       /* 
        Persona p=new Persona(
            "Mario", "Rossi", 
            LocalDate.of(1980, 4, 12));
            
        //impossibile! Qual è il tesserino? e lo stipendio?
        ((Impiegato)p).riceviAumento(100);   


        Persona i=new Impiegato(
            "Pino", "Gialli", 
            LocalDate.of(1984, 3, 25), 
            "XYZ123", 1600, 
            LocalDate.of(2024, 8, 30));
       
        i.saluta();
    
        //Operazione di casting: "tratto" la persona i come Impiegato
        ((Impiegato)i).riceviAumento(100); 

        //Oppure (metodo alternativo):
        Impiegato impiegato=(Impiegato)i;       //Operazione di casting
        impiegato.riceviAumento(100);
       
       
        
        System.out.println(i.toString());
       
        System.out.println();

        Persona pr=new Professionista(
            "Gino", "Marroni", 
            LocalDate.of(1995, 6, 15), 
            "12354654413", 
            LocalDate.of(2025, 1, 22));

        pr.saluta();
        ((Professionista)pr).fattura(1000); //Operazione di casting: "tratto" la persona pr come Professionista
        ((Professionista)pr).fattura(1600);
        ((Professionista)pr).fattura(2000);
        System.out.println(pr.toString());
  */

        ArrayList<Persona> elencoPersone=new ArrayList<>();

        elencoPersone.add(new Persona("Mario", "Rossi", LocalDate.of(1995, 6, 15)));
        elencoPersone.add(new Impiegato("Pino", "Gialli", LocalDate.of(1995, 2, 13),"12321",1600,LocalDate.now()));
        elencoPersone.add(new Professionista("Gino", "Marroni", LocalDate.of(1998, 1, 8),"12354654413",LocalDate.now()));

        for (Persona p : elencoPersone) {            
            if (p instanceof Persona)
                p.saluta();
            if (p instanceof Impiegato) {       //verifico se persona è anche un impiegato 
                Impiegato i=(Impiegato)p;       //casting
                i.riceviAumento(100);
                System.out.println("Il mio stipendio è "+i.getStipendio());
            }
            if (p instanceof Professionista) {       //verifico se persona è anche un impiegato 
                Professionista pr =(Professionista)p;       //casting
                pr.fattura(1000);
                System.out.println("Il mio fatturato è: "+pr.getFatturato());
            }
        }

      

        
    }
}
