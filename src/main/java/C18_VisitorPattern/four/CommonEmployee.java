package C18_VisitorPattern.four;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommonEmployee extends Employee {
    private String job;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
