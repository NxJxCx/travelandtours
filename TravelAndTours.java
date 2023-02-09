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
        String bullets = "x0abcdefghijklmnopqrstuvw";
        println(title);
        for (int i = 2; i < options.length + 2; i++) {
            println(bullets.substring(i,i+1), ")", options[i-2]);
        }
        if (hasQuit)
            println("X or 0", ")", "Quit");
        char selected = '\0';
        while (true) {
            String tmp = inputString("Enter your choice:").strip();
            if (tmp.length() == 0)
                continue; // repeat
            selected = tmp.charAt(0);
            if (bullets.substring(0, options.length + 2).contains(String.valueOf(selected).toLowerCase()))
                return selected;
        }
    }

    static char selection(String title, String... options) {
        return selection(title, false, options);
    }

    static boolean confirmation(String title) {
        String tmp = inputString(title + " (y/N)").strip();
        if (tmp.length() == 0)
            return false;
        char answer = tmp.charAt(0);
        if (answer == 'y' || answer == 'Y')
          return true;
        return false;
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
                true,
                "4D3N Boracay Package with Airfare | Movenpick Resort from Manila",
                "4D3N Bohol Package with Airfare | Mithi Resort from Manila",
                "4D3N Bohol Package | Bohol Beach Club Resort with Transfers + Daily Breakfast",
                "4D3N Cebu Package with Airfare | Bluewater Maribago Resort from Manila",
                "12-Day Adventure & Sightseeing Vacation Package to Boracay, Cebu & Bohol with Flights from Manila",
                "4D3N Siargao Package with Airfare | Himaya Resort from Manila + Island Hopping Tour"
            );
            Tourist touristDetails;
            System.out.println();
            /* Package Details */
            boolean c;
            switch (String.valueOf(packageChoice).toLowerCase().charAt(0)) {
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
                    println("\tPRICE:", "PHP", "30,752.00");
                    c = confirmation("Confirm selected package? (y/N) ");
                    if (!c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist("4D3N Boracay Package with Airfare | Movenpick Resort from Manila", 30752.00);
                        touristDetails.register();
                        touristsDetails.showTouristDetails();
                        System.out.println("Enjoy your trip!");
                    }
                    break;
                case 'b':
                    println("4D3N Bohol Package with Airfare | Mithi Resort from Manila:");
                    println("\t-", "Roundtrip airfare via Philippine Airlines | PR2773 Manila - Bohol and PR2778 Bohol - Manila");
                    println("\t-", "Economy class seat with baggage allowance of 10 kilos");
                    println("\t-", "3 nights accommodation at Mithi Resort & Spa - Superior Room (Max. Occupancy of 2 Adults)");
                    println("\t-", "Daily Breakfast");
                    println("\t-", "Roundtrip Airport Transfers by Mithi Resort & Spa");
                    println("\t-", "Visit at resort's natural Underground Cambagat Cave");
                    println("\t-", "All environmental, port fees, and all other applicable taxes");
                    println("\tPRICE:", "PHP", "26,359.00");
                    c = confirmation("Confirm selected package?");
                    if (!c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist("4D3N Bohol Package with Airfare | Mithi Resort from Manila", 26359.00);
                        touristDetails.register();
                        touristsDetails.showTouristDetails();
                        System.out.println("Enjoy your trip!");
                    }
                    break;
                case 'c':
                    println("4D3N Bohol Package | Bohol Beach Club Resort with Transfers + Daily Breakfast:");
                    println("\t-", "3 nights accommodation at Bohol Beach Club - Deluxe Room (Max. Occupancy of 2 Adults)");
                    println("\t-", "Daily breakfast");
                    println("\t-", "F&B Credits worth PHP1,500 per person");
                    println("\t-", "20 mins glass bottom boat tour");
                    println("\t-", "Roundtrip airport transfers");
                    println("\t-", "All environmental, port fees, and all other applicable taxes");
                    println("\tPRICE:", "PHP", "12,488.00");
                    c = confirmation("Confirm selected package?");
                    if (!c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist("4D3N Bohol Package | Bohol Beach Club Resort with Transfers + Daily Breakfast", 12488.00);
                        touristDetails.register();
                        touristsDetails.showTouristDetails();
                        System.out.println("Enjoy your trip!");
                    }
                    break;
                case 'd':
                    println("4D3N Cebu Package with Airfare | Bluewater Maribago Resort from Manila:");
                    println("\t-", "Roundtrip Airfare via Philippine Airlines | PR1845/1854 Manila - Cebu and PR1860 Cebu - Manila");
                    println("\t-", "Economy class seat with baggage allowance of 10 kilos");
                    println("\t-", "3 nights accommodation at Bluewater Maribago - Deluxe Room (Max. Occupancy - 2 Adults)");
                    println("\t-", "Daily Breakfast");
                    println("\t-", "Roundtrip airport transfers");
                    println("\t-", "One-time Bluewater Coolers");
                    println("\t-", "BlueCARES Sanitation Kit");
                    println("\t-", "All environmental, port fees, and all other applicable taxes");
                    println("\tPRICE:", "PHP", "19,999.00");
                    c = confirmation("Confirm selected package?");
                    if (!c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist("4D3N Cebu Package with Airfare | Bluewater Maribago Resort from Manila", 19999.00);
                        touristDetails.register();
                        touristsDetails.showTouristDetails();
                        System.out.println("Enjoy your trip!");
                    }
                    break;
                case 'e':
                    println("12-Day Adventure & Sightseeing Vacation Package to Boracay, Cebu & Bohol with Flights from Manila:");
                    println("\t-", "11 nights accommodation in a deluxe level hotel or similar (Manila, Bohol, Cebu & Boracay)");
                    println("\t-", "One-way airline economy seat class with 7kgs carry-on baggage and 20kgs check-in baggage via Philippine Airlines (Manila-Bohol, Cebu-Caticlan & Caticlan-Manila)");
                    println("\t-", "One-way ferry business seat class with 15kgs carry-on baggage and 20kgs check-in baggage via Oceanjet (Tagbilaran-Cebu)");
                    println("\t-", "All private airconditioned airport & seaport transfers in Manila, Bohol, Cebu & Boracay");
                    println("\t-", "Bohol Countryside Tour with Loboc River Cruise Lunch & Transfers (Day 4)");
                    println("\t-", "Bohol Island Hopping Tour at Balicasag & Virgin Islands with Dolphin Watching (Day 5)");
                    println("\t-", "Cebu City & Highlands Vista Private Tour with Transfers (Day 7)");
                    println("\t-", "Cebu Kawasan Falls Canyoneering, Moalboal Island Hopping & Sardine Run Tour with Lunch & Transfers (Day 8 - Canyoneering is Optional)");
                    println("\t-", "Boracay Shared Island Hopping & Snorkeling Tour with Lunch, Transfers & Kawa Hot Bath (Day 10)");
                    println("\t-", "English-speaking tour guides");
                    println("\t-", "Complimentary Wi-Fi access and use of facilities in the hotel");
                    println("\t-", "Domestic Travel Insurance (Up to 21 days travel duration)");
                    println("\t-", "All environmental fees, port fees, and all other applicable taxes");
                    println("\tPRICE:", "PHP", "89,075.00");
                    c = confirmation("Confirm selected package?");
                    if (!c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist("12-Day Adventure & Sightseeing Vacation Package to Boracay, Cebu & Bohol with Flights from Manila", 89075.00);
                        touristDetails.register();
                        touristsDetails.showTouristDetails();
                        System.out.println("Enjoy your trip!");
                    }
                    break;
                case 'f':
                    println("4D3N Siargao Package with Airfare | Himaya Resort from Manila + Island Hopping Tour:");
                    println("\t-", "Roundtrip airfare via Philippine Airlines | PR2971 Manila - Siargao and PR2972 Siargao - Manila");
                    println("\t-", "3 Nights Accommodation at Himaya Siargao - Deluxe Villa (Max of 2 Adults)");
                    println("\t-", "Daily Breakfast");
                    println("\t-", "Roundtrip airport transfers to/from Sayak Airport (IAO)");
                    println("\t-", "Day 2 - Free Siargao Tri-Island Hopping Day Tour with Transfers");
                    println("\t-", "Free Use of Common Kitchen & Common Area");
                    println("\t-", "Free Wi-Fi at the Common Spaces");
                    println("\t-", "Free Drinking Water");
                    println("\t-", "All environmental, port fees, and all other applicable taxes");
                    println("\tPRICE:", "PHP", "20,999.00");
                    c = confirmation("Confirm selected package?");
                    if (!c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist("4D3N Siargao Package with Airfare | Himaya Resort from Manila + Island Hopping Tour", 20999.00);
                        touristDetails.register();
                        touristsDetails.showTouristDetails();
                        System.out.println("Enjoy your trip!");
                    }
                    break;
                default:
                    isDone = true;
            }
            if (!isDone)
                getch();
        }
        println("Thank You and Goodbye,", tourist, "!");
    }

}


