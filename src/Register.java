import java.util.*;
class Register {
    // somehow this works, thanks geeksforgeeks
    private static final List<Denomination> DENOMINATIONS = List.of(
                    new Denomination("Hundred Note", 100.00, "bill", "hundred.png"),
                    new Denomination("Fifty Note", 50.00, "bill", "fifty.png"),
                    new Denomination("Twenty Note", 20.00, "bill", "twenty.png"),
                    new Denomination("Ten Note", 10.00, "bill", "ten.png"),
                    new Denomination("Five Note", 5.00, "bill", "five.png"),
                    new Denomination("One Note", 1.00, "bill", "one.png"),
                    new Denomination("Quarter", 0.25, "coin", "quarter.png"),
                    new Denomination("Dime", 0.10, "coin", "dime.png"),
                    new Denomination("Nickel", 0.05, "coin", "nickel.png"),
                    new Denomination("Penny", 0.01, "coin", "penny.png")
            );

            public Purse makeChange(double amt) {
                Purse purse = new Purse();
                amt = Math.round(amt * 100.0) / 100.0;

                for (Denomination denom : DENOMINATIONS) {
                    int count = (int) (amt / denom.amount());
                    if (count > 0) {
                        purse.add(denom, count);
                        amt -= count * denom.amount();
                        amt = Math.round(amt * 100.0) / 100.0;
                    }
                }
                return purse;
            }

            public static void main(String[] args) {
                Register register = new Register();
                double amount = 237.86; // Example amount
                Purse purse = register.makeChange(amount);
                System.out.println(purse);
            }
        }