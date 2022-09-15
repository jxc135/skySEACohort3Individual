public class deck {

    private card[] deckOfCards;

    public deck(){
        this.deckOfCards = new card[52];
    }

    public void fillDeckOfCards(){
        int totalFilled = 0;
        for(suit singleSuit : suit.values()){
            for(rank singleRank: rank.values()){
                this.deckOfCards[totalFilled] = new card(singleSuit,singleRank);
                totalFilled++;
            }
            totalFilled++;
        }
    }
}
