package com.google.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class TotalUserCountListener implements HttpSessionListener {

	public static int totalUsers = 0;

	public void sessionCreated(HttpSessionEvent arg0) {
		// new create session ++
		totalUsers++;
		System.out.println("In: " + totalUsers);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		// session destroyed --
		totalUsers--;
		System.out.println("Out: " + totalUsers);

	}
}
