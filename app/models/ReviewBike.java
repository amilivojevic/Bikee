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
 * REVIEW_BIKE
 -review_bike_id
 -note: 1..5
 -comment: string
 -customer: USER
 -bike: BIKE
 */
@Entity
public class ReviewBike  extends Model {

    @Id
    public long id;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public int note;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public String comment;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public User customer;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public Bike bike;
}
