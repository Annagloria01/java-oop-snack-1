public class ContoBancario {
    private int nConto;
    private double saldo;

    public ContoBancario(int nConto) {
        this.nConto = nConto;
        this.saldo = 0;
    }

    public void deposito(int ammontare) {
        if (ammontare > 0) {
            this.saldo += ammontare;
            System.out.println("Ammontare Depositato di " + ammontare + " euro");
            return;
        }

        System.out.println("l'importo deve essere maggiore di 0");
    }

    public void prelievo(int ammontare) {
        if (this.saldo > ammontare) {
            this.saldo -= ammontare;
            System.out.println("Prelevato l'ammontare di " + ammontare + " euro");
            return;
        }

        System.out.println("Non hai abbastanza fondi per prelevare " + ammontare + " euro");
    }

    public double getSaldo() {
        return this.saldo;
    }

}
