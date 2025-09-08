package be.intec.library.repository;

import be.intec.library.domain.Member;
import java.util.Optional;

public interface MemberRepository extends CrudRepository<Member, String> {
    Optional<Member> findByMembershipNumber(String membershipNumber);
}
