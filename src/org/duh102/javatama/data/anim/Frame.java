package org.duh102.javatama.data.anim;

public class Frame
{
  public byte framesVisible;//framerate is set somewhere else, not sure where yet
  public byte[][] lcdLit;//boolean bit array, extend as necessary for 8,16,24,32,etc pixels on a side
  
  public Frame(byte time, byte[][] litLCDs)
  {
    framesVisible = time;
    lcdLit = litLCDs;
  }
}