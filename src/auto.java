public class Auto {
    int srbr;
    Osoba[]putnici;
    public Auto(int srbr){
        this.srbr=srbr;
        this.putnici=new Osoba[4];
    }
    boolean ulazak(Osoba putnik,int br_sed){
        if(br_sed>=0 && br_sed<4 &&putnici[br_sed]==null) {
            this.putnici[br_sed] = putnik;
            return true;
        }
        else
        {
            return false;
        }



    }
    boolean izlazak(int br_sed){
        if(br_sed>=0 && br_sed<4 && putnici[br_sed]!=null ){
            this.putnici[br_sed]=null;
            return true;
        }
        else {
            return false;
        }
    }

}
