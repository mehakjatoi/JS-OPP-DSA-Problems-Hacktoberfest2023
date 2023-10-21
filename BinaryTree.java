public class BinaryTree {
    Object root;
    int size=0;
    
    BinaryTree left,right;
    BinaryTree(Object root){
        this.root=root;
    
    }
    BinaryTree(Object root,BinaryTree left,BinaryTree right){
        this.root=root;
        this.left=left;
        this.right=right;
    }
    public Object getroot(){
        return root;
    }
    public Object getleft(){
        return left.root;
    }
    public Object getright(){
        return right.root;
    }
    public boolean Isleave() {
        boolean isleave=false;
        if(left==null && right==null)
            isleave=true;
        return isleave;
    }
    public String toString() {
      StringBuffer buf=new StringBuffer();
      if(left!=null){
        buf.append(left.toString()+",");
      //  size++;
      }  
      buf.append(root);
    //  size++;
      if(right!=null){
    buf.append(","+right.toString());
   // size++;  
    }  
      return buf+"";
    }
    public static int getsize(BinaryTree Root) {
      if(Root==null){
        return 0;
      }
      return(getsize(Root.left)+1+getsize(Root.right));
    }
  
   public static int  getHeight(BinaryTree root) {
    int leftH=0,rightH=0;

      if(root==null){
        return 0;
      }
      
  if(root.left!=null){
    leftH =1+ getHeight(root.left);
   
  }
    if(root.right!=null){
 rightH = 1+getHeight(root.right);
    
    }
    
 return leftH>rightH?leftH:rightH;
   
       
    } 
    
    public String preorder() {
        StringBuffer buf=new StringBuffer();
        buf.append(root);
        if(left!=null){
          buf.append(left.preorder());
        }  
        if(right!=null){
          buf.append(right.preorder());
        }  
        return buf+"";
      }
      
      public String postorder() {
        StringBuffer buf=new StringBuffer();
        if(left!=null){
          buf.append(left.postorder());
        }  
        if(right!=null){
          buf.append(right.postorder());
        }  
        buf.append(root);
        return buf+"";
      }
      public boolean Search(String S) {
     String str=this.toString();
     boolean b=str.contains(S);
return b;
      }
       
      public static boolean isFullBinaryTree(BinaryTree root) {
        //calheight put in formula 
        if (root == null) {
          return true;
      }
      
      if (root.left == null && root.right == null) {
          return true;
      }
      
      if (root.left != null && root.right != null) {
          return isFullBinaryTree(root.left) && isFullBinaryTree(root.right);
      }
      
      return false;
  }
 
      

    public static void main(String[] args) {
      
    BinaryTree C=new BinaryTree("C");
        BinaryTree D=new BinaryTree("D");
        BinaryTree B=new BinaryTree("B",C,D);
        BinaryTree F=new BinaryTree("F");
        BinaryTree G=new BinaryTree("G");
        BinaryTree E=new BinaryTree("E",F,G);
        BinaryTree A=new BinaryTree("A",null,C);
      //  BinaryTree H=new BinaryTree("H");
      BinaryTree Q=new BinaryTree("Q",null,A);

      BinaryTree M=new BinaryTree("M",null,Q);




        System.out.println(B.toString());
        System.out.println(B.preorder());
        System.out.println(B.postorder());
        System.out.println(getsize(A));
        System.out.println("Height "+getHeight(A));
        System.out.println(B.Search("a"));
        System.out.println(isFullBinaryTree(A));
        System.out.println(E.toString());
        System.out.println(M.toString());
        System.out.println("Height "+getHeight(M));

    
        
       
        
     
       
    }
}
