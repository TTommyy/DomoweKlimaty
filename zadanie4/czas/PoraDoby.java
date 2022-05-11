package zadanie4.czas;

public class PoraDoby {
    /*------------------Pola-------------------*/
    /**Poczatek i koniec w sekundach*/
    private int poczatek,koniec;

    /*-------------Medoty------------*/
    /**Konstruktor domyslny*/
    public PoraDoby(){ poczatek = koniec = 0; }
    /**Konstruktor*/
    public PoraDoby(int poczatekSekunda, int koniecSekunda){
        poczatek = poczatekSekunda;
        koniec = koniecSekunda;
    }
    /**Ustawia początek w "sekundach dnia"*/
    public void ustawPoczatek(int poczatek){
        this.poczatek = poczatek;
    }

    /**Ustawia koniec okresu w "sekundach dnia"*/
    public void ustawKoniec(int koniec){
        this.koniec = koniec;
    }

    /**Pobiera początek okresu w "sekundach dnia"*/
    public int pobierzPoczatek(){ return poczatek; }

    /**Pobiera koniec okresu w "sekundach dnia"*/
    public int pobierKoniec(){ return koniec; }

    /**Metoda sprawdzająca, czy dana
     * sekunda dnia zawiera się w przedziale
     * [poczatek, koniec)*/
    public boolean zawieraSie(int sekundaDnia){
        /*
        Uwaga na sytuację, w której poczatek > koniec,
        jest ona prawidłowa i oznacza zawieranie przez przedział północy.
        Należy ją w tej metodzie obsłużyć odpowiednio. .
         */
        if(poczatek<=koniec){
            return sekundaDnia >= poczatek && sekundaDnia < koniec;
        }
        return sekundaDnia <= poczatek && sekundaDnia > koniec;

    }

    /**Metoda podająca w sekundach dlugosc przedzialu*/
    public  int dlugosc(){
        if(poczatek <= koniec) return koniec-poczatek;
        return koniec + 24 - poczatek;
    }

}
