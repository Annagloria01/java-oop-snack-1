public class ContoBancario {
    private String nConto;
    private double saldo;

    public ContoBancario(String nConto) {
        this.nConto = nConto;
        this.saldo = 0;
    }

    public void deposito(double ammontare) {
        if (ammontare > 0) {
            this.saldo += ammontare;
        } else {
             System.out.println("l'importo deve essere maggiore di 0"); 
        }
    }

       

    public void prelievo(double ammontare) {
        if (ammontare >=0 && ammontare <= saldo) {
            this.saldo -= ammontare;
        }else {
             System.out.println("Non hai abbastanza fondi per prelevare " + ammontare + " euro");
        }

       
    }

    public double getSaldo() {
        return this.saldo;
    }

}
