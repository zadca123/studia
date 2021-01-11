package pl.imiajd.Salwowski;
import java.time.*;
import java.util.*;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public int compareTo(Student stud) {
        if(super.compareTo(stud) == 0)
            return (Double.toString(stud.sredniaOcen).compareTo(Double.toString(stud.sredniaOcen)));
        return super.compareTo(stud);
    }

    public String toString() {
        return getClass().getSimpleName()+
            "\t[ Surname: " + getNazwisko() +
            "\tDate of Birth: " + getDataUrodzenia() +
            "\tAverage Score: " + sredniaOcen + " ]" ;
    }
    // public String toString() {
    //     return  getClass().getSimpleName()+
    //         "\t[ Surname: " + nazwisko +
    //         " \tDate of Birth: " + dataUrodzenia + " ]";
    // }

    private double sredniaOcen;
}
