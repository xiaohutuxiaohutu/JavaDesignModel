package VisitorPattern_18.init;

import lombok.*;

@Data
@ToString()
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
public class CommonEmployee extends Employee {
    private String job;

    @Override
    protected String getOtherInfo() {
        return "task:" + this.job + "\t";
    }
}
