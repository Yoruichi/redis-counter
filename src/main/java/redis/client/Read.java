package redis.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import sky.redis.exception.CountedNotExistsException;
import sky.redis.exception.CounterNotExistsException;
import sky.redis.exception.DistinctFilterNotExistsException;
import sky.redis.exception.FilterNotExistsException;
import sky.redis.exception.GroupFilterNotExistsException;
import sky.redis.exception.MainFilterNotExistsException;
import sky.redis.work.RedisWorker;

public class Read {

	private String fileName;
	
	public void read(RedisWorker worker) {
		if(!fileName.endsWith(".rql"))
			System.err.println("Not correct file");
		File file = new File(fileName);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			  String rql = null;
			  StringBuffer sb = new StringBuffer();
	            while ((rql = reader.readLine()) != null) {
	            	sb.append(rql.trim());
	            	if(rql.trim().endsWith(";")) {
	            		System.out.println(sb.toString());
	            		worker.work(sb.toString());
	            		sb = new StringBuffer();
	            	}
	            }
	            reader.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (FilterNotExistsException e) {
			System.err.println(e.getMessage());
		} catch (DistinctFilterNotExistsException e) {
			System.err.println(e.getMessage());
		} catch (CounterNotExistsException e) {
			System.err.println(e.getMessage());
		} catch (MainFilterNotExistsException e) {
			System.err.println(e.getMessage());
		} catch (CountedNotExistsException e) {
			System.err.println(e.getMessage());
		} catch (GroupFilterNotExistsException e) {
			System.err.println(e.getMessage());
		} finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
		
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
