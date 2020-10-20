class Tree {
  private String  treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree () {
		treeName = "";
		treeType = "";
		leavesFall = false;
    leafColor= ""; 

	}

 Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aTreeColor) {
		treeName = aTreeName;
		treeType = aTreeType;
		leavesFall= aLeavesFall;
    leafColor=aTreeColor;
	}
String getTreeName() {
		return treeName;}

 String getTreeType() {
		return treeType;}

    boolean getLeavesFall() {
		return leavesFall;}

    String getLeafColor() {
		return leafColor;}

    void setTreeName(String theTreeName) {
		treeName = theTreeName;
	}

  void setTreeType (String theTreeType) {
		treeType = theTreeType;
	}

  void setLeafColor(String theLeafColor) {
		leafColor = theLeafColor;
	}

  void setLeavesFall(String theLeavesFall) {
		leavesFall = theLeavesFall;
	}
void print() {
		System.out.println();
		System.out.println("This is a" + treeName + "tree. It is a" +treeType + "and its leaves are currently" +leafColor +". It" + leavesFall +"not lose its leaves for the winter." );

		
	}









  }

