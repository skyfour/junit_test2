package com.sky.dao;

import com.sky.beans.AgentUserHistory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AgentUserHistoryDao extends ElasticsearchRepository<AgentUserHistory, Long> {

}
