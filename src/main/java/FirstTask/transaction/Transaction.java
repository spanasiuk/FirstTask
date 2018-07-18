package FirstTask.transaction;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Transaction {

    @Id
    private String username;
    private Double amount;
    private Long timestamp;

    public Transaction(){
        timestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "<b>Username:</b> " + username + "</br>" +
                "<b>Amount:</b> " + amount + "</br>" +
                "<b>Timestamp:</b> " + timestamp + "</br>";
    }
}
