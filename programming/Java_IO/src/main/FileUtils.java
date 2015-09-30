package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class FileUtils 
{
	public static boolean copyFromFile(String sourcePath, String destPath)
	{	
		try(FileInputStream in   = new FileInputStream(sourcePath);
			FileOutputStream out = new FileOutputStream(destPath))
		{
			byte[] aux = new byte[64];
			
			while(in.read(aux) != -1)
			{
				out.write(aux);
				Arrays.fill(aux, (byte)0);
			}
		}
		catch (Exception e)
		{
			return false;
		}
		
		return true;
	}
	
	public static boolean copyFromFileUsingReadersWriters(String sourcePath, String destPath)
	{
		try(BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
			BufferedWriter writer = new BufferedWriter(new FileWriter(destPath)))
		{
			String aux;
			while((aux = reader.readLine()) != null)
				writer.write(aux + System.lineSeparator());
		}
		catch (Exception e)
		{
			return false;
		}
		
		return true;
	}
}
