package com.spring.app.model;

import java.util.List;

public class RouteResponse {
	
	private String total_cost;
	private List<Route>routes;
	
	class Route{
		private String cab_id;
		private String team_member_ids;
		private String route;
		private String route_cost;
		
		public String getCab_id() {
			return cab_id;
		}
		public void setCab_id(String cab_id) {
			this.cab_id = cab_id;
		}
		public String getTeam_member_ids() {
			return team_member_ids;
		}
		public void setTeam_member_ids(String team_member_ids) {
			this.team_member_ids = team_member_ids;
		}
		public String getRoute() {
			return route;
		}
		public void setRoute(String route) {
			this.route = route;
		}
		public String getRoute_cost() {
			return route_cost;
		}
		public void setRoute_cost(String route_cost) {
			this.route_cost = route_cost;
		}
	}

	public String getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(String total_cost) {
		this.total_cost = total_cost;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

}
