package org.duh102.javatama.disp;

public class PixelGridEmulator
{
  //pixel grids are always 32x16 wxh as they were in gen 1
  //future versions may introduce different sizes
  private byte width, height;
  private byte[][] grid, lastGrid = null;
  
  private Image gridBuffer;
  private int bufferWidth,bufferHeight;
  private Graphics gridGraphics;
  
  
  private double pixelWidth=8, pixelHeight=8;//virtual pixel to real pixel size
  private double borderPadding = 1.5, interPixelPadding = 0.5;//padding in virtual pixels
  
  
  public PixelGridEmulator()
  {
    width = 0x20;
    height = 0x10;
    
    grid = new byte[width/0x08][height/0x08];
    
    //zeroing the field, just in case
    for(int x = 0; x < width/0x08; x++)
    {
      for(int y = 0; y < height/0x08; y++)
      {
        grid[x][y] = 0x00;
      }
    }
    
    bufferWidth=(width+(width-1)*interPixelPadding+2*borderPadding)*pixelWidth;
    bufferHeight=(height+(height-1)*interPixelPadding+2*borderPadding)*pixelHeight;
    
    gridBuffer = new BufferedImage(bufferWidth, bufferHeight, TYPE_INT_ARGB);
    gridGraphics = gridBuffer.getGraphics();
  }
  
  public void updateImage()
  {
    if(lastGrid == null)
    {
      gridGraphics.setComposite(AlphaComposite.Clear);
      gridGraphics.fillRect(0, 0, bufferWidth, bufferHeight);
      gridGraphics.setComposite(AlphaComposite.SrcOver);
      
    }
    
    
  }
}