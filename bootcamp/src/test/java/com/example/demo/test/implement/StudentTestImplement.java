package com.example.demo.test.implement;




import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.BootcampApplicationTests;
//import com.example.demo.test.StudentTest;

public class StudentTestImplement extends BootcampApplicationTests {

	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
    
    @Test
	public void testStudent() throws Exception {
		mockMvc.perform(get("/student/get/1")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
			    .andExpect(jsonPath("$.idStudent").value(1))
			    .andExpect(jsonPath("$.firstName").value("Marcos"))
				.andExpect(jsonPath("$.middleName").value("Milan"))
				.andExpect(jsonPath("$.lastName").value("Jimenez"))
     			.andExpect(jsonPath("$.gender").value("Masculino"))
     			.andExpect(jsonPath("$.age").value(21))
				.andExpect(jsonPath("$.address").value("Av.Sucre 587"))
				.andExpect(jsonPath("$.dateOfBirth").value("1990-02-16"))
				.andExpect(jsonPath("$.grade").value("3ciclo")); 

	}
    
  
}
