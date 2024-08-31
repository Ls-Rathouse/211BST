class Main
{
  public static void main(String[] args)
  {
    BinarySearchTree tree = new BinarySearchTree();
    int[] data = new int[]{34, 45, 23, 54, 66, 7, 4, 55, 98, 17, 8, 38, 29, 49, 59, 93, 83, 69, 77, 25, 18, 8, -66, -17, 81, 2, 53, 72, -77, -81, 10, -49, -34, 41, 2, 96, -23, -4, 49, 77, 51, -53, -88, -6, 6, 50, 91, 14, -81, -45, -54, -55, -29, -38, -20, 88, 45, 95, 52, 42, -49, 35, 54, -88, -52, 82};
    for(int i = 0; i < data.length; i++)
    {
      if(0 < data[i])
      {
        tree.add(data[i]);
      }
      else
      {
        tree.delete(data[i] * -1);
      }
    }
    tree.printOut();
  }
}