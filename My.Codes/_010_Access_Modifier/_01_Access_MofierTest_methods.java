package _010_Access_Modifier;

public class _01_Access_MofierTest_methods {

	
	/*
	 * 	default, public, private, protected
	 * 
	 *  1: default   : if you don't mention anything it is default
	 *  2: public    : method with public access modifier can accessible outside of package
	 *  3: private   : cannot accessible outside off class
	 *  4: protected : cannot accessible outside off package
	 * 
	 * 
	 */
	
	
	void  mthDefault() {
		System.out.println("<> default access modifier");}

	public void  mthPublic() {
		System.out.println("<public >access modifier");}
	
	private void  mthPrivate() {
		System.out.println("<private> access modifier");}
	
	public void mthIndirectAccessToPrivateMethod() {
		System.out.print("Indirectly access to a private method ->");
		this.mthPrivate();}


	protected void mthProtected() {
		System.out.print("<protected> access to a private method ->");
		
	}
	
}
