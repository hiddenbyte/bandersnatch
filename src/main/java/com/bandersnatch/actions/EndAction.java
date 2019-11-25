package com.bandersnatch.actions;

import com.mindera.school.cli.Action;

class EndAction implements Action {

    @Override
    public void execute() {
        System.exit(0);
    }
}
