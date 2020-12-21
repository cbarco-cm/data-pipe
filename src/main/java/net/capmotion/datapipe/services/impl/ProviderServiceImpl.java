package net.capmotion.datapipe.services.impl;

import io.vavr.collection.List;
import net.capmotion.datapipe.data.dao.ProviderDao;
import net.capmotion.datapipe.data.repository.ProviderRepository;
import net.capmotion.datapipe.model.Provider;
import net.capmotion.datapipe.services.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl implements ProviderService {

  private final ProviderRepository providerRepository;

  public ProviderServiceImpl(
      ProviderRepository providerRepository
  ) {
    this.providerRepository = providerRepository;
  }

  @Override
  public List<Provider> findAll() {
    return List.ofAll(providerRepository.findAll());
  }
}