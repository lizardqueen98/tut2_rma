package ba.unsa.etf.rma.vj_18067;

public class Muzicar {
    private String ime, prezime, biografija, zanr, webStranica, slikaZanra;

    public Muzicar() {
    }

    public Muzicar(String ime, String prezime, String biografija, String zanr, String webStranica, String slikaZanra) {
        this.ime = ime;
        this.prezime = prezime;
        this.biografija = biografija;
        this.zanr = zanr;
        this.webStranica = webStranica;
        this.slikaZanra = slikaZanra;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getWebStranica() {
        return webStranica;
    }

    public void setWebStranica(String webStranica) {
        this.webStranica = webStranica;
    }

    public String getSlikaZanra() {
        return slikaZanra;
    }

    public void setSlikaZanra(String slikaZanra) {
        this.slikaZanra = slikaZanra;
    }
}
