package 抽象工厂模式;

public class ShapeFactory extends AbstractFactory {


	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
