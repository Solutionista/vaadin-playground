package online.sterz.data.service;

import java.util.UUID;
import online.sterz.data.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}