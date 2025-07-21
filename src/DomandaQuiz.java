public class DomandaQuiz {

    private String domanda;
    private String rispostaCorretta;

    public DomandaQuiz(String domanda, String rispostaCorretta) {
        this.domanda = domanda;
        this.rispostaCorretta = rispostaCorretta;
    }

    private boolean verificaRisposta(String rispostaUtente){
        return rispostaCorretta.equalsIgnoreCase(rispostaUtente.trim());
    }

    public void stampaRisultato(String rispostaUtente){
        if(verificaRisposta(rispostaUtente)){
            System.out.println("NO VABBE SEI TROPPO FORTE");
        }else{
            System.out.println("FAI SCHIFO");
        }
    }

    public String getDomanda() {
        return domanda;
    }


    
}
