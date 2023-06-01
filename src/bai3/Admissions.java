package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bai2.Officer;

public class Admissions {
	private List<Candidate> list;

	public Admissions() {
		list = new ArrayList<Candidate>();
	}

	public void addNewCandidate(Candidate candidate, Admissions admissions) {
		candidate.addNewCandidate(admissions);
		list.add(candidate);
	}

	public void output() {
		int index = 0;

		if (list.isEmpty()) {
			System.out.println("Không có thí sinh nào");
		} else {
			System.out.println("\t| Số báo danh| Họ tên\t\t| Mức ưu tiên| Khối thi| Địa chỉ");
			for (Candidate candidate : list) {
				index++;
				candidate.output(index);
			}
		}

		System.out.println("-------------------------------------------------------");
	}

	public List<Candidate> findByRegisTrationNumber(String keyword) {
		List<Candidate> candidates = new ArrayList<Candidate>();
		
		for (Candidate candidate : list) {
			if (candidate.getRegisTrationNumber().equals(keyword)) {
				candidates.add(candidate);
				break;
			}
		}

		return candidates;
	}
	
	public boolean existRegisTrationNumber(String keyword) {
		boolean isExist = false;

		for (Candidate candidate : list) {
			if (candidate.getRegisTrationNumber().equals(keyword)) {
				isExist = true;
				break;
			}
		}

		return isExist;
	}

	public void exit() {
		System.out.println("Thoát!");
		System.exit(0);
	}

	public List<Candidate> getList() {
		return list;
	}

	public void setList(List<Candidate> list) {
		this.list = list;
	}
}
