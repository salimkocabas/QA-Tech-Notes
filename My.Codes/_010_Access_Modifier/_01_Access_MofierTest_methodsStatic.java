package _010_Access_Modifier;

public class _01_Access_MofierTest_methodsStatic {

	
	/*
	 * 	default, public, private, protected
	 * 
	 *  1: default   : if you don't mention anything it is default
	 *  2: public    : method with public access modifier can accessible outside of package
	 *  3: private   : cannot accessible outside off class
	 *  4: protected : cannot accessible outside off package
	 * 
	 *  if you want to call this method without creating object instance like <ClassName new=ClassName()> you have to add static keyword
	 * 
	 */
	
	
	void  mthDefault() {
		System.out.println("<> default access modifier");}

	public static void  mthPublic() {
		System.out.println("<public >access modifier");}
	
	private static void  mthPrivate() {
		System.out.println("<private> access modifier");}
	
	public static void mthIndirectAccessToPrivateMethod() {
		System.out.print("Indirectly access to a private method ->");
		mthPrivate();}

	protected static void mthProtected() {
		System.out.print("<protected> access to a private method ->");
		
	}
	
}
