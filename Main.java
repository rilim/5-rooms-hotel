package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Stores history of guests in hotel rooms
        ArrayList <String> roomOneGuests = new ArrayList<>();
        ArrayList <String> roomTwoGuests = new ArrayList<>();
        ArrayList <String> roomThreeGuests = new ArrayList<>();
        ArrayList <String> roomFourGuests = new ArrayList<>();
        ArrayList <String> roomFiveGuests = new ArrayList<>();

        //State of hotel rooms (by default they are set to: "not occupied")
        boolean isRoomOneOccupied = false;
        boolean isRoomTwoOccupied = false;
        boolean isRoomThreeOccupied = false;
        boolean isRoomFourOccupied = false;
        boolean isRoomFiveOccupied = false;

        int yourChoice = 0; //Stores user input of main program choice from 1 to 5

        //Program works while the user doesn't enter 5 to stop it
        while (!(yourChoice == 5)) {

            System.out.println( "\n" + "1: Svečio registracija");
            System.out.println("2: Svečio išregistravimas");
            System.out.println("3: Kambarių užimtumo peržiūra");
            System.out.println("4: Kambario istorija ir statusas");
            System.out.println("5: Užbaigti programą" + "\n");

            yourChoice = userInputCheck(); //Stores user's input that has been checked in userInputCheck function

            switch (yourChoice){
                case 1: // Guests check-in
                    if(!isRoomOneOccupied){
                        System.out.println("Kambarys nr. 1 laisvas.");
                        String guestFullName = enterGuestName(); //Stores user's entered guest's full name
                        roomOneGuests.add(guestFullName); //Stores guest's full name to this room's list of guests
                        isRoomOneOccupied = true;
                        System.out.println("Gero poilsio, " + guestFullName);
                        break;
                    } else if (!isRoomTwoOccupied){
                        System.out.println("Kambarys nr. 2 laisvas.");
                        String guestFullName = enterGuestName();
                        roomTwoGuests.add(guestFullName);
                        isRoomTwoOccupied = true;
                        System.out.println("Gero poilsio, " + guestFullName);
                        break;
                    } else if (!isRoomThreeOccupied){
                        System.out.println("Kambarys nr. 3 laisvas.");
                        String guestFullName = enterGuestName();
                        roomThreeGuests.add(guestFullName);
                        isRoomThreeOccupied = true;
                        System.out.println("Gero poilsio, " + guestFullName);
                        break;
                    } else if (!isRoomFourOccupied){
                        System.out.println("Kambarys nr. 4 laisvas.");
                        String guestFullName = enterGuestName();
                        roomFourGuests.add(guestFullName);
                        isRoomFourOccupied = true;
                        System.out.println("Gero poilsio, " + guestFullName);
                        break;
                    } else if (!isRoomFiveOccupied){
                        System.out.println("Kambarys nr. 5 laisvas.");
                        String guestFullName = enterGuestName();
                        roomFiveGuests.add(guestFullName);
                        isRoomFiveOccupied = true;
                        System.out.println("Gero poilsio, " + guestFullName);
                        break;
                    } else {
                        System.out.println("Atsiprašome, visi kambariai užimti");
                        break;
                    }


                case 2: // Guest check out
                    System.out.println("Įveskite kambario numerį, kurį norite atlaisvinti");

                    int roomCheckOutChoice = userInputCheck(); //Stores user's input that has been checked in userInputCheck function

                    switch (roomCheckOutChoice){ //Checks out room of your choice
                        case 1:
                            if (isRoomOneOccupied){
                                isRoomOneOccupied = false;
                                System.out.println("Kambarys nr. 1 atlaisvintas. Laukiamas naujas svečias");
                            } else {
                                System.out.println("Kambarys nr. 1 ir taip laisvas");
                            }
                            break;
                        case 2:
                            if (isRoomTwoOccupied){
                                isRoomTwoOccupied = false;
                                System.out.println("Kambarys nr. 2 atlaisvintas. Laukiamas naujas svečias");
                            } else {
                                System.out.println("Kambarys nr. 2 ir taip laisvas");
                            }
                            break;
                        case 3:
                            if (isRoomThreeOccupied){
                                isRoomThreeOccupied = false;
                                System.out.println("Kambarys nr. 3 atlaisvintas. Laukiamas naujas svečias");
                            } else {
                                System.out.println("Kambarys nr. 3 ir taip laisvas");
                            }
                            break;
                        case 4:
                            if (isRoomFourOccupied){
                                isRoomFourOccupied = false;
                                System.out.println("Kambarys nr. 4 atlaisvintas. Laukiamas naujas svečias");
                            } else {
                                System.out.println("Kambarys nr. 4 ir taip laisvas");
                            }
                            break;
                        case 5:
                            if (isRoomFiveOccupied){
                                isRoomFiveOccupied = false;
                                System.out.println("Kambarys nr. 5 atlaisvintas. Laukiamas naujas svečias");
                            } else {
                                System.out.println("Kambarys nr. 5 ir taip laisvas");
                            }
                            break;
                        default:
                            System.out.println("Tokio kambario nėra. Įveskite nuo 1 iki 5");
                            break;
                    }


                case 3: // Rooms status
                    if (isRoomOneOccupied){
                        String lastGuest = roomOneGuests.get(roomOneGuests.size() - 1); //Checks who is the last guest in this room
                        System.out.println("Kambarys nr. 1 yra užimtas, jame gyvena: " + lastGuest);
                    }
                    if (isRoomTwoOccupied){
                        String lastGuest = roomTwoGuests.get(roomTwoGuests.size() - 1);
                        System.out.println("Kambarys nr. 2 yra užimtas, jame gyvena: " + lastGuest);
                    }
                    if (isRoomThreeOccupied){
                        String lastGuest = roomThreeGuests.get(roomThreeGuests.size() - 1);
                        System.out.println("Kambarys nr. 3 yra užimtas, jame gyvena: " + lastGuest);
                    }
                    if (isRoomFourOccupied){
                        String lastGuest = roomFourGuests.get(roomFourGuests.size() - 1);
                        System.out.println("Kambarys nr. 4 yra užimtas, jame gyvena: " + lastGuest);
                    }
                    if (isRoomFiveOccupied){
                        String lastGuest = roomFiveGuests.get(roomFiveGuests.size() - 1);
                        System.out.println("Kambarys nr. 5 yra užimtas, jame gyvena: " + lastGuest);
                    }
                    if (!isRoomOneOccupied && !isRoomTwoOccupied && !isRoomThreeOccupied && !isRoomFourOccupied && !isRoomFiveOccupied){
                        System.out.println("Visi kambariai laisvi");
                    }
                    break;


                case 4: // Rooms history
                    System.out.println("Įveskite kambario numerį, kurio istoriją norite pamatyti");

                    int roomHistory = userInputCheck();

                    switch (roomHistory){ //Shows room's history of your choice
                        case 1:
                            System.out.println("Šio kambario svečiai:");
                            for (String item : roomOneGuests) { //Prints the full list of guests of this room
                                System.out.println(item);
                            }

                            if (isRoomOneOccupied){ //Checks if this room is occupied
                                System.out.println("Šiuo metu kambarys nr. 1 yra užimtas");
                            } else {
                                System.out.println("Šiuo metu kambarys nr. 1 yra laisvas");
                            }
                            break;
                        case 2:
                            System.out.println("Šio kambario svečiai:");
                            for (String item : roomTwoGuests) {
                                System.out.println(item);
                            }

                            if (isRoomTwoOccupied){
                                System.out.println("Šiuo metu kambarys nr. 2 yra užimtas");
                            } else {
                                System.out.println("Šiuo metu kambarys nr. 2 yra laisvas");
                            }
                            break;
                        case 3:
                            System.out.println("Šio kambario svečiai:");
                            for (String item : roomThreeGuests) {
                                System.out.println(item);
                            }

                            if (isRoomThreeOccupied){
                                System.out.println("Šiuo metu kambarys nr. 3 yra užimtas");
                            } else {
                                System.out.println("Šiuo metu kambarys nr. 3 yra laisvas");
                            }
                            break;
                        case 4:
                            System.out.println("Šio kambario svečiai:");
                            for (String item : roomFourGuests) {
                                System.out.println(item);
                            }

                            if (isRoomFourOccupied){
                                System.out.println("Šiuo metu kambarys nr. 4 yra užimtas");
                            } else {
                                System.out.println("Šiuo metu kambarys nr. 4 yra laisvas");
                            }
                            break;
                        case 5:
                            System.out.println("Šio kambario svečiai:");
                            for (String item : roomFiveGuests) {
                                System.out.println(item);
                            }

                            if (isRoomFiveOccupied){
                                System.out.println("Šiuo metu kambarys nr. 5 yra užimtas");
                            } else {
                                System.out.println("Šiuo metu kambarys nr. 5 yra laisvas");
                            }
                            break;
                        default:
                            System.out.println("Tokio kambario nėra. Įveskite nuo 1 iki 5");
                            break;
                    }

                case 5:
                    break;

                default:
                    System.out.println("Tokio pasirinkimo nėra. Įveskite nuo 1 iki 5");
                    break;
            }


        }


        System.out.println("Programa uždaryta.");


    }


    /**
     * This function prompts user to enter guest's first and last name
     *
     * @return guest's full name (String)
     */
    public static String enterGuestName(){
        Scanner inputGuestName = new Scanner(System.in);
        System.out.println("Registracijai įveskite vardą: ");
        String guestName = inputGuestName.next();
        System.out.println("Įveskite pavardę: ");
        String guestLastName = inputGuestName.next();
        String guestFullName = guestName + " " + guestLastName;
        return guestFullName;
    }

    /**
     *This function checks if the user has entered number as the program asks.
     * If not, then he is prompted to write again
     *
     * @return user's right input (an int)
     */
    public static int userInputCheck(){
        Scanner input = new Scanner(System.in);
        int rightInput = 0;
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                rightInput = input.nextInt();
                return rightInput;
            } else {
                System.out.println("Veskite tik skaicius nuo 1 iki 5!");
                input.next();
            }
        }
        input.close();
        return rightInput;
    }


}
