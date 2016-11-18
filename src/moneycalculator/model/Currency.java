package moneycalculator.model;

public class Currency {
    private String symbol;
    private String name;
    private String code;
    

    public Currency(String symbol, String name, String code) {
        this.symbol = symbol;
        this.name = name;
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
}
