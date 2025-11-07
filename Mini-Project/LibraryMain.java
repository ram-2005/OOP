
import java.util.*;
import java.io.*;

class Book {
    String t;
    String a;
    boolean taken;

    Book(String t, String a) {
        this.t = t;
        this.a = a;
        this.taken = false;
    }
}

class Member {
    String n;
    int id;

    Member(String n, int id) {
        this.n = n;
        this.id = id;
    }
}

class InvalidReturnException extends Exception {
    InvalidReturnException(String s) {
        super(s);
    }
}

class Library {
    HashMap<Integer, Book> bks = new HashMap<>();
    HashMap<Integer, Member> mems = new HashMap<>();
    HashMap<Integer, Integer> iss = new HashMap<>();

    void addBk(int k, String t, String a) {
        bks.put(k, new Book(t, a));
        wrt("Added book: " + t);
    }

    void addMem(int id, String n) {
        mems.put(id, new Member(n, id));
        wrt("Added member: " + n);
    }

    void issueBk(int bid, int mid) {
        Book bk = bks.get(bid);
        if (bk != null && !bk.taken && mems.containsKey(mid)) {
            bk.taken = true;
            iss.put(bid, mid);
            wrt("Book issued: " + bk.t + " to " + mems.get(mid).n);
            System.out.println("Book issued.");
        } else {
            System.out.println("Cannot issue book.");
        }
    }

    void returnBk(int bid, int days) {
        Book bk = bks.get(bid);
        try {
            if (bk == null || !bk.taken) {
                throw new InvalidReturnException("Invalid book return!");
            } else {
                bk.taken = false;
                iss.remove(bid);
                double fee = calcFee(days);
                wrt("Book returned: " + bk.t + " Late fee: " + fee);
                System.out.println("Book returned. Fee: " + fee);
            }
        } catch (InvalidReturnException e) {
            System.out.println(e.getMessage());
            wrt("Error: " + e.getMessage());
        }
    }

    double calcFee(int d) {
        if (d <= 7) return 0;
        else return (d - 7) * 2.0;
    }

    void wrt(String s) {
        try {
            FileWriter f = new FileWriter("library_log.txt", true);
            f.write(s + "\n");
            f.close();
        } catch (IOException e) {
            System.out.println("Log error");
        }
    }

    void showAll() {
        System.out.println("--- Books ---");
        for (int i : bks.keySet()) {
            Book bk = bks.get(i);
            System.out.println(i + " | " + bk.t + " | " + bk.a + " | " + (bk.taken ? "Taken" : "Available"));
        }
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();
        int c = 0;
        while (c != 6) {
            System.out.println("\n1.Add Book\n2.Add Member\n3.Issue Book\n4.Return Book\n5.Show Books\n6.Exit");
            System.out.print("Enter: ");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Author: ");
                    String a = sc.nextLine();
                    l.addBk(id, t, a);
                    break;
                case 2:
                    System.out.print("Member ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String nm = sc.nextLine();
                    l.addMem(mid, nm);
                    break;
                case 3:
                    System.out.print("Book ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Member ID: ");
                    int memid = sc.nextInt();
                    l.issueBk(bid, memid);
                    break;
                case 4:
                    System.out.print("Book ID: ");
                    int rid = sc.nextInt();
                    System.out.print("Days kept: ");
                    int d = sc.nextInt();
                    l.returnBk(rid, d);
                    break;
                case 5:
                    l.showAll();
                    break;
                case 6:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Wrong option");
            }
        }
        sc.close();
    }
}
