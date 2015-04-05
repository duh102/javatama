package org.duh102.javatama.data;

public interface MonsterGraphics
{
  public Animation[] getIdleAnims();
  public Animation[] getPlayingAnims();
  public Animation[] getEatingAnims();
  public Animation[] getPoopingAnims();
  public Animation[] getHealingAnims();
  public Animation[] getSleepingAnims();
}