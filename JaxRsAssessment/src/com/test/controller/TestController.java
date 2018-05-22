package com.test.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.test.pojo.Test;
import com.test.services.TestServices;


@Path("/assess")
public class TestController {
	
	TestServices testServices=new TestServices();
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Test> getTests(){
		
		List<Test> tests=testServices.getTests();
		return tests;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Test getTestById(@PathParam("id") int id){
		Test t=testServices.getTestById(id);
		return t;
	}

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Test> addTests(Test test){
		List<Test> t=testServices.addTests(test);
		return t;
	}
	
	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Test> updateTests(Test test){
		List<Test> t=testServices.updateTests(test);
		return t;
	}
	
	@DELETE
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Test> deleteTests(@MatrixParam("id")int id){
		List<Test> t=testServices.deleteTests(id);
		return t;
	}
}
