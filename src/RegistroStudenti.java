
public class RegistroStudenti {

    private Studente[] studenti;
    private int arrayIndex;

    public RegistroStudenti() {
        studenti = new Studente[3];
        arrayIndex = 0;
    }

    public void aggiungiStudenti(Studente studente) {
        if (arrayIndex < studenti.length) {
            studenti[arrayIndex] = studente;
            arrayIndex++;
        }
    }

    public void stampaStudenti() {
        for (int i = 0; i < studenti.length; i++) {
            System.out.println(studenti[i].getInformation());
        }
    }

}
