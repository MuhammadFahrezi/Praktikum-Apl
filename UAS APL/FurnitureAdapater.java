public class FurnitureAdapater implements MebelBuyer {

   Furniture furniture;

   public FurnitureAdapater(String tipemebel) {

      if (tipemebel.equalsIgnoreCase("Meja")) {
         furniture = new MejaMethod();

      } else if (tipemebel.equalsIgnoreCase("Kursi")) {
         furniture = new KursiMethod();
      }
   }

   @Override
   public void buy(String tipemebel, String namaFurniture) {

      if (tipemebel.equalsIgnoreCase("Meja")) {
         furniture.buyMeja(namaFurniture);
      } else if (tipemebel.equalsIgnoreCase("Kursi")) {
         furniture.buyKursi(namaFurniture);
      }
   }
}