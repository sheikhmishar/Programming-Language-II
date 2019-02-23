public final class perfumeTest{
	public static void main(String[] args){
		Perfume p1 = new Perfume("Dolce & Gabbana", "Light Blue");
		Perfume p2 = new Perfume("Versace", "Bright Crystal");
        Perfume p3 = new Perfume("Elizabeth Arden", "Dumb white");
        Perfume p4 = new Perfume("Tibet", "Regular");
        Perfume p5 = new Perfume("Pagla", "Chagla");
		PerfumeCollection c1 = new PerfumeCollection(p1);
		PerfumeCollection c2 = new PerfumeCollection(c1);
		System.out.println("-------------------------------------");
		System.out.println(c1.printItems());
		//System.out.println();
		//System.out.println(c1.getName());
		System.out.println("-------------------------------------");
		System.out.println(c2.printItems());
		System.out.println("-------------------------------------");
		c1.addItem(p2);
        c1.addItem(p3);
        c1.addItem(p4);
        c1.addItem(p5);
		System.out.println(c1.printItems());
	}
}
class Perfume{
	private String brand;
	private String name;
	Perfume(){
		brand = null;
		name = null;
	}
	Perfume(String a, String b){
		brand = a;
		name = b;
	}
	public final String getBrand(){
		return brand;
	}
	public final String getName(){
		return name;
	}
}
class PerfumeCollection extends Perfume{
	Perfume collection[] = new Perfume[1];
	
	PerfumeCollection(PerfumeCollection a){
		super(a.getBrand(), a.getName());
		collection[0] = a;
		//collection[0] = this;
	}
	PerfumeCollection(Perfume a){
		super(a.getBrand(), a.getName());
		collection[0] = a;
		//collection[0] = this;
	}
	
	private int count = 1;
	public final void addItem(Perfume ob){
		Perfume temp[] = new Perfume[count+1];
		temp[count] = ob;
		for(int i = 0; i < count; i++)
			temp[i] = collection[i];
		collection = temp;
		count++;
	}
	public final String printItems(){
		String tmp = "";
		for(int i = 0; i < this.count; i++){
			tmp += "Brand: " + collection[i].getBrand() + ",\t\t\t\tName: " + collection[i].getName();
			if(i != this.count-1)
				tmp += "\n";
		}
		return tmp;
	}
}
