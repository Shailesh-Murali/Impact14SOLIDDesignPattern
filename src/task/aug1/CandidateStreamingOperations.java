package task.aug1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

	public static void main(String[] args) {
	
		List<Candidate> candidates=InterviewRepository.getCandidateList();
		//list candidate names from Pune city
		System.out.println("List of Pune Candidates:");
		candidates.stream().filter(c->c.getCity().equalsIgnoreCase("Pune")).forEach(System.out::println);
		printLine();


		//list city and count of candidates per city
		System.out.println("Candidate count per city");
		Map<Object,Long> cityCountMap=candidates.stream().collect(Collectors.groupingBy(c->c.getCity(),Collectors.counting()));
		System.out.println(cityCountMap);
		printLine();

		//list technical expertise and count of candidates
		System.out.println("Candidate count by Technical Expertise");
		Map<Object,Long> techExpCountMap=candidates.stream().collect(Collectors.groupingBy(c->c.getTechnicalExpertise(),Collectors.counting()));
		System.out.println(techExpCountMap);
		printLine();
		
		//list fresher candidates
		System.out.println("Fresher Candidate list");
		candidates.stream().filter(c->c.getYearsOfExperience()==0).forEach(System.out::println);
		printLine();
		
		//listing candidates with highest experience
		System.out.println("Sorted List of Candidates by Experience");
		candidates.stream().sorted((c1,c2)-> c1.getYearsOfExperience()>c2.getYearsOfExperience()?1:-1).forEach(System.out::println);
		printLine();
		
		//sort the candidates by city name
		System.out.println("Sorted List of Candidates by City Name");
		candidates.stream().sorted((c1,c2)-> c1.getCity().compareTo(c2.getCity())).forEach(System.out::println);

	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}
}
