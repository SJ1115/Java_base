package day07.H1;

public class Suspect {
    String name;
    String favoriteSnack;

    boolean hasAlibi;
    boolean nearScene;

    int suspicion=0;

    Suspect(String name,
            boolean hasAlibi,
            boolean nearScene,
            String favoriteSnack){
        this.name = name;
        this.hasAlibi = hasAlibi;
        this.nearScene = nearScene;
        this.favoriteSnack = favoriteSnack;
    }
    Suspect(){
        this.name = "";
        this.hasAlibi = false;
        this.nearScene = false;
        this.favoriteSnack = "";
    }

    void showEach(){
        System.out.printf("이름\t:%s\n" +
                "알리바이 : %b\n" +
                "현장근처 : %b\n" +
                "선호간식 : %s\n" +
                "의심점수 : %d\n",
                name, hasAlibi, nearScene, favoriteSnack, suspicion);
    }

    void showAtOne(){
        System.out.printf("%s (선호 : %s) 의심도 %d\n", name, favoriteSnack, suspicion);
    }

    void showBrief() {
        System.out.printf("  %s / %b / %d\n", name, hasAlibi, suspicion);
    }

    void suspicionScore(){
        if (! hasAlibi) suspicion += 2;

        if (nearScene) suspicion += 3;
    }


}

