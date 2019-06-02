package br.faj.users.gateway.mongodb;

import br.faj.users.gateway.mongodb.entity.AccessApplicationEntity;
import br.faj.users.gateway.mongodb.entity.UsersAccessEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AccessApplicationRepository extends MongoRepository<AccessApplicationEntity, String>{

    AccessApplicationEntity getByNameapplication(String nameApplication);
    AccessApplicationEntity findByType(String type);

}
