package net.capmotion.datapipe.data.repository;

import net.capmotion.datapipe.data.repository.model.ProviderJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<ProviderJpa, String> {

}
