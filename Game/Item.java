package Game;

//Abstract ParentClass
public abstract class Item {
  protected Angle position;
  protected double radius;

  public abstract void interact(Robot robot);
}
