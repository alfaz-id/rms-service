package id.alfaz.rms.model.projection.country;

import javax.persistence.Column;
import javax.persistence.Id;

public interface CountryView {
    String getCountryId();
    String getCountryCode();
    String getCountryName();
    String getActive();
}
