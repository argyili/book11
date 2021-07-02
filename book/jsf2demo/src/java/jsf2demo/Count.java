package jsf2demo;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Count {
  private int count;
  
  public void increase() {
    count++;
  }
  
  public int getCount() {
    return count;
  }
}