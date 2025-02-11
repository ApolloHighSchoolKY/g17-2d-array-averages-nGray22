import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    for(int row=0; row<ray.length; row++)
    {
      int count = 0;
     for(int col = 0;col<ray[row].length; col++)
     {
      count += ray[row][col]; 

     }
     count= count/ray.length;
    }  
  }

  public void columnAverages(){
    //column major order, take each column 
    //and go through all the rows top down 
    //and left to right
    //2 changes, column on outside row on inside
    //row needs to change to 0
    for (int i=0; i <= ray.length; i++)
    for(int col=0; col<ray[i].length; col++)
    {
      int count = 0;
     for(int row = 0;col<ray.length; row++)
     {
    
      count += ray[row][col]; 
     
     }
     count=count/ray[0].length;
    }
  }

  public void arrayAverage(){
    int count = 0;
    int tot = ray.length + ray[0].length;
    for(int[] row: ray)
    { 
      for(int col: row)
      {
      count += col;
      }
    }
    count = count/tot;
    
  }


  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return ""; 
  
  }
}
