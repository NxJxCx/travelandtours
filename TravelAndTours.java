// Travel and Tour Packages in Java (Object Oriented Programming)
// Neil Jason Cañete

import java.util.*;

public class TravelAndTours {

    static void println(String... messages) {
        int i;
        for (i = 0; i < messages.length; i++) {
            System.out.print(messages[i]);
            if (i + 1 != messages.length) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }

    static void print(String... messages) {
        int i;
        for (i = 0; i < messages.length; i++) {
            System.out.print(messages[i]);
            if (i + 1 != messages.length) {
                System.out.print(" ");
            }
        }
    }

    static String inputString(String message) {
        System.out.print(message + " ");
        String ret = "";
        Scanner scanner = new Scanner(System.in);
        ret = scanner.nextLine();
        return ret;
    }
    
    static void getch() {
        println("");
        print("Press Enter to continue...");
        new Scanner(System.in).nextLine();
    }

    static char selection(String title, boolean hasQuit, String... options) {
        if (options.length == 0)
            return 'X';
        String bullets = "abcdefghijklmnopqrstuvwx0";
        println(title);
        for (int i = 0; i < options.length; i++) {
            println(bullets.substring(i,i+1), ")", options[i]);
        }
        if (hasQuit)
            println("X or 0", ")", "Quit");
        char selected = '\0';
        while (true) {
            selected = inputString("Enter your choice:").strip().charAt(0);
            if (bullets.substring(0, options.length).contains(String.valueOf(selected).toLowerCase()))
                return selected;
        }
    }

    static char selection(String title, String... options) {
        return selection(title, false, options);
    }

    public static void main(String[] args) {
        String tourist = "";
        boolean isDone = false;
        while (!isDone) {
            do {
                tourist = inputString("Enter your Name:");
            } while (tourist.equals(""));
            println("Welcome", tourist.substring(0,1).toUpperCase() + tourist.substring(1) + "!");
            /* Menu */
            println("|**** Travel and Tours Packages ****|");
            char packageChoice = selection(
                "Choose a package:",
                "4D3N Boracay Package with Airfare | Movenpick Resort from Manila",
                "4D3N Bohol Package with Airfare | Mithi Resort from Manila",
                "4D3N Bohol Package | Bohol Beach Club Resort with Transfers + Daily Breakfast",
                "4D3N Cebu Package with Airfare | Bluewater Maribago Resort from Manila",
                "12-Day Adventure & Sightseeing Vacation Package to Boracay, Cebu & Bohol with Flights from Manila",
                "4D3N Siargao Package with Airfare | Himaya Resort from Manila + Island Hopping Tour"
            );
            /* Package Details */
            switch (packageChoice) {
                case 'a':
                    println("4D3N Boracay Package with Airfare | Movenpick Resort from Manila:");
                    println("\t-", "Roundtrip airfare via Philippine Airlines | Manila - Caticlan - Manila");
                    println("\t-", "Economy class seat with baggage allowance of 10 kilos");
                    println("\t-", "3 nights accommodation at Movenpick Resort and Spa Boracay (Classic Room)");
                    println("\t-", "Daily breakfast at all-day dining restaurant, The Market");
                    println("\t-", "Roundtrip land and speedboat transfers to/from Caticlan");
                    println("\t-", "Movenpick Chocolate Hour (daily from 4:00pm – 5:00pm)");
                    println("\t-", "Complimentary scheduled shuttle service to/from D’Mall Shopping Center");
                    println("\t-", "Complimentary WiFi Access");
                    println("\t-", "Complimentary bottled water replenished daily");
                    println("\t-", "Access to swimming pool and selected resort facilities");
                    println("\t-", "All environmental, port fees, and all other applicable taxes");
                    println("\tPRICE:", "PHP", "20,359.00");
                    print("Confirm selected package? (y/N) ");
                    char c = new Scanner(System.in).nextLine().strip().charAt(0);
                    if (!(c == 'y' || c == 'Y'))
                        println("Cancelled.");
                    else {
                        
                    }
                    break;
                case 'b':
                    break;
                case 'c':
                    break;
                case 'd':
                    break;
                case 'e':
                    break;
                case 'f':
                    break;
                default:
                    isDone = true;
            }
            getch();
        }
        println("Thank You and Goodbye,", tourist, "!");
    }

}
