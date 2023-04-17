public class Notatka {
    static int licznik = 0;
    private int id;
    protected String tytul;
    protected String tekst;

    public Notatka(String tytul, String tekst) {
        licznik++;
        id = licznik;
        this.tytul = tytul;
        this.tekst = tekst;
    }

    public void wyswietl(){

    }
}
