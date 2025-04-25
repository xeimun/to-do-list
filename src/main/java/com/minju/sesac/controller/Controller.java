package com.minju.sesac.controller;

import com.minju.sesac.exceptions.MenuSelectionException;
import com.minju.sesac.exceptions.NotPositiveNumberException;
import com.minju.sesac.exceptions.RemoveNumberOutOfRangeException;
import com.minju.sesac.model.ToDo;
import com.minju.sesac.view.InputView;
import com.minju.sesac.view.OutputView;

public class Controller {
    private final ToDo toDoManager = new ToDo();

    private boolean isEnd = false;

    public void run() {
        while (!isEnd) {
            try {
                OutputView.printMenuPrompt();
                int firstNo = InputView.readMenuSelection();

                if (firstNo == 1) {
                    OutputView.printToDoInputPrompt();
                    String toDo = InputView.readToDoContent();
                    toDoManager.addToDo(toDo);
                    OutputView.printToDoAddedMessage();
                }
                if (firstNo == 2) {
                    OutputView.printToDoRemovePrompt();
                    int toDoCnt = toDoManager.getToDoList()
                                             .size();
                    int removeNo = InputView.readRemoveToDoNumber(toDoCnt);
                    toDoManager.removeToDo(removeNo);
                    OutputView.printToDoRemovedPrompt();
                }
                if (firstNo == 3) {
                    OutputView.printDashLine();
                    toDoManager.showToDoList();
                    OutputView.printDashLine();
                }
                if (firstNo == 4) {
                    InputView.closeScanner();
                    OutputView.printProgramExitPrompt();
                    isEnd = true;
                }
            } catch (MenuSelectionException e) {
                OutputView.printMenuInputError(e);
                OutputView.printRetryPrompt();
            } catch (NotPositiveNumberException e) {
                OutputView.printNumberInputError(e);
                OutputView.printRetryPrompt();
            } catch (RemoveNumberOutOfRangeException e) {
                OutputView.printRemoveNumberInputError(e);
                OutputView.printRetryPrompt();
            } catch (Exception e) {
                OutputView.printUnexpectedError();
                OutputView.printRetryPrompt();
            }
        }
    }
}
