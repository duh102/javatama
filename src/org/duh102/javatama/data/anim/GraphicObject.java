package org.duh102.javatama.data.anim;

public class GraphicObject extends EnvironmentObject
{
  private Animation graphic;
  
  public EnvironmentObject(byte newX, byte newY, Animation newGraphic)
  {
    super(newX, newY);
    graphic = newGraphic;
  }
  
  public Animation getGraphic()
  {
    return graphic;
  }
}