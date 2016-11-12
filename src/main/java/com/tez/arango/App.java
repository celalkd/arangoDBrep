package com.tez.arango;

import org.apache.log4j.BasicConfigurator;

import com.arangodb.ArangoDB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
    	ArangoDB arangoDB = new ArangoDB.Builder().build();
    	System.out.println("RUN");
    	arangoDB.getVersion();
    }
}
