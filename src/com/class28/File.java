package com.class28;

public abstract class File {

	public static void main (String [] args) {
		JavaFile obj= new JavaFile();
		obj.open();
		obj.edit();
		obj.close();
		
	}
	
	public abstract void open();
	
	public void edit() {
		System.out.println("You can edit tasks");
	}
	public void close() {
		System .out.println("you can close tasks any time");
	}
} 
class JavaFile extends File{

	@Override
	public void open() {
	System.out.println("in order to open java file we need notepad++");
	}	
	
	}
class WordFile extends File{ 
	

	@Override
	public void open() {
		System.out.println("in order to open.doc file you need Microsoft word");
		
	}
}

class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("in order to open PDF file you need acrobat");
		
	}
	
}






