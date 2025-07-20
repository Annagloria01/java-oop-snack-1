public class Main {
    public static void main(String[] args) {

        //SNACK 1
            Studente mario = new Studente("mario", "rossi", 18);
            System.out.println(mario.getInformation());
        //

        //SNACK 2
            ContoBancario contoAnna = new ContoBancario(32789);
            contoAnna.deposito(500);
            contoAnna.prelievo(100);

            System.out.println("il saldo corrente è " + contoAnna.getSaldo());
        //
    }
}
