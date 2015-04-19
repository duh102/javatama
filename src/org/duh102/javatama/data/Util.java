package org.duh102.javatama.data;

public class Util
{
  public static boolean within(byte low, byte val, byte high)
  {
    return low <= val && val <= high;
  }
  
  public static boolean checkBit(byte toCheck, byte checkWhich)
  {
    return (toCheck & 0x01<<checkWhich) > 0;
  }
}