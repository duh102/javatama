package org.duh102.javatama.data;

public class Util
{
  public static boolean within(byte low, byte val, byte high)
  {
    return low <= val && val <= high;
  }
}