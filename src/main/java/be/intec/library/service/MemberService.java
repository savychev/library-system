package be.intec.library.service;

import be.intec.library.domain.Member;
import java.util.Optional;

public interface MemberService {
    Member add(Member member);                                            // добавить участника
    Optional<Member> edit(String membershipNumber, Member updated);       // обновить данные
    boolean delete(String membershipNumber);                              // удалить
    Optional<Member> findByMembershipNumber(String membershipNumber);     // найти по номеру
}
