package com.buildtool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.buildtool.bean.ConnectorsBean;
import com.buildtool.script.BuildTool;
import com.buildtool.services.CloneGitRepository;

@Controller
public class BuildController {

	@Autowired
	private CloneGitRepository gitService;
	
	@GetMapping("/")
	public String homePage() {

		return "home";
	}

	@PostMapping("/buildProjects")
	public ResponseEntity<String> buildProjects(String connectorName, String productBasePath, @RequestBody List<ConnectorsBean> connectorsBean){

		try {

			String[] objDependentProjects = { "D:\\WorkSpace\\Eclipse\\TestJavaProject" };

			BuildTool objBuildTool = new BuildTool();

			final String baseUrl = 
					ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
			
			System.out.println(baseUrl);
			
			for (ConnectorsBean connectors : connectorsBean) {
				
				gitService.clone(connectors.getCon_git_url(), connectorName);
				
			}
			
//			objBuildTool.startExecution("D:\\WorkArea\\temp\\DG_MappingManager-erwinDGv11.0GA", objDependentProjects);

			return ResponseEntity.ok("Succeeded");

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
