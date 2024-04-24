class BankAccount<T extends Number>
{
    public void display(T[] t1){
        for(T i:t1){
            System.out.println(i+" ");
        }
    }

public void displayChar(Character[] t1){
  for(Character i :t1){
    System.out.println(i + " ");
  }
}
}

public class Exa {
    public static void main(String[] args){
        BankAccount<Number>b1=new BankAccount<>();
        Integer[] m1={100,200,300};
        Double[] m2={20.45,12.34};
        Character[] m3={'a','b','c'};

        
        b1.display(m1);
        
        b1.display(m2);
        
        b1.displayChar(m3);
        }

    
}