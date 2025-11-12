package exam03;

import exam01.Button.onclickListener;

public class Butten {
onclickListener listener;
	
	public void setonclickListener(onclickListener listener)
	this.listener = lisetener;
	}
	public void Touch() {
		if(listener != null) {
			listener.onClick();
		}
	}
	public class onclickListener {
		void onclick();

	}


}