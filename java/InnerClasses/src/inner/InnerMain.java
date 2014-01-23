package inner;

//import inner.MemberExample.Member;
//import inner.NestedExample.Nested;

public class InnerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NestedExample.Nested nested1 = new NestedExample.Nested();
		nested1.doSomething();
		
		MemberExample m = new MemberExample();
		MemberExample.Member mm = m.new Member(); // !!!!!!
		mm.doSomething();
		
		LocalExample l = new LocalExample();
		l.doSomething();
		
		AnonymousExample ae = new AnonymousExample();
		ae.doSomething();

	}

}
