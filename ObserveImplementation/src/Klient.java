import java.util.ArrayList;
import java.util.List;

public class Klient implements Observer{
    private String imie;
    private String nazwisko;
    private String telefon;
    private  String message ;

    public Klient() {
    }

    public Klient(String imie, String nazwisko, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
    }

    public Klient(String imie, String nazwisko, String telefon, String message) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.message = message;
    }

    @Override
    public void update(String message) {
        System.out.println("Poinformuj Klienta");
        setMessage(message);
        System.out.println(message);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
