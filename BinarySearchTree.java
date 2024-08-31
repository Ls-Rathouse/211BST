class BinarySearchTree
{
  Node baseRoot;
  String printString = "";

  class Node
  {
    int data;
    Node leftRoot;
    Node rightRoot;

    public Node(int num)
    {
      data = num;
      leftRoot = null;
      rightRoot = null;
    }
  }

  public BinarySearchTree()
  {
    baseRoot = null;
  }

  public void add(int num)
  {
    baseRoot = add(num, baseRoot);
  }

  public Node add(int num, Node currentRoot)
  {
    if(currentRoot == null)
    {
      return new Node(num);
    }
    if(num < currentRoot.data)
    {
      currentRoot.leftRoot = add(num, currentRoot.leftRoot);
    }
    else if(num > currentRoot.data)
    {
      currentRoot.rightRoot = add(num, currentRoot.rightRoot);
    }
    return currentRoot;
  }

  public void delete(int num)
  {
    baseRoot = delete(num, baseRoot);
  }

  public Node delete(int num, Node currentRoot)
  {
    if(currentRoot == null)
    {
      return currentRoot;
    }
    if(num < currentRoot.data)
    {
      currentRoot.leftRoot = delete(num, currentRoot.leftRoot);
    }
    else if(num > currentRoot.data)
    {
      currentRoot.rightRoot = delete(num, currentRoot.rightRoot);
    }
    else
    {
      if(currentRoot.leftRoot == null)
      {
        return currentRoot.rightRoot;
      }
      else if(currentRoot.rightRoot == null)
      {
        return currentRoot.leftRoot;
      }
      Node tempRoot = currentRoot.rightRoot;
      num = tempRoot.data;
      while(tempRoot.leftRoot != null)
      {
        num = tempRoot.leftRoot.data;
        tempRoot = tempRoot.leftRoot;
      }
      currentRoot.data = num;
      currentRoot.rightRoot = delete(currentRoot.data, currentRoot.rightRoot);
    }
    return currentRoot;
  }

  public void printOut()
  {
    printString = "";
    printOut(baseRoot);
    System.out.println(printString.substring(0, printString.length() - 2));
  }

  public void printOut(Node currentRoot)
  {
    if(currentRoot != null)
    {
      printOut(currentRoot.leftRoot);
      printString += currentRoot.data + ", ";
      printOut(currentRoot.rightRoot);
    }
  }
}