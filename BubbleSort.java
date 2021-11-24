import java.util.ArrayList;

public class BubbleSort {
	
public static int[] bubble(int[] in) {
	int[] out = in;
	
	
	for(int i=0;i<out.length-1;i++) {
		int current = out[i];
		int next = out[(i+1)];
		if(current>next) {
			out[i]=next;
			out[i+1]=current;
		}
	}
	
	return out;
	
}




}
