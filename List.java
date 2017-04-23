public class List
{
  int[] x = {1, 23, 5, 67, 6, 81, 9, 102, 30, 52, 8};
  public int[] bubbleSort(int[] x)
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
}