/*Create a class that captures students.
Each student has a first name, last name, class year, and major.
Create two examples of students.*/
class Address
{
int housenum;
String areaname;
String city;
//getter and setter for variables
 void setHousenum(int housenum)
{
this.housenum= housenum;
}
void setAreaname(String areaname)
{
this.areaname=areaname;
}
void setCity(String city)
{
this.city=city;
}
int getHousenum()
{
return housenum;
}
String getAreaname()
{
return areaname;
}
String getCity()
{
return city;
}
}
class Student 
{
int id;
String name;
Address ad;
void setId(int ad)
{
this.id=id;
}
 void setName(String name)
{
this.name=name;
}
 void setAd(Address ad)
{
this.ad=ad;
} 
int getId()
{
return id;
} 
String getName()
{
return name;
}
 Address getAd()
{
return ad;
}
}
class Demo
{
public static void main(String[] args)
{
Address ad=new Address();
ad.setHousenum(1);
ad.setAreaname("Aakashwani");
ad.setCity("aurangabad");
//create student class object
Student st=new Student();
int x=1;
st.setId(x);
st.setAd(ad);
st.setName("vaishali jahagidar");
//****************************************************************************
//read values
int id1;
id1=st.getId();
String n;
n=st.getName();
Address ad1;
ad1=st.getAd();
//read address object value 
int hn;
hn=ad1.getHousenum();
String area;
area=ad1.getAreaname();
String city=ad1.getCity();
System.out.println("student id"+id1);
System.out.println("student name=" +n);
System.out.println("student city=" +city);
System.out.println("area of student = " +area);
}
}