public class Osoba {
    int god;
    String ime;
    static int brosoba=0;
    public Osoba(String _ime,int _god){
        this.ime=_ime;
        this.god=_god;
        Osoba.brosoba++;
    }

}
