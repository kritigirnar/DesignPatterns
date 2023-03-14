Public class singletonclass
{
Private static singletonclass singletonInstance=new singletonclass();// early loading
Private static singletonclass singletonInstance=null;// late loading 
Private singletonclass ()
{
}
Public void getInstance() 
{// return singletonInstance—> early loading
If ( singletonInstance==null)—> late loading 
return new singleton();
Else
Return singletonInstance;
}
