package Task;

public class Son extends MomCook implements Brother,Sister{


   @Override
   public void dance() {
	// TODO Auto-generated method stub
	System.out.println("I learnt dancing from brother");
   }

   @Override
   public void sing() {
	// TODO Auto-generated method stub
	System.out.println("I learnt singing from sister");
   }

}
