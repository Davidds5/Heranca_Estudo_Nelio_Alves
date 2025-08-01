package Estudo04Base.Application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserProduct extends Product{
    private Date manufactureDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public UserProduct(Date manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }


    @Override
    public String priceTag() {
        return name
                + " (used) $ "
                + String.format("%.2f", price)
                + " (Manufacture date: "
                + sdf.format(manufactureDate)
                + ")";
    }
}
