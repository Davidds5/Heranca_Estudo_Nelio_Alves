package Estudo06Base.entities;

public class individual extends TaxPayer {
    private Double healthExpenditues;


    public individual(String name, Double anuallncome, Double healthExpenditues) {
        super(name, anuallncome);
        this.healthExpenditues = healthExpenditues;
    }



    public Double getHealthExpenditues() {
        return healthExpenditues;
    }

    public void setHealthExpenditues(Double healthExpenditues) {
        this.healthExpenditues = healthExpenditues;
    }
    @Override
    public Double tax() {
        double basicTax;
        if(getAnualIcome()  < 2000.0){
            // ou basicTax = getAnualIcome() * 15.0 / 100;
            basicTax = getAnualIcome() * 0.15;
        }else {
            basicTax = getAnualIcome() * 0.25;
        }
        basicTax -= getHealthExpenditues() * 0.5;
        if (basicTax <  0.0){
            basicTax =  0.0;
        }
        return basicTax;
    }
}
