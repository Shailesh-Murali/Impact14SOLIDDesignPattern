package Assignment.two.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {
	
	@Id
	private int candidateId;
	
	@Column
	private String candidateName;
	@Column
	private int mark1;
	@Column
	private int mark2;
	@Column
	private int mark3;
	@Column
	private char result;
	@Column
	private String department;
	@Column
	private String examDate;
		
	public Candidate(int candidateId, String candidateName, int mark1, int mark2, int mark3, char result,
			String department, String examDate) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.result = result;
		this.department = department;
		this.examDate = examDate;
	}
	
	public Candidate() {
		
	}
	
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	public char getResult() {
		return result;
	}
	public void setResult(char result) {
		this.result = result;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	
	
	

}
