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
 /*   Denomination[] denom = new Denomination[]{
            new Denomination("Hundred", 100.00, "bill", "hundred.png"),
            new Denomination("Fifty", 50.00, "bill", "fifty.png"),
            new Denomination("Twenty", 20.00, "bill", "twenty.png"),
            new Denomination("Ten", 10.00, "bill", "ten.png"),
            new Denomination("Five", 5.00, "bill", "five.png"),
            new Denomination("One", 1.00, "bill", "one.png"),
            new Denomination("Quarter", 0.25, "coin", "quarter.png"),
            new Denomination("Dime", 0.10, "coin", "dime.png"),
            new Denomination("Nickel", 0.05, "coin", "nickel.png"),
            new Denomination("Penny", 0.01, "coin", "penny.png");
    }     If I just make it a list I can make a recursive call instead of making a statement for each denom in array   */

            public Purse makeChange(double amt) {
                Purse purse = new Purse();
                // use double instead of int for recursion, allows me to call the amount directly for comparison
                // int change = (int) (amt * 100);
                amt = Math.round(amt * 100.0) / 100.0;


                for (Denomination denom : DENOMINATIONS) {
                    // create int in each recursion to control amount of bills
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
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter value of Purse: ");

                double amount = scan.nextDouble();
                Purse purse = register.makeChange(amount);
                System.out.println(purse);
            }
        }