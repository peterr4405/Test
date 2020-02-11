package Hacker;

import java.util.Arrays;

public class HashTables_Ransom_Note {

    static void checkMagazine(String[] magazine, String[] note) {

        for (int i = 0; i < note.length; i++) {
            for (int j = 0; j < magazine.length; j++) {
                if (note[i].equals(magazine[j])) {
                    magazine[j] = "";
                    break;
                } else if (j == (magazine.length - 1) && note[i] != magazine[j]) {
                    System.out.println("No");
                    return;
                }

            }

        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {

        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};

        checkMagazine(magazine, note);

    }

}
