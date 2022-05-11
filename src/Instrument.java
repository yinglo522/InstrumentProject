public class Instrument {

    private String symbol;
    private String exchange;
    private String type;

    public Instrument(String symbol, String exchange, String type) {
        this.symbol = symbol;
        this.exchange = exchange;
        this.type = type;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

