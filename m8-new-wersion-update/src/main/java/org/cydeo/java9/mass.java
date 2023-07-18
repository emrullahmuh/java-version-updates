package org.cydeo.java9;

import java.time.LocalDate;

public class mass implements privateMethodInterface{
    @Override
    public boolean isHolyDay(LocalDate date) {
        return false;
    }

    @Override
    public boolean isBusinessDay(LocalDate date) {
        return privateMethodInterface.super.isBusinessDay(date);
    }

    @Override
    public LocalDate nextDay(LocalDate date) {
        return privateMethodInterface.super.nextDay(date);
    }
}
