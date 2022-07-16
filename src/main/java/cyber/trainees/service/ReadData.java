package cyber.trainees.service;

import java.util.Scanner;

public class ReadData {
    public String getDataReadFromKeyboard() {
        Scanner scanner = new Scanner(System.in); //System.in to jest obiekt typu InputStream
        return scanner.nextLine();
    }
}
