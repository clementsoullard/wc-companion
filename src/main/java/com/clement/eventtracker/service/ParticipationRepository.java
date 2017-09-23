
package com.clement.eventtracker.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.clement.eventtracker.dto.Participation;

@RepositoryRestResource(collectionResourceRel = "participation", path = "participation")
public interface ParticipationRepository extends MongoRepository<Participation, String> {

	List<Participation> getParticipationByEventId(ObjectId idEvent);

}
