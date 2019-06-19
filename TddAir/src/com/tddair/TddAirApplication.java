package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private MemberDao members = new MemberDao();;
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight lookupFlightByNumber(String flightNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public void registerMember(String username, String email) {
		members.addMember(username, email);
		
	}

	public Member lookupMemberByUserName(String username) {
		// TODO Auto-generated method stub
		return members.getMemberBy(username);
	}

	public void completeFlight(String username, String flight) {
		// TODO Auto-generated method stub
		
	}
}
