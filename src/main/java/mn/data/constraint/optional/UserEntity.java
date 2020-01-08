package mn.data.constraint.optional;

import javax.annotation.Nonnull;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USER")
public class UserEntity {

    @Id
    @NotNull
    @Nonnull
    private String id;

    @Nonnull
    @NotBlank
    private String name;

    public UserEntity(@Nonnull @NotNull String id,
                      @Nonnull @NotBlank String name) {
        this.id = id;
        this.name = name;
    }

    @Nonnull
    public String getId() {
        return id;
    }

    public void setId(@Nonnull String id) {
        this.id = id;
    }

    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull String name) {
        this.name = name;
    }
}
