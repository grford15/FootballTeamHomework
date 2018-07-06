package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="managers")
public class Manager extends ClubStaff{

    private Team team;
    private List<Player> players;

    public Manager(String steven_gerrard, int i){}

    public Manager(String name, int age, Team team) {
        super(name, age);
        this.team = team;
    }

    @OneToOne(mappedBy = "manager", fetch = FetchType.LAZY)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
