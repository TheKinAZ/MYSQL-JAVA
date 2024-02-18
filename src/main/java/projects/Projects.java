package projects;

import java.util.Objects;
import java.util.Scanner;

import projects.dao.DbConnection;
import projects.exception.DbException;

public class Projects {

	public static void main(String[] args) {
		DbConnection.getConnection();
	}
}