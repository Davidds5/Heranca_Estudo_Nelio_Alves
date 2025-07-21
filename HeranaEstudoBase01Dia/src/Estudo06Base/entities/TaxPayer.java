package Estudo06Base.entities;

public abstract class TaxPayer {
    private String name;
    private Double anualIcome;


    public TaxPayer(String name, Double anuallncome) {
        this.name = name;
        this.anualIcome = anuallncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIcome() {
        return anualIcome;
    }

    public void setAnualIcome(Double anualIcome) {
        this.anualIcome = anualIcome;
    }


    // nao sera usada nessa class por isso ser abstract
    public abstract Double tax();
}
