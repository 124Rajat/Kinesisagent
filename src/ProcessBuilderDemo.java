import java.lang.*;
import java.io.*;
import java.util.*;

class ProcessBuilderDemo 
{
	public static void main(String[] arg) throws Exception {
		
		List<String> command=null;
		
		pythonScript(command);      //Installing python packages and running python script
	
		LogConverter.logReader();  	//Calling LogConverter class for conversion
	}
	private static void pythonScript(List<String> command) throws IOException {
		ProcessBuilder pb;
		Process process;
		 BufferedReader reader;
	     BufferedWriter writer;
	         
	     try {
	          FileReader read=new FileReader("path.properties");  
	          Properties p=new Properties();  
	          p.load(read);
	     }
	     catch(Exception e) {}
		//Command for install python packages from requirements file

		command = new ArrayList<String>();
		command.add("python");
		command.add("-m");
		command.add("pip");
		command.add("install");
		command.add("-r");
		command.add("requirements.txt");
		pb = new ProcessBuilder(command);
		process = pb.start();  // starting the process
		System.out.println("hello");
		
		//command to run python script (apache-fake-log-gen.py) in terminal
	
		command = new ArrayList<String>();
		command.add("python");											
		command.add("apache-fake-log-gen(1).py");
	    command.add("-n");
		command.add("100");
		command.add("-o");
		command.add("log");
		pb = new ProcessBuilder(command);
		process = pb.start();  // starting the process
	
		   // starting the process
	}
}
