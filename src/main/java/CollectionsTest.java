import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args)
	{
		List<String> a =new ArrayList<String>();
		a.add("aa");
		a.add("bb");
		a.add("cc");

		final List b=a;
		b.add("dd");

		List<String> c=new ArrayList<String>();
		//error because b is final so we cant re reference it.
		//b=c;

		System.out.println(b);
	}

}
