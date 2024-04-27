class fun{
  <T> void genericDisplay(T element){
    System.out.println(element.getClass().getName()+ " = "+ element);
  }

}
class func{
  public static void main(String []args){
    fun obj= new fun();
    obj.genericDisplay(10);
    obj.genericDisplay("Mukesh");
    obj.genericDisplay('A');
    obj.genericDisplay(11);
  }

}