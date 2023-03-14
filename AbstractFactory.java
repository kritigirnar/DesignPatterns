/*abstract factory pattern 
-It’s called factory of factories.
Steps : 
Create main class which calls factory of factory.
 -factory of factory /factory producer creates instance of the class.
-factory class create required instance.

Eg:
1)*/
public interface profession { 
Public void print();}
Public class teacher implements profession
{ public voidprint(){ syso(“teacher “);}
Public class  artist implements profession 
{ public voidprint(){ syso(“artist “);}
Class TraineeArtist implements profession 
{
Syso(“ Trainee artist “);
}

Class TraineeTeacher implements profession
{
Syso(“Trainree teacher”);
}

 Class professionalFactory extends abstractFactrory
{
public Profession getProfession(String profession)
{
If( profession.equals(“teacher”)
return new teacher();
}
If( profession.equals(“artist”)
return new artist();
}
