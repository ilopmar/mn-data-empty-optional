package mn.data.constraint.optional;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.validation.Validated;

import javax.annotation.Nonnull;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Validated
@JdbcRepository(dialect = Dialect.H2)
public interface UserRepository extends CrudRepository<UserEntity, String> {

    @NotNull
    Optional<UserEntity> findByName(@NotBlank @Nonnull String name);
}
