package com.bandersnatch.actions;

import com.mindera.school.cli.Action;
import com.mindera.school.cli.Menu;
import com.mindera.school.cli.Option;

import java.util.Objects;
import java.util.stream.IntStream;

public class QuestionAction implements Action {

    private final Menu menu;
    private final String questionText;

    public QuestionAction(String questionText, String[] answersText, Action[] answersAction) {
        Objects.requireNonNull(questionText);
        Objects.requireNonNull(answersText);
        Objects.requireNonNull(answersAction);

        if (answersText.length != answersAction.length || answersText.length == 0) {
            throw new IllegalArgumentException();
        }

        this.questionText = questionText;
        this.menu = new Menu();

        IntStream.range(0, answersAction.length)
                .mapToObj(i ->  new Option(answersText[i], answersAction[i]))
                .forEach(this.menu::add);
    }

    @Override
    public void execute() {
        System.out.println();
        System.out.println(questionText);
        System.out.println();
        menu.render();
    }
}
