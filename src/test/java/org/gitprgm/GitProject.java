package org.gitprgm;

public class GitProject {
	
	private void abc() {
		System.out.println("abc");

	}	
	
	private void ijk() {
		System.out.println("ijk");

	}
	
	private void pqr() {
		System.out.println("pqr");
	}
	
	public static void main(String[]args) {
		GitProject g = new GitProject();
		g.abc();
		g.ijk();
		g.pqr();
}
}
