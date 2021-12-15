package fr.iut.tdfm331.td1.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MeetingTest {

    List<Employee> l;
    Meeting m;
    Employee e1, e2, e3, e4;

    @Before
    public void setUp() {

        l = new ArrayList<>();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e4);
        m = new Meeting("Noel", "363", "20/12/2021", "15h00","16h00","Organisation du reps de noel", l);
        e1 = new Employee("Fertilati", "fertijulien@gmail.com",7);
        e2 = new Employee("Botto", "jessica@botto.fr",16);
        e3 = new Employee("Demont", "samueldemont83@gmail.com",26);
        e4 = new Employee("Bouchiba", "yazid.bouchiba@gmail.com",3);

    }

    @Test
    public void tearDown() {

        assertEquals(m.getDate(), "20/12/2021");
        assertEquals(m.getHourEnd(), "16h00");
        assertEquals(m.getMeetingRoom(), "363");
        assertEquals(m.getObjectMeeting(), "Noel");
        assertEquals(m.getHourStart(), "15h00");
        assertEquals(m.getInformation(), "Organisation du reps de noel");
        assertEquals(m.getListParticipants(), l);
    }
}