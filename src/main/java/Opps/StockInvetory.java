package Opps;

import java.util.Scanner;

public class StockInvetory {
    private static final int INVENTORY_SIZE = 12;
    private static Stock [] stocks;
    public StockInvetory(){
        stocks = new Stock[INVENTORY_SIZE];
    }
    private  void StockInventory(){
        for(int i = 0; i<INVENTORY_SIZE; i++){
            Scanner console = new Scanner(System.in);
            System.out.println("Stock's name:");
            String stockName = console.next();
            System.out.println("Stock's rating:");
            String stockRating = console.next();
            System.out.println("Stock's price:");
            int  stockPrice = console.nextInt();
            System.out.println("Number of shares:");
            int numberOfShares = console.nextInt();
            int numberOfShare = 2;
            stocks [i] = new Stock(stockName, stockRating, stockPrice, numberOfShare);
        }

    }

}