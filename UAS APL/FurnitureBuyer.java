public class FurnitureBuyer implements MebelBuyer {
   FurnitureAdapater furnitureAdapater;

   @Override
   public void buy(String tipemebel, String namaFurniture) {

      // furnitureAdapater sebagai provider untuk file format
      if (tipemebel.equalsIgnoreCase("Meja") || tipemebel.equalsIgnoreCase("Kursi")) {
         furnitureAdapater = new FurnitureAdapater(tipemebel);
         furnitureAdapater.buy(tipemebel, namaFurniture);
      }
   }
}