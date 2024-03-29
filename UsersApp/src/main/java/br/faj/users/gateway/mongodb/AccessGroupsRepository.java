package br.faj.users.gateway.mongodb;

import br.faj.users.gateway.mongodb.entity.AccessGroupsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Repository
@Transactional
public interface AccessGroupsRepository extends MongoRepository<AccessGroupsEntity, String>{

    AccessGroupsEntity findById (Integer id);
    AccessGroupsEntity findByDescription (String description);
}
