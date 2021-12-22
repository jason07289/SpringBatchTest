package com.jaehyuk.batch;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)

//test xml °æ·Î
@ContextConfiguration(locations = {"/com/jaehyuk/batch/hello_world_job.xml"})
public class HelloWorldJobTest {
	
	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;
	
	@Test
	public void testjob() throws Exception {
		System.out.println("testJob");
		final JobExecution jobExecution = jobLauncherTestUtils.launchJob();
		
		Assert.assertEquals(ExitStatus.COMPLETED.getExitCode(), jobExecution.getExitStatus().getExitCode());
	}
}
