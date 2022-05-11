import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    Instrument a = new Instrument("5", "HK", "Stock");
    Instrument b = new Instrument("GOOG", "US", "Stock");
    Instrument c = new Instrument("7", "HK", "Futures");

    List<Instrument> originalList = Arrays.asList(a, b, c);

    @Test
    void HKExchangeTest() {
        List<Instrument> expectedList = Arrays.asList(a, c);
        assertArrayEquals(expectedList.toArray(), Program.getInstruments(originalList, "HK").toArray());
    }

    @Test
    void USExchangeTest() {
        List<Instrument> expectedList = Arrays.asList(b);
        assertArrayEquals(expectedList.toArray(), Program.getInstruments(originalList, "US").toArray());
    }

    @Test
    void NoMatchExchangeTest() {
        List<Instrument> expectedList = Arrays.asList();
        assertArrayEquals(expectedList.toArray(), Program.getInstruments(originalList, "UK").toArray());
    }
}