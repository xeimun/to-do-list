package com.minju.sesac.model;

import java.util.ArrayList;
import java.util.List;

public class ToDo {
    private final List<String> toDoList;

    public ToDo() {
        toDoList = new ArrayList<>();
    }

    public List<String> getToDoList() {
        return toDoList;
    }

    public void addToDo(String Input) {
        toDoList.add(Input);
    }

    public void removeToDo(int no) {
        toDoList.remove(no - 1);
    }

    public void showToDoList() {
        if (toDoList.isEmpty()) {
            System.out.println("현재 To Do List는 비어있습니다.");
        }

        for (int i = 0; i < toDoList.size(); i++) {
            int no = i + 1;
            System.out.println(no + ". " + toDoList.get(i));
        }
    }
}
