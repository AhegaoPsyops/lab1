import java.util.*;
import java.lang.*;
class Purse {
    private final Map<Denomination, Integer> cash = new HashMap<>();


    public void add(Denomination type, int num) {
        if (num > 0) {
            cash.put(type, cash.getOrDefault(type, 0) + num);
        }
    }
    // somehow this works
    public double remove(Denomination type, int num) {
        // implement removal of value when calling to register
        return 0;
    }

    public double getValue() {
        return cash.entrySet().stream().mapToDouble(entry -> entry.getKey().amount() * entry.getValue()).sum();
    }

    public String toString() {
        StringBuilder value = new StringBuilder();
        value.append("Total Value: $").append(String.format("%.2f", getValue()));
        // initially I attempted to build an array, then went with list, then discovered string builder

        for (var entry : cash.entrySet()) {
            value.append(entry.getKey().name() + ": " + entry.getValue() + "\n");
        }
        value.append("Total Value: $").append(String.format("%.2f", getValue()));
        return value.toString();



    }
}
// im beginning to think i dont understand java
// written with the ballmer peak