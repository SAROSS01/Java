`package UI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDomoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		try {// define a folder on the hard drive
			String dirString = "c:/temp";
			Path dirPath = Paths.get(dirString);
			if (Files.notExists(dirPath)) {
				Files.createDirectories(dirPath);
				System.out.println("Directory succussfully created.");
				
			}
			else {
				System.out.println("Directory already exists.");
			}
			// define file within the folder
			String fileString = "products.txt";
			Path filePath = Paths.get(dirString, fileString);
			if (Files.notExists(filePath)) {
				Files.createFile(filePath);
				System.out.println(fileString+" NOT created."  );
			}
			System.out.println("File Name: " + filePath.getFileName());
			System.out.println("Absolute Path: " + filePath.toAbsolutePath());
			System.out.println("Relative Path Is writable: " + Files.isWritable(filePath));
			System.out.println(filePath.toString());
			
			if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
				System.out.println("Directory: " + dirPath.toAbsolutePath());
				System.out.println("Files: ");
				DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
				for (Path p: dirStream) {
					if (Files.isRegularFile(p)) {
						System.out.println("   " + p.getFileName());
					}
				}
				
				
			}
			// write to file
			Path productsPath = Paths.get("products.txt");
			// not the same products.txt as the examples above
			File productsFile = productsPath.toFile();
			
			
			// open an output stream
			PrintWriter out = new PrintWriter(
					           new BufferedWriter(
					        	new FileWriter(productsFile)));
			//write data to the stream
			out.println("java\tMurach's Java Programming\t57.50");
			
			// close stream to avoid a recource leak
			out.close();
			
			BufferedReader in = new BufferedReader(
								new FileReader(productsFile));
			// read data from the stream and print to console
			String line = in.readLine();
			System.out.println(line);
			
			// Bonus instruction - map this line to a Product
			String[] fields = line.split("\t");
			String code = fields [0];
			String desc = fields[1];
			Double price = Double.parseDouble(fields[2]);
			
			
			
			// close the input stream and free system resources
			in.close();
		} catch (IOException e) {
			System.out.println("Bad directory path entered.");
			e.printStackTrace();
		}
		System.out.println("Bye");
		}
	
		
		
		
		

	}


