package hu.petrik.eberekoop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


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
 /*   DateTimeFormatter formatter;
    String date;
    if (getSzuletesiHonap()>9) {

        formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        date = getSzuletesiEv()+"-"+getSzuletesiHonap()+"-"+getSzuletesiNap();
    }
    else {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        date = getSzuletesiEv()+"-"+getSzuletesiHonap()+"-"+getSzuletesiNap();
    }

    LocalDate localDate = LocalDate.parse(date, formatter);


    LocalDate maiDatum = LocalDate.now();
    int years =(int)ChronoUnit.YEARS.between(maiDatum,localDate); */
   LocalDate maiDatum = LocalDate.now();

    //if (maiDatum.getMonth()>=this.getSzuletesiHonap())

    boolean voltEszuletesnapja = maiDatum.getMonth().getValue() > this.getSzuletesiHonap()
            || maiDatum.getMonth().getValue() == this.getSzuletesiHonap()
            && maiDatum.getDayOfMonth() >= this.getSzuletesiNap();
    int eletkor = maiDatum.getYear() - this.getSzuletesiEv();
    if (!voltEszuletesnapja)
    {
    eletkor--;

    }



    return eletkor;




}

    @Override
    public String toString() {
        return String.format("%-30s %10s (%d) %20s %d", this.nev, this.szulDatum,this.getEletkor(), this.szulHely,this.getSzuletesiNap());
    }
}
