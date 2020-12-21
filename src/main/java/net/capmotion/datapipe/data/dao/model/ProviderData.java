package net.capmotion.datapipe.data.dao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.capmotion.datapipe.model.Provider;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProviderData implements Provider {

  private String id;

  private String companyId;

  private String name;

  private String status;
}
