package ArrayOfObject;

public class Item {

		int itemID;
		String itemName;
		public String toString() {
			return "itemID=" + itemID + "\nitemName=" + itemName;
		}
		public Item(int itemID, String itemName) {
			this.itemID = itemID;
			this.itemName = itemName;
		}
		
}
