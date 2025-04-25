package com.minju.sesac.view;

public class OutputView {
    public static void printMenuPrompt() {
        System.out.println("\n어떤 작업을 하시겠습니까?");
        System.out.println("1. To Do List 입력");
        System.out.println("2. To Do List 제거");
        System.out.println("3, To Do List 출력");
        System.out.println("4. 프로그램 종료");
        System.out.println("번호(숫자)를 입력해주세요.");
    }

    public static void printToDoInputPrompt() {
        System.out.println("\n작업을 입력해주세요.");
    }

    public static void printToDoAddedMessage() {
        System.out.println("작업이 추가되었습니다.");
    }

    public static void printToDoRemovePrompt() {
        System.out.println("\n삭제할 작업의 번호를 입력해주세요. ex) 2");
    }

    public static void printToDoRemovedPrompt() {
        System.out.println("입력한 번호의 작업이 삭제되었습니다.");
    }

    public static void printDashLine() {
        System.out.println("----------------------");
    }

    public static void printProgramExitPrompt() {
        System.out.println("\n프로그램을 종료합니다.");
    }

    public static void printRetryPrompt() {
        System.out.println("다시 입력해주세요.");
    }

    public static void printMenuInputError(Exception e) {
        System.out.println("메뉴 입력 오류: " + e.getMessage());
    }

    public static void printNumberInputError(Exception e) {
        System.out.println("숫자 입력 오류: " + e.getMessage());
    }

    public static void printRemoveNumberInputError(Exception e) {
        System.out.println("삭제 번호 오류: " + e.getMessage());
    }

    public static void printUnexpectedError() {
        System.out.println("예상치 못한 오류가 발생했습니다.");
    }
}
