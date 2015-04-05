package org.duh102.javatama.data;

public class EvolutionCriteria
{
  public enum EvolutionCriteriaType {
    HAPPINESS,HUNGER,HYGIENE,HEALTH,REST,AGE;
  };
  
  private EvolutionCriteriaType myType;
  private byte lowValue, highValue;
  
  public EvolutionCriteria(EvolutionCriteriaType type, byte lowVal, byte highVal)
  {
    myType = type;
    lowValue = lowVal;
    highValue = highVal;
  }
  
  public boolean meetsCriteria(MonsterModel model)
  {
    switch(myType)
    {
      case HAPPINESS:
        return Util.within(lowValue, model.getHappiness(), highValue);
        break;
      case HUNGER:
        return Util.within(lowValue, model.getHunger(), highValue);
        break;
      case HYGIENE:
        return Util.within(lowValue, model.getHygiene(), highValue);
        break;
      case HEALTH:
        return Util.within(lowValue, model.getHealth(), highValue);
        break;
      case REST:
        return Util.within(lowValue, model.getRest(), highValue);
        break;
      case AGE:
        return Util.within(lowValue, model.getAge(), highValue);
        break;
    }
    return false;
  }
}