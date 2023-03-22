package backend.jpa.repo;

import backend.jpa.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
  @PersistenceContext
  private EntityManager entityManager;

  public Long save(Member member) {
    entityManager.persist(member);
    return member.getId();
  }

  public Member findOne(Long id) {
    return entityManager.find(Member.class, id);
  }
}
