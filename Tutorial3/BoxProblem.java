import java.util.*;

class Box{
	private String parcel;
	private double length, width, height;

	Box(String name, double l, double w, double h){
		parcel = name;
		length = l;
		width = w;
		height = h;
	}

	public void volume_of_box(){
		System.out.println("Company name = "+ parcel);
		System.out.println("Volume of the Box = "+ (length*width*height));
		System.out.println("Box Detiles = "+length+"'"+width+"'"+height);
	}
}

class BoxWeight extends Box{

	protected double weight;

	BoxWeight(String name, double l, double w, double h, double we){
		super(name,l,w,h);
		weight = we;
	}
	public void weight_of_box(){
		System.out.println("Weight of the Box = "+ weight);
	}

}

class BoxShipment extends Box{
	protected double shipmentcost;

	BoxShipment(String name, double l, double w, double h, double s){
		super(name,l,w,h);
		shipmentcost = s;
	}
}

class BoxProblem{
	public static void main(String args[]){
		BoxShipment b =new BoxShipment("K&C",12,23,10,100);
		b.volume_of_box();
	}
}
