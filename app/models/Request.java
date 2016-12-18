package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.EnumValue;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Korisnik on 12/14/2016.
 *
 *
 REQUEST
 -request_id
 -bike_id
 -user_id
 -from_rentint_date: DATE
 -to_renting_date: DATE
 -request_status: {waiting, accepted, canceled}
 */

@Entity
public class Request  extends Model {

    public enum Status {
        @EnumValue("1")
        WAITING(1),
        @EnumValue("2")
        ACCEPTED(2),
        @EnumValue("3")
        CANCELED(3);

        private int value;
        Status(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }


    @Id
    public long id;

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
    public Status status;
}
