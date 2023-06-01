package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageOfficer implements IManageOfficer {
	private List<Officer> list;

	public ManageOfficer() {
		list = new ArrayList<Officer>();
	}

	@Override
	public void addOfficer(Officer officer) {
		// TODO Auto-generated method stub
		officer.createOfficer();
		list.add(officer);
	}

	@Override
	public List<Officer> findByFullname(String keyword) {
		// TODO Auto-generated method stub
		List<Officer> officers = new ArrayList<Officer>();

		for (Officer officer : list) {
			if (officer.getFullName().contains(keyword)) {
				officers.add(officer);
			}
		}

		return officers;
	}

	@Override
	public void showListOfficer() {
		// TODO Auto-generated method stub
		int index = 0;

		if (list.isEmpty()) {
			System.out.println("Không có cán bộ nào");
		} else {
			System.out.println("\t| Họ tên\t| Tuổi\t| Giới tính| Địa chỉ");
			for (Officer officer : list) {
				index++;
				officer.output(index);
			}
		}

		System.out.println("-------------------------------------------------------");
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("Thoát!");
		System.exit(0);
	}

	public List<Officer> getList() {
		return list;
	}

	public void setList(List<Officer> list) {
		this.list = list;
	}
}
