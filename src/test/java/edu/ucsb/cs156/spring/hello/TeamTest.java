package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }


    
    @Test
    public void equals_returns_correct_value() {
        Team same_team, diff_team_name, diff_team_member;
        int num = 0;

        same_team = new Team("test-team");

        diff_team_name = new Team("diff-team");

        diff_team_member = new Team("test-team");
        diff_team_member.addMember("member");

        assert(team.equals(same_team)==true);
        assert(team.equals(team)==true);
        assert(team.equals(diff_team_member)==false);
        assert(team.equals(diff_team_name)==false);
        assert(team.equals(num)==false);
        
    }
     @Test
     public void hash_code_is_equal() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
     }

    @Test
    public void hash_test() {
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
     


}
