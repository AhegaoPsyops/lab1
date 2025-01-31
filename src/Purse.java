import java.util.HashMap;
import java.util.Map;
class Purse {
    private final Map<Denomination, Integer> cash = new HashMap<>();


    public void add(Denomination type, int num) {
        if (num > 0) {
            cash.put(type, cash.getOrDefault(type, 0) + num);
        }
    }
    // somehow this works
    public double remove(Denomination type, int num) {
        if (!cash.containsKey(type) || cash.get(type) < num) {
            throw new IllegalArgumentException("Not enough of this denomination in the purse.");
        }
        cash.put(type, cash.get(type) - num);
        if (cash.get(type) == 0) {
            cash.remove(type);
        }
        return num * type.amount();
    }

    public double getValue() {
        return cash.entrySet().stream().mapToDouble(entry -> entry.getKey().amount() * entry.getValue()).sum();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Purse Contents:\n");
        for (var entry : cash.entrySet()) {
            sb.append(entry.getKey().name()).append(" (").append(entry.getKey().form()).append("): ").append(entry.getValue()).append("\n");
        }
        sb.append("Total Value: $").append(String.format("%.2f", getValue()));
        return sb.toString();
    }
}
// im beginning to think i dont understand java
// written with the ballmer peak