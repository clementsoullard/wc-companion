package com.clement.eventtracker.service;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import com.clement.eventtracker.dto.MinutesPerChannel;
import com.clement.eventtracker.dto.graph.Data;
import com.clement.eventtracker.dto.graph.Wrapper;

@Repository
public class LogRepositoryImpl {

	static final Logger LOG = LoggerFactory.getLogger(LogRepositoryImpl.class);

	@Autowired
	MongoTemplate mongoTemplate;

	public Wrapper getMinutesPerChannel() {
		try {
			Wrapper jsChart = new Wrapper();
			Aggregation aggregation = newAggregation(match(Criteria.where("metricName").in("TV")),
					project("channelName", "minutes"), group("channelName").sum("minutes").as("totalMinutes"));
			LOG.debug("Construction de la requete effectuée");
			AggregationResults<MinutesPerChannel> minutesPerChannelAgg = mongoTemplate.aggregate(aggregation, "log",
					MinutesPerChannel.class);
			LOG.debug("Requete effectue");
			List<Data> datas = jsChart.getData();
			for (MinutesPerChannel minutesPerChannel : minutesPerChannelAgg) {
				if (minutesPerChannel.getChannelName() != null) {
					Data data = new Data();
					data.setLabel(minutesPerChannel.getChannelName());
					data.setValue(minutesPerChannel.getTotalMinutes());
					datas.add(data);
					LOG.debug(
							minutesPerChannel.getChannelName().toString() + " " + minutesPerChannel.getTotalMinutes());
				}
			}
			return jsChart;
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

}