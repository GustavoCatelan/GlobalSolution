package br.com.fiap.GlobalSolution.domainmodel;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_USERS")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private @Getter @Setter Long id;

    @Column(name = "NM_USER")
    private @Getter @Setter String username;

    @Column(name = "EMAIL_USER")
    private @Getter @Setter String email;

    @Column(name = "PASS_USER")
    private @Getter @Setter String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users users)) return false;
        return id == users.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
