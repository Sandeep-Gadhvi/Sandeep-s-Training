import java.awt.*;
import javax.swing.*;

public class awt {
	public static void main(String[]args) {
		JFrame f=new JFrame("Notepad");
		f.setVisible(true);
		TextArea t=new TextArea();
		f.setSize(500,500);
		MenuBar mb=new MenuBar();
		f.setMenuBar(mb);
		f.add(t);
		//creating menus
		Menu m1=new Menu("File");
		Menu m2=new Menu("Edit");
		Menu m3=new Menu("Search");
		Menu m4=new Menu("Help");
		Menu m5=new Menu("View");
		
		//adding menus
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		
		//creating menuitems
		MenuItem mi1=new MenuItem("New");
		MenuItem mi2=new MenuItem("Open");
		MenuItem mi3=new MenuItem("Save");
		MenuItem mi4=new MenuItem("SaveAs");
		MenuItem mi5=new MenuItem("Exit");
		
		//adding menuitems to File
		m1.add(mi1);
		m1.addSeparator();
		m1.add(mi2);
		m1.addSeparator();
		m1.add(mi3);
		m1.addSeparator();
		m1.add(mi4);
		m1.addSeparator();
		m1.add(mi5);
		m1.addSeparator();
		
		
		
		
	}

}
