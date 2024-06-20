package thisSuper;

import org.testng.annotations.Test;

public class PS1 extends PS{
	@Test
	public void demo() {
	doThis(); // no need to create object because we have used EXTENDS
	PS2 ps2 = new PS2(3);
	System.out.println(ps2.increment());
	System.out.println(ps2.decrement());
	System.out.println(ps2.multi2());

}
}
