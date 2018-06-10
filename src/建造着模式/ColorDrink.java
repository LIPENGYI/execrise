package 建造着模式;

public abstract class ColorDrink implements Item {

	
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();

}
