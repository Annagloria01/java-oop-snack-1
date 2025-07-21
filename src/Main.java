import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //SNACK 1
            Studente mario = new Studente("mario", "rossi", 18);
            Studente giovanni = new Studente("giovanni", "storti", 78);
            Studente giordano = new Studente("giordano", "mario", 58);
            System.out.println(mario.getInformation());
        //

        //SNACK 2
            ContoBancario contoAnna = new ContoBancario("5454874689684");
            contoAnna.deposito(500);
            contoAnna.prelievo(100);

            System.out.println("il saldo corrente è " + contoAnna.getSaldo());
        //

        //SNACK 3
            RegistroStudenti registro = new RegistroStudenti();
            registro.aggiungiStudenti(mario);
            registro.aggiungiStudenti(giovanni);
            registro.aggiungiStudenti(giordano);

            registro.stampaStudenti();
        //

        //SNACK 4
            DomandaQuiz domandaQuiz = new DomandaQuiz("qual è la capitale dell'Italia?", "Roma");
            
            Scanner scanner = new Scanner(System.in);

            System.out.println("Rispondi alla seguente domanda: " + domandaQuiz.getDomanda());

            String risposta = scanner.next();

            domandaQuiz.stampaRisultato(risposta);
        //
    }
}
        