package oops.dateAndTime;

import java.awt.event.WindowStateListener;
import java.time.*;

public class DateAndTime {
  public static void main(String[] args) {
    DateAndTime.doZoneId();
  }

  public static void doDateAndTime() {
    LocalDate localDate = LocalDate.now();
    int dateOfMonth = localDate.getDayOfMonth();
    Month month = localDate.getMonth();
    int year = localDate.getYear();
    System.out.println(year);
    System.out.println(month);
    System.out.println(dateOfMonth);
    System.out.println(localDate);
  }
  public static void doZoneId() {

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println(zonedDateTime);
    Instant instant = Instant.now();
    System.out.println(instant);


  }

}
