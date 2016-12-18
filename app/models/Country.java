package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Korisnik on 12/14/2016.
 *
 * COUNTRY
 -country_id
 -name: string
 -mark: string
 */
@Entity
public class Country  extends Model {

    @Id
    public Long id;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(unique = true)
    public String name;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(unique = true)
    public String mark;
}
