public class Main {

    public static void main(String[] args) {

        int x= 5, y=3;
        Osoba [] putnici= new Osoba[4];
        Osoba osoba1= new Osoba("Mika",17);
        Osoba osoba2= new Osoba("Zika",18);
        Osoba osoba3= new Osoba("Vlada", 14);
        x = y;
        osoba1 = osoba2;
        y=y+1;
        System.out.println("x=" +x+" y=" +y);
        osoba2.god++;
        System.out.println(osoba1.ime+" ima "+ osoba1.god+" godina,a "+osoba2.ime+" ima "+osoba2.god+" godina.");
        System.out.println("Broj osoba: " +Osoba.brosoba);
        putnici[1]= new Osoba("Stefan", 17);
    }
}