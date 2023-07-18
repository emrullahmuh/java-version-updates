package org.example.Employe;

import java.util.List;

public class empTest {
    public static void main(String[] args) {
        //print all emails
        empData.readAll().map(Employe::getEmpemail)
                .forEach(System.out::println);

//PRINT ALL PHONE NUMBERS
/*empData.readAll().map(Employe::getEmpphoneNumber)
        .forEach(System.out::println);
*/
     empData.readAll()
             .flatMap(employe ->employe.getEmpphoneNumber().stream() )
             .forEach(System.out::println);

     //print all phone number with double colon
empData.readAll()
        .map(Employe::getEmpphoneNumber)
        .flatMap(List::stream)
        .forEach(System.out::println);




    }
}
