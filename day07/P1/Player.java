package day07.P1;

public class Player {
    String name;
    String team;
    int goals;
    int assists;

    Player(String name, String team, int goals){
        this.name = name;
        this.team = team;
        this.goals= goals;
        this.assists=0;
    }
    Player(String name, String team){
        this(name, team, 0);
    }
    Player( ){this("", "", 0);
    }

    void info(){
        System.out.printf("%s (%s) - %d골 %d도움\n", name, team, goals, assists);
    }

    void score(){
        goals += 1;
    }
    void score(int n_goal){
        goals += n_goal;
    }

    void assist(){
        assists += 1;
    }
    void assists(int n_assist){
        assists += n_assist;
    }


}
