package com.infosys.eventtracker;

import java.io.IOException;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import com.infosys.eventtracker.service.BonPointDaoImpl;

@Configuration
@EnableScheduling
/**
 * This class credit some minutes for the TV.
 * 
 * @author Clément
 *
 */
@Repository
public class DayScheduler {

	static final Logger LOG = LoggerFactory.getLogger(DayScheduler.class);

	@Resource
	BonPointDaoImpl bonPointDaoImpl;

	@Resource
	FileService fileService;

	/**
	 * Every day the TV stops at midnight.
	 */
	@Scheduled(cron = "0 1 1 * * MON-FRI")
	public void closeTv() throws IOException {
		fileService.writeCountDown(-1);
	}




}
