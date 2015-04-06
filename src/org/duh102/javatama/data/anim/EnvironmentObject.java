package org.duh102.javatama.data.anim;

public abstract class EnvironmentObject
{
  public byte x, y;
  
  public EnvironmentObject(byte newX, byte newY)
  {
    x = newX;
    y = newY;
  }
}