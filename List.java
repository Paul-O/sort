public class List
{
  public static int[] bubbleSort(int[] x) // Sorts the array from smallest to largest
  {
    int i, j, temp = 0;
    for(i = 0; i < x.length - 1; i++)
    {
      for(j = 0; j < x.length - 1 - i; j++)
      {
        if(x[j] > x[j + 1])
        {
          temp = x[j];
          x[j] = x[j + 1];
          x[j + 1] = temp;
        }
      }
    }
    return x;
  }
  
  public static void main(String[] args) // main method
  {
    int[] x = {1, 23, 5, 67, 6, 81, 9, 102, 30, 52, 8}; // array to be sorted
    System.out.println("Unsorted List:");
    for(int y = 0; y < x.length; y++) // prints unsorted array
    {
      System.out.println(x[y]);
    }
    System.out.println("\nSorted List:");
    x = bubbleSort(x);
    for(int z = 0; z < x.length; z++) // prints sorted array
    {
      System.out.println(x[z]);
    }
  }
}