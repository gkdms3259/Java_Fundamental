package java_20190801;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class FileDemo {
	public void mkdirs(String path) {
		File f1  = new File(path); //test폴더를 File객체로 만든다.
		boolean isExisted = f1.isDirectory();
		if(!isExisted) {
			f1.mkdirs();  //Directory 를 만들어주면 true, or false
	}
	}
	public String getComma(long name) {
		return String.format("%,d",name);
	}
	public String getComma(double name, int precision) {
		return String.format("%,."+precision+"f",name);
	}
	public void changeFile(String path) {
		//path => c:\dev\test\jdk.exe => c:\dev\test\123123123.exe
	    File f1 =new File(path);
	    //f1.getPath() => 전체경로 + 파일이름 반환
	    String fileName = f1.getName(); //전체 경로중에 파일이름만 반환
	    String name = fileName.substring(0,fileName.lastIndexOf("."));
	    String extension = fileName.substring(fileName.lastIndexOf("."))+1;
	    name = String.valueOf(System.currentTimeMillis());
	    fileName = name+"."+extension;   //이름에 .와 확장자 붙여줌
	    //f1의 디렉토리를 반환 => c:\dev\test
	    String parent = f1.getParent();
		File f2 = new File(parent,fileName);
		f1.renameTo(f2);
	}
	
	public static void main(String[] args) {
		
		FileDemo f1 = new FileDemo();
		f1.mkdirs("c:\\dev\\test\\2019\\01");
		
		File f2 = new File("c:\\dev\\test","jdk-11.0.3_windows-x64_bin.exe"); //=("c:\\dev\\test\\jdk-11.0.3_windows-x64_bin.exe")
		long fileSize = f2.length()/1024;
		System.out.println(f1.getComma(fileSize)+"KB");
		boolean isFile = f2.isFile();
		if(isFile) {
			String path = f2.getPath(); //f2의 전체경로를 반환한다.
			if(path.endsWith("pdf")) {
				System.out.println("PDF 파일");
			}else if(path.endsWith("exe")) {
				System.out.println("응용프로그램");
			}else if(path.endsWith("txt")) {
				System.out.println("텍스트문서");
			}
		}else {
			System.out.println("파일폴더");
		}
		
		File f3 = new File("c:\\dev\\test\\jdk.exe");
		f2.renameTo(f3); //f2파일을 f3파일 이름으로 변경
        
		//f1.changeFile("c:\\dev\\test\\jdk.exe");
		
		File f4 = new File("c:\\dev\\test\\jdk.exe");
		String fileName = f4.getName();
		String path = f4.getPath();
		String parent = f4.getParent();
		System.out.println(fileName);
		System.out.println(path);
		System.out.println(parent);
		System.out.println(f4.lastModified());
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(f4.lastModified());
		int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
	    int day = c.get(Calendar.DATE);
	    System.out.println(year+","+month+","+day);
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM월-dd일 a hh:mm:ss E요일");
	    String date = sdf.format(c.getTime());  //calendar를 객체로 바꿔주는게 c.getTime()
	    System.out.println(date);
	    
	    File f5 = new File("c:\\dev\\test");
	    String[] lists = f5.list();
	   
	    for(String list : lists) {
	    	File f6 =new File(f5,list); //File은 기존에 있는 파일명 사용해서 쓰는 방법도 있다.
	    	String name = f6.getName();
	    	if(f6.isDirectory()) {
	           System.out.println(name + "-디렉토리");	
	    }else {
            fileSize = f6.length()/1024;
            c.setTimeInMillis(f6.lastModified());
            String lastModified = sdf.format(c.getTime());
	    	System.out.println(name+ "\t" + fileSize + "K" + "\t" + lastModified);
	    }
	    
	    }
	}

}
