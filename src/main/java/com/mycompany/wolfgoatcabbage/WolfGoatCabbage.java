/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wolfgoatcabbage;

/**
 *
 * @author andrey
 */
public class WolfGoatCabbage {

    public static void main(String[] args) {
        // Each variable keeps track of where the actor is located
        // Shores: 0 = left shore, 1 = right shore
        int farmer = 0;
        int wolf = 0;
        int goat = 0;
        int cabbage = 0;

        // Flag for successful transport
        boolean success = true;

        // Steps:

        // 1. The farmer is taking the goat to the right shore
        goat = 1;
        farmer = 1;
        success = printState(farmer, wolf, goat, cabbage, "The goat has been taken to the right shore", success);
        if (!success) {
            System.out.println("Someone ate someone! Transport failed.");
            return;
        }

        // 2. The farmer is coming back to the left shore
        farmer = 0;
        success = printState(farmer, wolf, goat, cabbage, "The farmer is back to the left shore", success);
        if (!success) {
            System.out.println("Someone ate someone! Transport failed.");
            return;
        }

        // 3. The farmer is taking the cabbage to the right shore
        cabbage = 1;
        farmer = 1;
        success = printState(farmer, wolf, goat, cabbage, "The cabbage has been taken to the right shore", success);
        if (!success) {
            System.out.println("Someone ate someone! Transport failed.");
            return;
        }

        // 4. The farmer is taking the goat back to the left shore
        goat = 1;
        farmer = 0;
        success = printState(farmer, wolf, goat, cabbage, "The goat has been taken back to the left shore", success);
        if (!success) {
            System.out.println("Someone ate someone! Transport failed.");
            return;
        }

        // 5. The farmer is taking the wolf to the right shore
        wolf = 1;
        farmer = 1;
        success = printState(farmer, wolf, goat, cabbage, "The wolf has been taken to the right shore", success);
        if (!success) {
            System.out.println("Someone ate someone! Transport failed.");
            return;
        }

        // 6. The farmer is coming back alone
        farmer = 0;
        success = printState(farmer, wolf, goat, cabbage, "The farmer is back to the left shore", success);
        if (!success) {
            System.out.println("Someone ate someone! Transport failed.");
            return;
        }

        // 7. The farmer is taking the goat to the right shore
        goat = 1;
        farmer = 1;
        success = printState(farmer, wolf, goat, cabbage, "The goat has been moved to the right shore", success);
        if (!success) {
            System.out.println("Someone ate someone! Transport failed.");
            return;
        }

        // If we reached here, all went well
        System.out.println("All three have been moved to the right shore successfully!");
    }

    // This function prints the state of each variable at the moment
    // and updates the success flag if any rules are broken
    public static boolean printState(int farmer, int wolf, int goat, int cabbage, String action, boolean success) {
        System.out.println("----------------------------");
        System.out.println(action);
        System.out.println("Farmer: " + (farmer == 0 ? "left shore" : "right shore"));
        System.out.println("Wolf: " + (wolf == 0 ? "left shore" : "right shore"));
        System.out.println("Goat: " + (goat == 0 ? "left shore" : "right shore"));
        System.out.println("Cabbage: " + (cabbage == 0 ? "left shore" : "right shore"));

        // Checking rules
        if (wolf == goat && farmer != goat) {
            System.out.println("Oh, no! The wolf ate the goat!");
            success = false;
        }
        if (goat == cabbage && farmer != goat) {
            System.out.println("Oh, no! The goat ate the cabbage!");
            success = false;
        }

        return success;
    }
}