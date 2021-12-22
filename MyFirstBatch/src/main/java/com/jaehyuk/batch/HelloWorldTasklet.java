package com.jaehyuk.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 메시지 출력하는 test용 tasklet
*/
public class HelloWorldTasklet implements Tasklet{

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("작업시작!");
		System.out.println("작업중...");
		System.out.println("작업완료");
		
		// execute 에서 null을 반환하는것은 작업이 끝났다는 것을 의미한다.
		return null;
	}
}
