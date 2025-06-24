class demo{
  static void swappNo(int m,int n){
    int temp=0;
    temp=m;
    m=n;
    n=temp;
        System.out.println(m+" "+n);
  }
  public static void main(String args[]){
    swappNo(10,9);
  }
}
