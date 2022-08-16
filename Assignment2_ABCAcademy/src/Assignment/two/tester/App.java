package Assignment.two.tester;

import Assignment.two.model.Candidate;
import Assignment.two.service.CandidateService;

public class App {
	
	public static void main(String args[]) {
		
		Candidate candidate = new Candidate(107, "BEN", 78, 77, 79, 'P', "ECE", "12-MAR-2019");
		CandidateService service = new CandidateService();
		String response=service.addCandidate(candidate);
		System.out.println(response);
		
		String[] str=service.getGradesForAllCandidates();
		
		System.out.println("Candidate ID \t Result");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+"\t"+str[++i]);
		}
	}

}
