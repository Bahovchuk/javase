public class Steam {
    int totalCash = 0;
    Game[] play = new Game[10];
    {
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
        play[i].cost = 30;
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
        play[i].name = "Doki Doki Literature Club";
        play[i].cost = 0;
        play[i].ageLimit = 18;
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

    void Sell(int b) {
        Gamer player = new Gamer();
            if (player.age >= play[b].ageLimit && player.cash >= play[b].cost) {
                player.buy(play[b].cost);
                totalCash = totalCash + play[b].cost;
                System.out.println("Вы совершили покупку игры : " + play[b].name + "\nОстаток на вашем счету : " + player.cash + "\nСумма денег на счету Steam : " + totalCash + "\n ");
            } else {

                try {
                    if (player.age < play[b].ageLimit){
                        throw new Exception("Ваш возраст не подходит требуемым критериям\n");
                    }
                } catch (Exception ex){
                    System.out.println(ex.getMessage());
                }

                try {
                    if (player.cash < play[b].cost){
                        throw new Exception("У вас недостаточно средств для совершения покупки\n");
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
    }
}