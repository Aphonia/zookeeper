/**
 * mario.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.zookeeper.demo;


import org.apache.zookeeper.KeeperException;

/**
 * 
 * @author liming
 * @version $Id: ZookeeperTest.java, v 0.1 2015年8月5日 下午1:16:35 liming Exp $
 */
public class ZookeeperTest {
	// public static void main(String[] args) {
	// Runnable task1 = new Runnable() {
	// public void run() {
	// DistributedLock lock = null;
	// try {
	// lock = new DistributedLock("127.0.0.1:2188", "test1");
	// // lock = new DistributedLock("127.0.0.1:2182","test2");
	// lock.lock();
	// Thread.sleep(3000);
	// System.out.println("===Thread "
	// + Thread.currentThread().getId() + " running");
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	// if (lock != null)
	// lock.unlock();
	// }
	//
	// }
	//
	// };
	// new Thread(task1).start();
	// try {
	// Thread.sleep(1000);
	// } catch (InterruptedException e1) {
	// e1.printStackTrace();
	// }
	// ConcurrentTask[] tasks = new ConcurrentTask[10];
	// for (int i = 0; i < tasks.length; i++) {
	// ConcurrentTask task3 = new ConcurrentTask() {
	// public void run() {
	// DistributedLock lock = null;
	// try {
	// lock = new DistributedLock("192.168.199.107:2188", "test2");
	// lock.lock();
	// System.out.println("Thread "
	// + Thread.currentThread().getId() + " running");
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	// lock.unlock();
	// }
	//
	// }
	// };
	// tasks[i] = task3;
	// }
	// new ConcurrentTest(tasks);
	// }

	static int value = 5;

	public static void main(String[] args) {
		for (int i = 0 ;i<20;i++){
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						DistributedLock lock = new DistributedLock(
								"127.0.0.1:2188", value+"");
						lock.lock();
						if (value == 0) {
							System.out.println("===" + 0);
						} else {
							// value --;
							Thread.sleep(200); // 获得锁之后可以进行相应的处理
							System.out.println(value--);
						}
						lock.unlock();
						// System.err.println("=============================");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			t.start();
		}
	}
}
