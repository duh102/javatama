package org.duh102.javatama.data;

public class MonsterModel
{
  //for authenticity's sake, we use bytes whenever possible
  //visible stats
  private byte happiness, hunger, hygiene, health, age;
  
  //life stage for this monster
  private MonsterEvolutionTree lifeStage;
  
  //invisible stats
  private byte framesHunger, framesPoo, framesRest, rest;
  
  //returning stats
  public byte getHappiness()
  {
    return happiness;
  }
  public byte getHunger()
  {
    return hunger;
  }
  public byte getHygiene()
  {
    return hygiene;
  }
  public byte getHealth()
  {
    return health;
  }
  public byte getAge()
  {
    return age;
  }
}