## Esercizio sull'ereditarietà


1) Scrivere una classe *Persona* contenente i seguenti attributi:  
* nome: String
* cognome: String
* dataNascita: LocalDate

e i seguenti metodi:
* costruttore
* void saluta(): mostra il messaggio "Ciao, mi chiamo <nome> <cognome> e sono nato il <dataNascita>"
* getters, setters opportuni (con verifica validità parametri)

2) Scrivere una sottoclasse *Impiegato* che eredita da *Persona* , e che contiene i seguenti attributi:
* nrTesserino: String
* dataAssunzione: LocalDate
* stipendio: Integer

e i seguenti metodi:
* costruttore
* void riceviAumento(int aumento): aumenta lo stipendio del valore indicato nel parametro
* String toString(): mostra tutti i dati del dipendente
* getters, setters opportuni (con verifica validità parametri)

3) Scrivere una sottoclasse *Professionista* che eredita da *Persona* , e che contiene i seguenti attributi:
* partitaIva: String
* dataInizioAttività: LocalDate
* totaleFatturato: Integer

e i seguenti metodi:
* costruttore
* void fattura(int importo): aumenta il totale fatturato del valore indicato nel parametro
* String toString(): mostra tutti i dati del professionista
* getters, setters opportuni (con verifica validità parametri)

**Versione 2:**
- Aggiungere alla classe Persona due attributi: username e password (di tipo String)
- Nella classe App dichiarare un ArrayList di persone, e popolarla con un elenco di oggetti di tipo Persona, Impiegato e Professionista
- All'avvio del programma chiedere all'utente di inserire username e password, e verificare se all'interno della lista esiste una persona con quelle credenziali
- Se la persona è stata trovata, mostrare il messaggio "Benvenuto <nome> <cognome>!" e, in base alla tipologia di persona, proporre l'elenco delle azioni possibili (ad esempio se la persona è un professionista può salutare e fatturare)
- Se la persona non è stata trovata, mostrare il messaggio "username o password non validi"
