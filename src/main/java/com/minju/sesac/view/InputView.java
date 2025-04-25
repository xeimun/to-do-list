package com.minju.sesac.view;

import com.minju.sesac.validator.Validator;
import java.util.Scanner;

public class InputView {
    private static final Scanner kb = new Scanner(System.in);

    public static int readMenuSelection() {
        String no = kb.nextLine();
        Validator.validateMenuSelection(no);
        return Integer.parseInt(no);
    }

    public static String readToDoContent() {
        return kb.nextLine();
    }

    public static int readRemoveToDoNumber(int toDoCnt) {
        String no = kb.nextLine();
        Validator.validatePositiveNumber(no);
        Validator.validateRemoveNumberInRange(toDoCnt, no);
        return Integer.parseInt(no);
    }

    public static void closeScanner() {
        kb.close();
    }
}
