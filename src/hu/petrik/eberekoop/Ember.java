package hu.petrik.eberekoop;

import java.time.LocalDate;


public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int getSzuletesiEv()
    {
        return Integer.parseInt(this.szulDatum.substring(0,4));

    }
    public int getSzuletesiHonap()
    {

        return Integer.parseInt(this.szulDatum.split("-")[1]);


    }
    public int getSzuletesiNap()
    {

        return Integer.parseInt(this.szulDatum.split("-")[2]);


    }
public int getEletkor()
{

    LocalDate maiDatum = LocalDate.now();
    return maiDatum.getYear() - getSzuletesiEv();




}

    @Override
    public String toString() {
        return String.format("%-30s %10s (%d) %20s %d", this.nev, this.szulDatum,this.getEletkor(), this.szulHely,this.getSzuletesiNap());
    }
}
