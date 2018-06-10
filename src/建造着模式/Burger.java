package 建造着模式;

public abstract class Burger implements Item {

	

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
