package baseball;

public class Review03 {

    public static void main(String[] args) {
        //
        BaseBallTeam Team1 = new BaseBallTeam();
        Team1.setName("東京ヤクルトスワローズ");
        Team1.setWin(80);
        Team1.setLose(59);
        Team1.setDraw(4);

        BaseBallTeam Team2 = new BaseBallTeam();
        Team2.setName("横浜DeNAベイスターズ");
        Team2.setWin(73);
        Team2.setLose(68);
        Team2.setDraw(2);

        BaseBallTeam Team3 = new BaseBallTeam();
        Team3.setName("阪神タイガース");
        Team3.setWin(68);
        Team3.setLose(71);
        Team3.setDraw(4);

        BaseBallTeam Team4 = new BaseBallTeam();
        Team4.setName("読売ジャイアンツ");
        Team4.setWin(68);
        Team4.setLose(72);
        Team4.setDraw(3);

        BaseBallTeam Team5 = new BaseBallTeam();
        Team5.setName("広島東洋カープ");
        Team5.setWin(66);
        Team5.setLose(74);
        Team5.setDraw(3);

        BaseBallTeam Team6 = new BaseBallTeam();
        Team6.setName("中日ドラゴンズ");
        Team6.setWin(66);
        Team6.setLose(75);
        Team6.setDraw(2);

        Team1.report();
        Team2.report();
        Team3.report();
        Team4.report();
        Team5.report();
        Team6.report();
    }

}