class Tourist {
    private double price;
    private String[] tourists;
    private int touristCount;
    private String packageTitle;

    static String capitalize(String string) {
        String[] splits = string.split(" ");
        for (int i = 0; i < splits.length; i++) {
            splits[i] = splits[i].substring(0, 1).toUpperCase() + splits[i].substring(1);
        }
        return String.join(" ", splits);
    }

    Tourist(String packageTitle, double price) {
        this.packageTitle = packageTitle;
        this.price = price;
        this.touristCount = 0;
    }
    
    public double getPrice() {
        return Math.round(this.price * 100) * 0.01;
    }

    public int getNumberOfTourist() {
        return this.touristCount;
    }

    public double getTotalPrice() {
        return Math.round(this.touristCount * this.price * 100) * 0.01;
    }

    public boolean register() {
        int touristCount = Integer.parseInt(TravelAndTours.inputString("How many tourist will be registering?").strip());
        if (touristCount < 1) {
            TravelAndTours.println("Invalid number of tourists!");
            return false;
        }
        this.touristCount = touristCount;
        TravelAndTours.println("-------------------------------");
        TravelAndTours.println("Package Price\tPHP\t" + this.getPrice());
        TravelAndTours.println("No. of Tourists\t\tx" + (touristCount > 9 ? "    " : "     ") +  touristCount);
        TravelAndTours.println("-------------------------------");
        TravelAndTours.println("Total Price\tPHP\t" + this.getTotalPrice());
        TravelAndTours.println("-------------------------------");
        boolean confirm = TravelAndTours.confirmation("Confirm package?");
        if (!confirm) {
            this.touristCount = 0;
            TravelAndTours.println("Cancelled.");
            return false;
        }
        TravelAndTours.println("Registration: (" + this.touristCount, "Tourists)");
        TravelAndTours.println("(Write the Full Name of each Tourists)");
        tourists = new String[touristCount];
        for (int i = 0; i < touristCount; i++) {
            tourists[i] = capitalize(TravelAndTours.inputString((i+1) + ")"));
        }
        return true;
    }

    public void showTouristDetails() {
        System.out.println("#*************************************************");
        System.out.println("# " + this.packageTitle);
        System.out.println("# Package Price: PHP " + this.price + " x " + this.touristCount + " tourists");
        System.out.println("# Total Price: PHP " + this.getTotalPrice());
        System.out.println("#--------------------------------------------------");
        System.out.println("# Tourists: ");
        for (int i = 0; i < this.tourists.length; i++) {
            System.out.println((i+1) + ") " + this.tourists[i];
        }
        System.out.println("#*************************************************");
    }
}
