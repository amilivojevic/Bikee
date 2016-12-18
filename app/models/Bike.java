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
 * BIKE
 -bike_id
 -model_name: string
 -description: string
 -handlebar_size: integer
 -wheel_size: integer
 */

@Entity
public class Bike  extends Model {

    @Id
    public long id;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public String model_name;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public String description;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public int handlebar_size;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public int wheel_size;
}
