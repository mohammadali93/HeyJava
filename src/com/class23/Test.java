package com.class23;

public class Test {

	public static void main(String [] args) {
		
		// we are just testing our code starting from Employee Class
		System.out.println("------Creating Employee object---");
		Employee emp= new Employee();
		System.out.println(Employee.department);
		Employee.work();
		// emp.work(); NOT A PREFERRED WAY
		emp.salary=90000;
		emp.getPaid();
	
		System.out.println("----Creating ScrumTeam object---");
		ScrumTeam st= new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
		st.ceremonies="Sprint grooming , Sprint Planning , Daily Standups , Sprint Demo , Sprint Retrospective";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("------Creating Developer Object-----");
		Developer dev= new Developer();
		Developer.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint grooming , Sprint Planning , Daily Standups , Sprint Demo , Sprint Retrospective";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("--------Creating Tester Object------");
		
		Tester qa= new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprint Backlog";
		qa.ceremonies="Sprint grooming , Sprint Planning , Daily Standups , Sprint Demo , Sprint Retrospective";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
		
		System.out.println("-----Creating Buisness Analyst Object-----");
		
		BuisnessAnalyst ba= new BuisnessAnalyst();
		ba.salary=80000;
		ba.getPaid();
		ba.artifacts="Sprint Backlog, Product Backlog";
		ba.ceremonies="Sprint grooming ,Sprint Planning , Daily Standups , Sprint Demo , Sprint Retrospective";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.userStories();
		
		System.out.println("-----Creating Scrum Master  Object----");
		ScrumMaster sm= new ScrumMaster();
		sm.salary=85000;
		sm.getPaid();
		sm.artifacts="BurnDown Chart";
		sm.ceremonies="Sprint grooming ,Sprint Planning , Daily Standups , Sprint Demo";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		System.out.println("------Creating Product Owner Object-----");
		ProductOwner po= new ProductOwner();
		po.salary=120000;
		po.getPaid();
		po.artifacts="Sprint Backlog, Product Backlog";
		po.ceremonies="Sprint grooming ,Sprint Planning , Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.talkTotheClients();
		po.prioritizeBacklog();
		
		System.out.println("--------Creating Front End Developer Object-----");
		FrontEnd fe= new FrontEnd();
		fe.doHtml();
		fe.code();
		
		
		System.out.println("------Creating Back End Developer Object-----");
		BackEnd be= new BackEnd();
		be.doSql();
		
		
		
		System.out.println("------Creating Manual Tester Object---");
		ManualTester mt= new ManualTester();
		mt.testManually();
		
		System.out.println("----Creating AutoMation Tester Object-----");
		AutoMation am= new AutoMation();
		am.codeInJava();
		
		
	}
}

