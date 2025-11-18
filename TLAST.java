//Benny Tampubolon - 12S25044
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totDat;
        String command;
        String[] desk = new String[10], cde = new String[10], matkul = new String[10], dosen = new String[10], deadln = new String[10], ketID = new String[10], grade = new String[10], hari = new String[10], stts = new String[10], prioritas = new String[10];

        totDat = 0;
        while (!command.equals("---")) {
            command = input.nextLine();
            if (command.equals("AddTask")) {
                AddTask();
            }
        }
    }
}


