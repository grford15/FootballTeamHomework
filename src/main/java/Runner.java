import db.DBCompetition;
import db.DBHelper;
import models.*;

public class Runner {

    public static void main(String[] args) {
        Competition spl = new Competition("Scottish Premier League");
        DBHelper.save(spl);

        Manager gerrard = new Manager("Steven Gerrard", 38);
        DBHelper.save(gerrard);

        Team rangers = new Team("Rangers", gerrard);
        DBHelper.save(rangers);

        Player morelos = new Player("Alfredo Morelos", 24, gerrard, Position.STRIKER, rangers);
        DBHelper.save(morelos);

//        DBCompetition.addTeamToCompetition(spl, rangers);
    }
}
