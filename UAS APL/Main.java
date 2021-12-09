import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      System.out.println("Selamat Datang di Toko Furniture Serba Ada \n");

      System.out.println(">>>>>>>> Pilih Furniture Yang Ingin di Beli <<<<<<<<");
      System.out.println("- Kursi");
      System.out.println("- Meja");
      Scanner in = new Scanner(System.in);
      System.out.print("\nPilih Furniture : ");
      String mebel = in.next();
      System.out.println("Furniture yang dipilih : " + mebel);

      FurnitureBuyer furnitureBuyer = new FurnitureBuyer();
      Buyer f = null;
      f = new Buyer();

      if ("Kursi".equalsIgnoreCase(mebel)) {
         f.setBuyMethod(new Kursi());
         f.BuyFurniture();
         furnitureBuyer.buy("Kursi", "Kursi Makan");

      } else if ("Meja".equalsIgnoreCase(mebel)) {
         f.setBuyMethod(new Meja());
         f.BuyFurniture();
         furnitureBuyer.buy("Meja", "Meja Makan");
      }
   }
}