/**
 * mario.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.zookeeper.demo;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.zookeeper.ZooDefs.Perms;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;

/**
 * 
 * @author liming
 * @version $Id: Test.java, v 0.1 2015年8月5日 下午4:39:53 liming Exp $
 */
public class Test {

	public interface Ids{
		 /**
         * This Id represents anyone.
         */
        public final Id ANYONE_ID_UNSAFE = new Id("world", "anyone");

        /**
         * This Id is only usable to set ACLs. It will get substituted with the
         * Id's the client authenticated with.
         */
        public final Id AUTH_IDS = new Id("auth", "");

        /**
         * This is a completely open ACL .
         */
        public final ArrayList<ACL> OPEN_ACL_UNSAFE = new ArrayList<ACL>(
                Collections.singletonList(new ACL(Perms.ALL, ANYONE_ID_UNSAFE)));

        /**
         * This ACL gives the creators authentication id's all permissions.
         */
        public final ArrayList<ACL> CREATOR_ALL_ACL = new ArrayList<ACL>(
                Collections.singletonList(new ACL(Perms.ALL, AUTH_IDS)));

        /**
         * This ACL gives the world the ability to read.
         */
        public final ArrayList<ACL> READ_ACL_UNSAFE = new ArrayList<ACL>(
                Collections
                        .singletonList(new ACL(Perms.READ, ANYONE_ID_UNSAFE)));
	}
}
