package com.buildtool.services;

import java.nio.file.Paths;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.springframework.stereotype.Service;

@Service
public class CloneGitRepository {

	public boolean clone(String getRepoUrl, String cloneDirectoryPath) {
		
		try {
			
			System.out.println("Cloning " + getRepoUrl + " into " + cloneDirectoryPath);
			
			Git.cloneRepository().setURI(getRepoUrl).setDirectory(Paths.get(cloneDirectoryPath).toFile()).call();
			
			return true;
		
		} catch (GitAPIException e) {
			System.out.println("Exception occurred while cloning repo");
			e.printStackTrace();
			return false;
		}
	}
}
