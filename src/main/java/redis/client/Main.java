package redis.client;

import java.util.Scanner;

import sky.redis.exception.CountedNotExistsException;
import sky.redis.exception.CounterNotExistsException;
import sky.redis.exception.DistinctFilterNotExistsException;
import sky.redis.exception.FilterNotExistsException;
import sky.redis.exception.GroupFilterNotExistsException;
import sky.redis.exception.MainFilterNotExistsException;
import sky.redis.work.RedisWorker;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to use RedisQL.");
		Scanner scan = new Scanner(System.in);
		RedisWorker worker = new RedisWorker();
		Read reader = new Read();
		boolean running = true;
		StringBuffer sb = new StringBuffer();
		while (running) {
			String rql = scan.nextLine();
			sb.append(rql);
			if (rql.equals("exit"))
				break;
			if (rql.split(" ")[0].equals("read")) {
				if (rql.split(" ").length != 2)
					return;
				String filePath = rql.split(" ")[1];
				reader.setFileName(filePath);
				reader.read(worker);
			}
			if (rql.endsWith(";"))
				try {
					worker.work(sb.toString());
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
					sb = new StringBuffer();
				}
		}
		System.out.println("bye.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.exit(0);
	}

}
