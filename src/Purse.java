import java.util.HashMap;
import java.util.Map;
class Purse {
    private final Map<String, Integer> cash = new HashMap<>();

    public void add(String denomination, int count) {
        if (count > 0) {
            cash.put(denomination, cash.getOrDefault(denomination, 0) + count);
        }
    }
    public double remove(String denomination, int count) {
        if (count > 0) {
            cash.put(denomination, cash.getOrDefault(denomination, 0) + count);
        }
        return 0;
    }
    public void getValue() {

    }
    public void printContents() {
        System.out.println("Change breakdown:");
        for (var entry : cash.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    Denomination hundred = new Denomination("Hundred Dollar Bill", 100.00,"cash", "/path");
    Denomination fifty = new Denomination("Fifty Dollar Bill", 50.00, "cash", "/path");
    Denomination twenty = new Denomination("Twenty Dollar Bill", 20.00,"cash", "/path");
    Denomination ten = new Denomination("Ten Dollar Bill", 20.00, "cash", "/path");
    Denomination five = new Denomination("Five Dollar Bill", 50.00, "cash", "/path");
    Denomination one = new Denomination("One Dollar Bill", 20.00, "cash", "/path");
    Denomination quarter = new Denomination("Quarter", .25, "change", "/path");
    Denomination dime = new Denomination("Dime", .10, "change", "/path");
    Denomination nickel = new Denomination("Nickel", .5, "change", "/path");
    Denomination penny = new Denomination("Penny", .1, "change", "/path");

}


