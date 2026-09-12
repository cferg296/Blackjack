import java.util.ArrayList;
public class cards{
    static String[] cardNums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static String[] suits = {"S", "H", "D", "C"};
    public static ArrayList<String> buildDeck(){
        ArrayList<String> deck = new ArrayList<String>();
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 13; k++){
                    deck.add(String.format("%s%s", cardNums[k], suits[j]));
                }
            }
        }
        return deck;
    }
    public static ArrayList<String> shuffle(){
        ArrayList<String> deck = buildDeck();
        for(int i = 0; i < deck.size(); i++){
            int random = (int)(Math.random() * deck.size());
            String temp = deck.get(i);
            deck.set(i, deck.get(random));
            deck.set(random, temp);
        }
        return deck;
    }
}
