class Main {
  public static void main(String[] args) {
Tree tree1=  new Tree ();
Tree tree2=  new Tree ("maple", "broadleaf", true, "red");
tree1.print();
tree2.print(); 
tree2.settreeName ("spruce");
tree2.settreeType (" conifer");
tree2.print();

  }
  }
