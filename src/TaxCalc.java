import java.math.BigDecimal;
public class TaxCalc {

    public static void main(String[] args) {

        double netValue = 9.99;
        double VAT = 0.23;
        double grossValue = netValue * (1 + VAT);
        int productsQuantity = 10_000;
        double totalValueExcludingVAT = netValue * productsQuantity;

        System.out.println("Using primitive data types: ");
        System.out.println("Net value of a product: $" + netValue);
        System.out.println("Gross value (including VAT) of a product: $" + grossValue);
        System.out.println("Number of products: " + productsQuantity);
        System.out.println("Total value of products (excluding VAT): $" + totalValueExcludingVAT);

        System.out.println("\nAfter using BigDecimal:");

        BigDecimal netPrice = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.23");
        BigDecimal productQuantity = new BigDecimal("10000");
        BigDecimal grossProductValue = netPrice.multiply(BigDecimal.ONE.add(vatRate));
        BigDecimal totalValueExcludingVATBigDecimal = netPrice.multiply(productQuantity);

        System.out.println("Net value of a product: $" + netPrice);
        System.out.println("Gross value (including VAT) of a product: $" + grossProductValue);
        System.out.println("Number of products: " + productQuantity);
        System.out.println("Total value of products (excluding VAT): $" + totalValueExcludingVATBigDecimal);

    }
}
