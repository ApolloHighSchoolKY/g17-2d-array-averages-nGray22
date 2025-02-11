public class Gee17{
  public static void main(String[] args){
    
    int[][] ray = new int[7][7];

    //populate the array with sequential numbers
    //1 2 3 4 5 6 7
    //8 9 10 11 12 13 14 
    //15 16 17 18 19 20 21...
    //for(int i =0; i<= ray.length; i++)
    for (int row=0; row<ray.length; row++)
    {   
      for (int column=0; column<ray[row].length; column++)
      { 
        ray[row][column]=column+row*ray.length+1;
        
      }
    }



    ArrayAverages twoDee = new ArrayAverages(ray);

    System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
