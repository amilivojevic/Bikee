package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by Korisnik on 12/13/2016.
 *
 * RENTING
 -renting_id
 -bike_id
 -user_id
 -from_date: DATE
 -to_date: DATE
 */

@Entity
public class Renting  extends Model {

    @Id
    public Long id;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public Bike bike;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public User user;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public Date from_date;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public Date to_date;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public User owner;
}
