import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import org.generation.italy.jaita138.oop.model.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona p=new Persona("Mario", "Rossi", LocalDate.of(1980, 4, 12));
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        p.saluta();
        

        Scanner sc=new Scanner(System.in);
       
       
        Persona p1=null;
        do {
            System.out.print("Inserisci il nome: ");
            String nome=sc.nextLine();   
            System.out.print("Inserisci il cognome: ");
            String cognome=sc.nextLine();   
            System.out.print("Inserisci la data di nascita: ");
                  
            try {
                LocalDate dn=LocalDate.parse(sc.nextLine(),df);  
                p1=new Persona(nome, cognome, dn);            
            } catch (DateTimeParseException e) {
                System.out.println("Impossibile creare la persona: Data non valida");
            } catch (Exception e) {
                System.out.println("Impossibile creare la persona: "+e.getMessage());
            }
        }  while(p1==null);;
        p1.saluta();

    }
}
