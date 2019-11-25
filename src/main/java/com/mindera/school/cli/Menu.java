package com.mindera.school.cli;

import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private LinkedList<Option> options = new LinkedList<>();
    private Option exitOption;

    public void add(Option option) {
        options.add(option);
    }

    public void add(Option option, boolean exit) {
        if (exit) {
            exitOption = option;
            options.add(exitOption);
        } else {
            options.add(option);
        }
    }

    public void render() {
        int index;
        do {
            for (int i = 0; i < options.size(); i++) {
                System.out.println(printOption(i));
            }
            index = sc.nextInt();
            options.get(index).execute();
        } while (options.get(index) != exitOption);
    }

    private String printOption(int index) {
        return index + " - " + options.get(index).getText();
    }
}

