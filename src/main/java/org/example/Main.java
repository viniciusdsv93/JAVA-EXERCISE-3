package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("How many rooms will be rented? ");
    int totalRooms = sc.nextInt();
    System.out.println();

    Rent[] rooms = new Rent[10];

    for (int i = 1; i <= totalRooms; i++) {
      sc.nextLine();
      System.out.println("Rent #" + i + ":");
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Email: ");
      String email = sc.nextLine();
      System.out.print("Room: ");
      int roomId = sc.nextInt();
      rooms[roomId] = new Rent(name, email);
      System.out.println();
    }

    System.out.println("Busy rooms:");
    for (int i = 1; i < rooms.length; i++) {
      if (rooms[i] != null) {
        System.out.printf("%d: %s%n", i, rooms[i]);
      }
    }
  }
}