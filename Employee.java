class Employee
{
private String name;
private int id;
private int age;
private String wifename;

Employee()
{

}

Employee(String name,int id,int age,String wifename)
{
this.name=name;
this.id=id;
this.age=age;
this.wifename=wifename;
}

public String getname()
{
  return name;
}

public void setname(String name)
{
  this.name=name;
}

public int getid()
{
  return id;
}

public void setid(int id)
{
  this.id=id;
}

public int getage()
{
  return age;
}

public void setage(int age)
{
  this.age=age;
}

public String getwifename()
{
  return wifename;
}

public void setwifename(String wifename)
{
  this.wifename=wifename;
}

}