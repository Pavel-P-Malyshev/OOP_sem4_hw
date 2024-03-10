public class Pair <T, U>
{
   T first;
   U second;

   Pair(T a, U b){
    this.first=a;
    this.second=b;
   }

   T getFirst(){
    return this.first;
   }

   U getSecond(){
    return this.second;
   }

   public void setFirst(T newFirst){
    this.first=newFirst;
   }

   public void setSecond(U newSecond){
    this.second=newSecond;
   }

   
    
}
