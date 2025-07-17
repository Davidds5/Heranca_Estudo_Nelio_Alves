package Estudo04Base.entities;

import Estudo04Base.Application.ImportProduct;
import Estudo04Base.Application.Product;
import Estudo04Base.Application.UserProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> productList = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.println("Enter the number of products: ");
        int quantityProduct = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantityProduct ; i++) {
            System.out.println("Product#" + (i + 1) + " data:");
            System.out.println("Common, used or imported (c/u/i)? ");
            char type = sc.nextLine().toLowerCase().charAt(0);

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if(type == 'i'){
                System.out.println("Custom fee: ");
                double customFee = sc.nextDouble();
                sc.nextLine();
                productList.add(new ImportProduct(customFee, name, price ));
            } else if (type == 'c') {
                productList.add(new Product(name, price));

            }
            else {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                String datestr = sc.nextLine();
                Date date = sdf.parse(datestr);

                productList.add(new UserProduct(date, name, price));
            }

            }
            System.out.println();
        System.out.println("PRICE TAGS");
        for (Product product : productList){
            System.out.println(product.priceTag());
        }
        sc.close();
    }

}
