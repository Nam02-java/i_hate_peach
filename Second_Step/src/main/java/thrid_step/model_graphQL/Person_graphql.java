package thrid_step.model_graphQL;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table
@Entity
public class Person_graphql {

    @Id
    private String httplocalhost8019getFirstName;
    private String httplocalhost8019getLastName;
    private String httplocalhost8019getAddress;
    private String httplocalhost8019getMark;
}
