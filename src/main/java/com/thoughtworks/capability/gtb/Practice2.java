package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  private final static int DAYSOFWEEK = 7;

  public static LocalDate getNextWorkDate(LocalDate date) {
    int currentDayofWeek = date.getDayOfWeek().getValue();
    if (currentDayofWeek >= DayOfWeek.FRIDAY.getValue()) {
      date = date.plusDays(DAYSOFWEEK - currentDayofWeek);
    }
    return date.plusDays(1);
  }
}
