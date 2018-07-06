package db;

import models.Competition;
import models.Team;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBCompetition {

    private static Session session;
    private static Transaction transaction;

    public static void addTeamToCompetition(Competition competition, Team team){
        competition.addTeam(team);
        team.addCompetitions(competition);
        DBHelper.update(competition);
    }
}
