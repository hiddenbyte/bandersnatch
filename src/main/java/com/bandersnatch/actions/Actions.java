package com.bandersnatch.actions;


import com.mindera.school.cli.Action;

class Actions {

    private static final Action END_ACTION = new EndAction();

    private static final Action ON_THE_BUS = new QuestionAction(
            "You are on bus on the way to the school",
            new String[] { "Play Thomson Twins on my Walkman", "Play Now2 on my Walkman" },
            new Action[] {  END_ACTION, END_ACTION }
    );

    static final Action BREAKFAST = new QuestionAction(
            "You've just woke up and having your breakfast",
            new String[] { "Eat Frosties", "Eat Sugar Puffs" },
            new Action[] {  ON_THE_BUS, ON_THE_BUS}
    );

    private Actions() { }
}
