public class Steam {
    int totalCash = 0;
    void Game() {
        Game[] play = new Game[10];
        int i = 0;
        play[i] = new Game();
            play[i].name = "Dota 2";
            play[i].cost = 5;
            play[i].ageLimit = 8;
            i++;

        play[i] = new Game();
            play[i].name = "CS GO";
            play[i].cost = 10;
            play[i].ageLimit = 12;
            i++;

        play[i] = new Game();
            play[i].name = "Breathedge";
            play[i].cost = 3;
            play[i].ageLimit = 13;
            i++;

        play[i] = new Game();
            play[i].name = "GTA 5";
            play[i].cost = 25;
            play[i].ageLimit = 18;
            i++;

        play[i] = new Game();
            play[i].name = "Metro";
            play[i].cost = 9;
            play[i].ageLimit = 16;
            i++;

        play[i] = new Game();
            play[i].name = "World of tanks";
            play[i].cost = 0;
            play[i].ageLimit = 6;
            i++;

        play[i] = new Game();
            play[i].name = "Street Fighter";
            play[i].cost = 7;
            play[i].ageLimit = 14;
            i++;

        play[i] = new Game();
            play[i].name = "Doki Doki Literature Club" ;
            play[i].cost = 0;
            play[i].ageLimit = 16;
            i++;

        play[i] = new Game();
            play[i].name = "FallOut 4";
            play[i].cost = 15;
            play[i].ageLimit = 14;
            i++;

        play[i] = new Game();
            play[i].name = "Civilization 5";
            play[i].cost = 15;
            play[i].ageLimit = 8;
    }
    void Sell (){
        Gamer pleyer = new Gamer();
        Game();
        pleyer.cash = pleyer.cash - ;
    }
}