package ObjectData;

import java.util.HashMap;

public class GiftCardObject {
    private String Card;
    private String RecipientName;
    private String YourName;
    private String AddToCartCard;
    private GiftCardObject(HashMap<String, String> testdata){
        for(String Key:testdata.keySet()){
            switch (Key){
                case "Card":
                    setCard(testdata.get(Key));
                    break;
                case "RecipientName":
                    setRecipientName(testdata.get(Key));
                    break;
                case "YourName":
                    setYourName(testdata.get(Key));
                    break;
                case "AddToCartCard":
                    setAddToCartCard(testdata.get(Key));
                    break;

            }
        }
    }
    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }

    public String getRecipientName() {
        return RecipientName;
    }

    public void setRecipientName(String recipientName) {
        RecipientName = recipientName;
    }

    public String getYourName() {
        return YourName;
    }

    public void setYourName(String yourName) {
        YourName = yourName;
    }

    public String getAddToCartCard() {
        return AddToCartCard;
    }

    public void setAddToCartCard(String addToCartCard) {
        AddToCartCard = addToCartCard;
    }
}
