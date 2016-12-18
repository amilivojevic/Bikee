package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Korisnik on 12/13/2016.
 *
 * CITY
 -city_id
 -name: string
 -zip_code: string
 -contry: COUNTRY
 */
@Entity
public class City  extends Model {
    @Id
    public Long id;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(unique = true)
    public String name;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(unique = true)
    public String zip_code;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public Country country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
