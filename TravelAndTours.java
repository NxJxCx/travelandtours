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

    static boolean confirmation(String title) {
        char answer = inputString(title + "(y/N)").strip().charAt(0);
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
                "4D3N Boracay Package with Airfare | Movenpick Resort from Manila",
                "4D3N Bohol Package with Airfare | Mithi Resort from Manila",
                "4D3N Bohol Package | Bohol Beach Club Resort with Transfers + Daily Breakfast",
                "4D3N Cebu Package with Airfare | Bluewater Maribago Resort from Manila",
                "12-Day Adventure & Sightseeing Vacation Package to Boracay, Cebu & Bohol with Flights from Manila",
                "4D3N Siargao Package with Airfare | Himaya Resort from Manila + Island Hopping Tour"
            );
            Tourist touristDetails;
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
                    println("\tPRICE:", "PHP", "30,752.00");
                    boolean c = confirmation("Confirm selected package? (y/N) ");
                    if (c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist(30752.00);
                        touristDetails.register();
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
                    boolean c = confirmation("Confirm selected package?");
                    if (c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist(26359.00);
                        touristDetails.register();
                    }
                    break;
                case 'c':
                    println("4D3N Cebu Package with Airfare | Bluewater Maribago Resort from Manila:");
                    println("\t-", "Roundtrip Airfare via Philippine Airlines | PR1845/1854 Manila - Cebu and PR1860 Cebu - Manila");
                    println("\t-", "Economy class seat with baggage allowance of 10 kilos");
                    println("\t-", "3 nights accommodation at Bluewater Maribago - Deluxe Room (Max. Occupancy - 2 Adults)");
                    println("\t-", "Daily Breakfas");
                    println("\t-", "Roundtrip airport transfers");
                    println("\t-", "One-time Bluewater Coolerss");
                    println("\t-", "BlueCARES Sanitation Kit");
                    println("\t-", "All environmental, port fees, and all other applicable taxes");
                    println("\tPRICE:", "PHP", "19,999.00");
                    boolean c = confirmation("Confirm selected package?");
                    if (c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist(19999.00);
                        touristDetails.register();
                    }
                    break;
                case 'd':
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
                    boolean c = confirmation("Confirm selected package?");
                    if (c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist(89075.00);
                        touristDetails.register();
                    }
                    break;
                case 'e':
                    println("4D3N Bohol Package with Airfare | Mithi Resort from Manila:");
                    println("\t-", "");
                    println("\t-", "");
                    println("\t-", "");
                    println("\t-", "");
                    println("\t-", "");
                    println("\t-", "");
                    println("\t-", "");
                    println("\t-", "");
                    println("\t-", "");
                    println("\t-", "");
                    println("\t-", "");
                    println("\tPRICE:", "PHP", ".00");
                    boolean c = confirmation("Confirm selected package?");
                    if (c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist(20,359.00);
                        touristDetails.register();
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
                    boolean c = confirmation("Confirm selected package?");
                    if (c)
                        println("Cancelled.");
                    else {
                        touristDetails = new Tourist(20999.00);
                        touristDetails.register();
                    }
                    break;
                default:
                    isDone = true;
            }
            getch();
        }
        println("Thank You and Goodbye,", tourist, "!");
    }

}


class Tourist {
    private double price;
    private String[] tourists;
    private int touristCount;
    Tourist(double price) {
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
      TravelAndTours.println("Total Price: PHP", this.getTotalPrice().toString());
      boolean confirm = TravelAndTours.confirmation("Confirm package?");
      if (!confirm) {
          this.touristCount = 0;
          return false;
      }
      TravelAndTours.println("Registration: (", this.touristCount.toString(), "Tourists)");
      tourist = new String[touristCount];
      for (int i = 0; i < touristCount; i++) {
        tourists[i] = TravelAndTours.inputString((i+1) + ")");
      }
      return true;
    }
}