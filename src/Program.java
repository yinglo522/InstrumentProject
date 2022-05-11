import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static List<Instrument> getInstruments(List<Instrument> list, String exchange) {
        return list.stream()
                .filter(i -> exchange.equals(i.getExchange()))
                .collect(Collectors.toList());
    }

    public static void main(String args[]) {
        List<Instrument> list = Arrays.asList(
                new Instrument("5", "HK", "Stock"),
                new Instrument("GOOG", "US", "Stock"),
                new Instrument("7", "HK", "Futures"));

        list = getInstruments(list, "HK");
        for (Instrument s : list) {
            System.out.println(s.getSymbol());
        }
    }
}
