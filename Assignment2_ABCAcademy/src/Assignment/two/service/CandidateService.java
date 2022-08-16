package Assignment.two.service;

import java.util.List;

import Assignment.two.dao.CandidateDAO;
import Assignment.two.model.Candidate;
import Assignment.two.model.CandidateReport;

public class CandidateService {
	
	private static CandidateDAO candidateDAO = new CandidateDAO();
	
	public String addCandidate(Candidate candidate)
	{
		String output="";
		if((candidate.getMark1()<50 || candidate.getMark2()<50 || candidate.getMark3()<50) && 'P'==candidate.getResult() )
		{
			output="Result should be 'F' (Fail) if student scores less than 50 in any one subject";
		}
		else {
			output=candidateDAO.addCandidate(candidate);
		}
		return  output;
	}
	
	public String calculateGrade(CandidateReport candidateReport)
	{
		String grade="";
		if('F'==(candidateReport.getResult()))
		{
			grade="NA";
		}
		else {
			double avgMarks = (candidateReport.getMark1()+ candidateReport.getMark2()+ candidateReport.getMark3())/3;
			if(avgMarks>=85)
			{
				grade="A";
			}
			else if (avgMarks>=75 && avgMarks<85)
			{
				grade="B";
			}
			else if (avgMarks<75) {
				grade="C";
			}
		}
		return grade;
	}
	
	public String[] getGradesForAllCandidates() {
		String[] str =null;
		
		List<Candidate> candidateList=candidateDAO.loadCandidates();
		str = new String[candidateList.size()*2];
		int i=0;
		CandidateService service = new CandidateService();
		for(Candidate c : candidateList)
		{
			str[i]=c.getCandidateId()+"";
			str[++i]=service.calculateGrade( new CandidateReport(c));
			i++;
		}
		return str;
	}

}
