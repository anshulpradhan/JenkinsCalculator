package com.demo.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsTest {

	@Test
	public void test() {
		JenkinsDemo jenkins = new JenkinsDemo();
		
		assertEquals(10, jenkins.add(6, 4));
		assertEquals(2, jenkins.substract(6, 4));
		
	}

}
