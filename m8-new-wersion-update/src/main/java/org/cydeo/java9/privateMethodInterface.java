package org.cydeo.java9;

import java.time.LocalDate;

public interface privateMethodInterface {
    //private method is only availeble inside the interface and dont need to implement to other classes or inheritent
boolean isHolyDay(LocalDate date);
default boolean isBusinessDay(LocalDate date){//didnt used method
    if (date.isBefore(LocalDate.of(2001,01,01))){
        throw new IllegalArgumentException();
    }

return !isHolyDay(date);
}

default LocalDate nextDay(LocalDate date){
    valiDate(date);// used method

   LocalDate nextdate=date.plusDays(1);
    return isHolyDay(nextdate)?nextDay(nextdate):nextdate;
}
private void valiDate(LocalDate date){//this can useing for many tima and only can use inside this class
    if (date.isBefore(LocalDate.of(2001,01,01))){
        throw new IllegalArgumentException();
    }
}

}
