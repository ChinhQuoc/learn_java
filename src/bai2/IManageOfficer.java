package bai2;

import java.util.List;

public interface IManageOfficer {
	void addOfficer(Officer officer);
	List<Officer> findByFullname(String keyword);
	void showListOfficer();
	void exit();
}
