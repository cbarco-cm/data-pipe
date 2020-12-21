package net.capmotion.datapipe.data.repository.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.capmotion.datapipe.model.Provider;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "providers")
public class ProviderJpa implements Provider {

  @Id
  private String id;

  private String companyId;

  private String name;

  private String status;
}
