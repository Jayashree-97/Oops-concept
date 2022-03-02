package Opps;

public class Stock {
    private String companyName;
    private String stockRating;
    private int price;
    private int numberOfShares;

    public String getCompanyName(){
        return companyName;
    }
    public String getStockRating(){
        return stockRating;
    }
    public int getNumberOfShares(){
        return numberOfShares;
    }
    public Stock(String companyName, String stockRating, int price, int numberOfShares){
        super();
        this.companyName = companyName;
        this.stockRating = stockRating;
        this.price = price;
        this.numberOfShares = numberOfShares;
    }
}
