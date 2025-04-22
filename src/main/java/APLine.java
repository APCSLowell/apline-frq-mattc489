public class APLine
{
  private int a,b,c;

  public APLine(int ai, int bi, int ci){
    a=ai;
    b=bi;
    c=ci;
  }

  public double getSlope(){
    return -(double)a/b;
  }

  public boolean isOnLine(int x, int y){
    return a*x + b*y + c == 0;
  }
  
}
