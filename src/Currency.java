import java.util.*;
public class Currency {
    ArrayList<Denomination> denominations;
    public Currency(ArrayList<Denomination> moneyTypes) { denominations = moneyTypes; }
    public Currency createCurrency() {
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
        return createCurrency();
    }
    // fueled by copious amounts of alcohol and nicotine
}
