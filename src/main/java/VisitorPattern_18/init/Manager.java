package VisitorPattern_18.init;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Manager extends Employee {
    private String performance;

    @Override
    protected String getOtherInfo() {
        return "yeji:" + this.performance + "\t";
    }
}
