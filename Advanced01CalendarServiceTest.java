package org.bcit.midterm.questions;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.ArrayList;
public class Advanced01CalendarServiceTest {


    public static void main(String[] args) {

      //Get the Singleton instance from the calendar service class
      Advanced01CalendarService calendarService1 = Advanced01CalendarService.getInstance();
      Advanced01CalendarService calendarService2 = Advanced01CalendarService.getInstance();

      //Test the Singleton pattern
      assert calendarService1 == calendarService2;

      //Test the scheduleAppointment and getAppointments method
      LocalDateTime appointmentTime1 = LocalDateTime.of(2023, 4, 1, 10, 0);
      LocalDateTime appointmentTime2 = LocalDateTime.of(2023, 4, 2, 14, 0);
      LocalDateTime reminderTime1 = LocalDateTime.of(2023, 4, 1, 9, 30);
      LocalDateTime reminderTime2 = LocalDateTime.of(2023, 4, 2, 13, 30);

      //Create lists of participants
      ArrayList<String> participants1 = new ArrayList<>(Arrays.asList("Jackie", "Bardia"));
      ArrayList<String> participants2 = new ArrayList<>(Arrays.asList("Zay", "Doug"));

      //Schedule appointments
      calendarService1.scheduleAppointment("Meeting with Jackie and Bardia", appointmentTime1, participants1);
      calendarService1.scheduleAppointment("Meeting with Zay and Doug", appointmentTime2, participants2);

      //Get the arraylist of appointments and test
      ArrayList<Advanced01Appointment> appointments = calendarService1.getAppointments();
      assert appointments.size() == 2;
      assert appointments.get(0).getDetails().equals("Meeting with Jackie and Bardia");
      assert appointments.get(0).getDateTime().equals(appointmentTime1);
      assert appointments.get(0).getParticipants().equals(participants1);

      //Test the set reminder and get reminder methods
      //Set two reminders
      calendarService1.setReminder("Reminder for the meeting with Jackie and Bardia", reminderTime1);
      calendarService1.setReminder("Reminder for the meeting with Zay and Doug", reminderTime2);


      //Get the arraylist of reminders and test
      ArrayList<Advanced01Reminder> reminders = calendarService1.getReminders();
      assert reminders.size() == 2;
      assert reminders.get(0).getMessage().equals("Reminder for the meeting with Jackie and Bardia");
      assert reminders.get(0).getDateTime().equals(reminderTime1);
      assert reminders.get(1).getMessage().equals("Reminder for the meeting with Zay and Doug");
      assert reminders.get(1).getDateTime().equals(reminderTime2);

      //Test the cancel appointment method
      //Cancel the first appointment made
      Advanced01Appointment appointmentToCancel = appointments.get(0);
      calendarService1.cancelAppointment(appointmentToCancel);



      //Get the updated arraylist of appointments and test
      appointments = calendarService1.getAppointments();
      assert appointments.size() == 1;
      assert appointments.get(0).getDetails().equals("Reminder for the meeting with Zay and Doug");
      assert appointments.get(0).getDateTime().equals(appointmentTime2);
      assert appointments.get(0).getParticipants().equals(participants2);

      System.out.println("Tests passed");
    }

}
