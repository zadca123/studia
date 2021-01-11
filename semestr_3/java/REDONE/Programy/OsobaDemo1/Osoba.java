import java.time.LocalDate;

public class Osoba
{
    public Osoba(String nazwisko, int year, int month, int day)
    {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.of(year, month, day);
    }

    public String toString()
    {
        return "[nazwisko: " + nazwisko + ", data urodzenia: " + dataUrodzenia + "]";
    }

    public boolean equals(Osoba other)
    {
        return nazwisko.equals(other.nazwisko) && dataUrodzenia.equals(other.dataUrodzenia);
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia()
    {
        return dataUrodzenia;
    }

    private String nazwisko;
    private LocalDate dataUrodzenia;
}

