package models;

import javax.persistence.*;

@Entity
@Table(name="players")
public class Player extends ClubStaff {

    private Manager manager;
    private Position position;
    private Team team;

    public Player(){}

    public Player(String name, int age, Manager manager, Position position, Team team) {
        super(name, age);
        this.manager = manager;
        this.position = position;
        this.team = team;
    }

    @ManyToOne
    @JoinColumn(name="manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Enumerated(value = EnumType.STRING)
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @ManyToOne
    @JoinColumn(name="team_id", nullable = false)

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
