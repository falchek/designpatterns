package proxy.protective.hotornot;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}
	
	public void drive() {
		//I have to hack this example to build the person:
		PersonBean joe = new PersonBeanImpl();
			joe.setName("Joe");
			joe.setGender("Male");
			joe.setInterests("Favoritism and obliviousness");
			joe.setHotOrNotRating(10);
			
		PersonBean jack = new PersonBeanImpl(); 
			jack.setName("Jack");
			jack.setGender("Male");
			jack.setInterests("I don't know but it's definitely not management");
			jack.setHotOrNotRating(5);

		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + joe.getName());
		ownerProxy.setGender("Kind of a coward");
		
		//Joe tries to set his own rating.  
		System.out.println("Joe tries to set his own rating because he's corrupt.");
		try{
			ownerProxy.setHotOrNotRating(111);
		}catch(Exception e){
			System.out.println("Joe you can't set your own hot/nor rating, that's cheating.  ");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(jack);
		
		System.out.println("");
		System.out.println("Joe accesses Jack's records to do his job for him. ");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
		
		try {
			nonOwnerProxy.setName("Useless Man");
		} catch (Exception e) {
			System.out.println("You can't modify Jack's name no matter how accurate it may be.");
		}
		
		nonOwnerProxy.setHotOrNotRating(0);
		System.out.println("Rating set from nonowner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
		
		
	}
	
	public PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person)); //This cast might be a problem I guess.  I'm not sure.  
													//Update - I had written an InvocationHandler that I really just needed to import. 
	}
	
	public PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
		
	}
	
}
