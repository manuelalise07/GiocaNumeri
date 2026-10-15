import java.util.logging.Level;
import java.util.logging.Logger;


public class Giocatore implements Runnable{
    String nome;
    private String parola;
    private int punteggio;

    /**
     *
     * @param nome del Giocatore
     */
    public Giocatore(String nome){
        this.nome = nome;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    /**
     * gioca, metodo che implementa la logica del gioco e calcola il punteggio
     */
    public void gioca(){
        int numero = 19;
        String parola = "Divertiti";
        setParola(parola);


        for (int i=0; i<numero; i++){
            try {
                System.out.println("Giocatore : " + nome + " i: " + i);
               Thread.currentThread().sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println("Errore nella transizione da RUNNING a SLEEPING");
            }
        }

        setPunteggio(100);

        System.out.println("Giocatore : " + nome + " parola: " + getParola() + " punteggio: " + punteggio);
    }

    public void comunica(){
    }

    @Override
    public void run(){
        gioca();
    }
}