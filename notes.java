inheritance:
types of inheritance:
single inheritance
multilevel inheritance
heirarchical inheritance
multiple inheritance
hybrid inheritance

polymorphism
abstraction
encapsulation
class:it is a logical entity contains logic
of the application.
object:it is a physical entity.
it contains logics of the class 


==================================
class A 
{
	void m1(){	}
	void m2(){	}
}
class B
{
	void m1(){	}
	void m2(){	}
	void m3(){	}
    void m4(){	}

}
class C
{
	void m1(){	}
	void m2(){	}
	void m3(){	}
    void m4(){	}
	void m5(){	}
    void m6(){	}
}
In java every class has parent class.
every class is a child class 
for the class object.
there is no parent class for the class object

inheritance definition:
the properties acquiring 
from father to child.(or)
acquiring properties and behaviour to 
other classes is inheritance.

single:
class B extends A
{
}
multilevel:
class B extends A
{
}
class C extends B
{
}
heirarchical:
class B extends A
{
}
class C extends A
{
}
class D extends A
{
}
multiple:
class C extends A,B
{
}
java does not supports multiple inheritance
because of ambiguity.
hybrid:
hybrid=multiple+heirarchical
java does not supports hybrid inheritance.

restricting the inheritance future:
class A
{
}
final class B extends A
{
}
class C extends B 
{
}
using the keyword final 
we can restrict the inheritance.
================================
parent class:
{
	1.parent variables
		2.parent methods
		3.parent constructors
		4.parent instance blocks
		5.parent static blocks
}

child class:
{
	1.child variables
		2.child methods
		3.child constructors
		4.child instance blocks
		5.child static blocks
}


class A 
{
	int a=10;
	int b=20;
}
class B extends A
{
	int a=100;
	int b=200;
void sum(int a,int b)
	{
	System.out.println(a+b);
System.out.println(this.a+this.b);
System.out.println(super.a+super.b);
}
public static void main(String[] args)
	{
	new B().sum(1000,2000);
	}

}



