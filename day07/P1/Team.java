package day07.P1;

import java.sql.Array;
import java.util.ArrayList;

public class Team {
    ArrayList<Player> players = new ArrayList<>();
    String name;
    int goals;

    Team(ArrayList<Player> players){
        for(Player p : players){
            this.players.add(p);
        }
    }
    Team(){
    }

    void addPlayer(Player p){
        players.add(p);
    }

    void showList(){
        System.out.printf("[%s] 선수 명단\n", name);
        for (Player p: players){
            p.info();
        }
    }

    void goals(){
        goals=0;
        for (Player p:players){
            goals += p.goals;
        }
    }
}
