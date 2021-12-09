public class Buyer {
    private BuyerMethod BuyerMethod;

    public void setBuyMethod(BuyerMethod buy) {
        this.BuyerMethod = buy;
    }

    public BuyerMethod getBuyMethod() {
        return BuyerMethod;
    }

    public void BuyFurniture() {
        BuyerMethod.BuyFurniture();
    }
}