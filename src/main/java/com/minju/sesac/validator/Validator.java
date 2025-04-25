package com.minju.sesac.validator;

import com.minju.sesac.exceptions.MenuSelectionException;
import com.minju.sesac.exceptions.NotPositiveNumberException;
import com.minju.sesac.exceptions.RemoveNumberOutOfRangeException;

public class Validator {
    public static void validateMenuSelection(String input) {
        if (!input.matches("[1-4]")) {
            throw new MenuSelectionException("메뉴는 1~4 중 하나만 입력해야 합니다.");
        }
    }

    public static void validatePositiveNumber(String input) {
        if (!input.matches("[1-9]+")) {
            throw new NotPositiveNumberException("1 이상의 숫자만 입력할 수 있습니다.");
        }
    }

    public static void validateRemoveNumberInRange(int toDoCnt, String input) {
        int no = Integer.parseInt(input);
        if (no <= 0 || no > toDoCnt) {
            throw new RemoveNumberOutOfRangeException("To Do List 번호를 잘 확인하고 입력해주세요.");
        }
    }
}
