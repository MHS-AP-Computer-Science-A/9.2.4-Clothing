
public class ClothingTester {

	public static void main(String[] args) {
		TShirt ts = new TShirt("M", "Gray", "Cotton");
		Sweatshirt ss = new Sweatshirt("L", "Gold", true);
		Jeans j = new Jeans("S");
		
		System.out.println("T-Shirt: " + ts.getSize() + " " + ts.getColor() + " " + ts.getFabric());
		System.out.println("Sweatshirt: " + ss.getSize() + " " + ss.getColor() + " Has hood: " + ss.hasHood());
		System.out.println("Jeans: " + j.getSize() + " " + j.getColor());

	}

}
