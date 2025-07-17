package Estudo04Base.Application;

public class ImportProduct extends Product {
    private Double customFee;


    public ImportProduct(Double customFee, String name, Double price) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
    public Double totalPrice(){
        return price + customFee;
    }

    @Override
    public String priceTag() {
        return name
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customFee)
                + ")";
    }
}