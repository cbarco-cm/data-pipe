package net.capmotion.datapipe.services;

import io.vavr.collection.List;
import net.capmotion.datapipe.model.Provider;

public interface ProviderService {

  List<Provider> findAll();
}
