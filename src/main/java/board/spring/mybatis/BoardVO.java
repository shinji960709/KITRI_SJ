package board.spring.mybatis;

public class BoardVO {
	
	int num;
	String title;
	String text;
	String id;
	String time;
	int textpw;
	int click;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTextpw() {
		return textpw;
	}
	public void setTextpw(int textpw) {
		this.textpw = textpw;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	
	
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", title=" + title + ", text=" + text + ", id=" + id + ", time=" + time
				+ ", textpw=" + textpw + ", click=" + click + "]";
	}

	


	
}
