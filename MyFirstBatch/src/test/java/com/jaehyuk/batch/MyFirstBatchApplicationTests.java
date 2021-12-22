package com.jaehyuk.batch;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;

class MyFirstBatchApplicationTests {
	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;
	
	@Test
	void contextLoads() throws Exception {
		final JobExecution jobExecution = jobLauncherTestUtils.launchJob();
		
		Assert.assertEquals(ExitStatus.COMPLETED.getExitCode(), jobExecution.getExitStatus().getExitCode());
	}

}
