package pl.migibud.oopexes.ex7_1;

public final class DiscountRate {

    public static final double FLAT_PRODUCT_DISCOUNT = 1 - 0.1;

    private DiscountRate(){}

    private static final double SERVICE_DISCOUNT_PREMIUM = 1-0.2;
    private static final double SERVICE_DISCOUNT_GOLD = 1-0.15;
    private static final double SERVICE_DISCOUNT_SILVER = 1-0.1;
    private static final double PRODUCT_DISCOUNT_PREMIUM = 1-0.1;
    private static final double PRODUCT_DISCOUNT_GOLD = 1-0.1;
    private static final double PRODUCT_DISCOUNT_SILVER = 1-0.1;

    public static double getServiceDiscountRate(String type){
        switch (type){
            case "Premium":
                return SERVICE_DISCOUNT_PREMIUM;
            case "Gold":
                return SERVICE_DISCOUNT_GOLD;
            case "Silver":
                return SERVICE_DISCOUNT_SILVER;
            default:
                break;
        }
        return 1;
    }

    public static double getProductDiscountRate(String type){
        switch (type){
            case "Premium":
                return PRODUCT_DISCOUNT_PREMIUM;
            case "Gold":
                return PRODUCT_DISCOUNT_GOLD;
            case "Silver":
                return PRODUCT_DISCOUNT_SILVER;
            default:
                break;
        }
        return FLAT_PRODUCT_DISCOUNT;
    }
}
