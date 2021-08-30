package Day5;


public class Pen {
		
		private int capLength;
		private String brand;
		private Refill r;
		
		public int getCapLength() {
			return capLength;
		}

		public void setCapLength(int capLength) {
			this.capLength = capLength;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public Refill getR() {
			return r;
		}

		public void setR(Refill r) {
			this.r = r;
		}



	public static void main(String[] args) {
		Pen p=new Pen();
		p.setCapLength(3);
		p.setBrand("bally");
		p.setR(new Refill());
		
		Refill re=new Refill();
		re.setInkColor("Blue");
		re.setLength(4);
		re.setN(new Nib());
		
		Nib ni=new Nib();
		ni.setMaterialType("abc");
		ni.setWidth(5);
		
		System.out.println("Pen Brand:"+p.getBrand()+"\nCap Length:"+p.getCapLength()+"\nRefill ink color:"+re.getInkColor()+"\nRefill length:"+re.getLength()+"\nNib material type:"+ni.getMaterialType()+"\nNib width:"+ni.getWidth());
		
	}

}
class Refill
{
	private String inkColor;
	private int length;
	private Nib n;
	
	public String getInkColor() {
		return inkColor;
	}
	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Nib getN() {
		return n;
	}
	public void setN(Nib n) {
		this.n = n;
	}
	
}
class Nib
{
	String materialType;
	int width;
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
