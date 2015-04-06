package org.duh102.javatama.data.anim;

public class MonsterObject implements MonsterGraphics extends EnvironmentObject
{
  private Animation[] idleAnims, playingAnims, eatingAnims, poopingAnims, healingAnims, sleepingAnims;
  
  public MonsterObject(byte x, byte y, Animation[] newIdleAnims, Animation[] newPlayingAnims,
                       Animation[] newEatingAnims, Animation[] newPoopingAnims,
                       Animation[] newHealing, Animation[] newSleepingAnims)
  {
    super(x, y);
    idleAnims = newIdleAnims;
    playingAnims = newPlayingAnims;
    eatingAnims = newEatingAnims;
    poopingAnims = newPoopingAnims;
    healingAnims = newHealingAnims;
    sleepingAnims = newSleepingAnims;
  }
  
  public Animation[] getIdleAnims()
  {
    return idleAnims;
  }
  
  public Animation[] getPlayingAnims()
  {
    return playingAnims;
  }
  
  public Animation[] getEatingAnims()
  {
    return eatingAnims;
  }
  
  public Animation[] getPoopingAnims()
  {
    return poopingAnims;
  }
  
  public Animation[] getHealingAnims()
  {
    return healingAnims;
  }
  
  public Animation[] getSleepingAnims()
  {
    return sleepingAnims;
  }
}