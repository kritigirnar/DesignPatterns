public interface profession { 
Public void print();}
Public class teacher implements profession
{ public voidprint(){ syso(“teacher “);}
Public class  artist implements profession 
{ public voidprint(){ syso(“artist “);}
// we want to hide from client how obj are created like @autowiredor new keywords
//We create one class for creating factory objects

Class professionalFactory
{
public Profession getProfession(String profession)
{
If( profession.equals(“teacher”)
return new teacher();
}
If( profession.equals(“artist”)
return new artist();
}
 
Class mainClass
{
Psvm()
{ 
professionalFactory pcf= new professionalFactory();
Profession prof=pcf.getProfession(“artist”);
prof.print();
}
