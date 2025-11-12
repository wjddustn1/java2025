package exam01;

public class Button {
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
