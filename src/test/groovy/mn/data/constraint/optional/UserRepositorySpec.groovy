package mn.data.constraint.optional

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class UserRepositorySpec extends Specification {

    @Inject
    UserRepository userRepository

    void 'try to find a user by name that does not exist'() {
        when:
        Optional<UserEntity> optUser = userRepository.findByName('Iván')

        then:
        optUser.isEmpty()
    }
}
