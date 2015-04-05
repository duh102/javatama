package org.duh102.javatama.data;

public class MonsterEvolutionTree
{
  private List<EvolutionCriteria> criteriaForThisEvolution;//all the criteria that this evolution requires to happen
  private List<MonsterEvolutionTree> possibleEvolutions;//all the possible evolutions from this tree node
  private MonsterGraphics graphicsForThisMonster;//graphics object for this evolution step
  
  public List<EvolutionCriteria> getEvolutionCriteria()
  {
    return criteriaForThisEvolution;
  }
  
  public MonsterGraphics getGraphics()
  {
    return graphicsForThisMonster;
  }
  
  public MonsterEvolutionTree decideEvolution(MonsterModel model)
  {
    boolean criteriaPassed = false;
    for(MonsterEvolutionTree child : possibleEvolutions)
    {
      criteriaPassed = true;
      for(EvolutionCriteria crit : child.getEvolutionCriteria())
      {
        criteriaPassed &= crit.meetsCriteria(model);
      }
      if(criteriaPassed)
      {
        return child;
      }
    }
    return null;
  }
}