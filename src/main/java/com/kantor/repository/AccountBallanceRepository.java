package com.kantor.repository;

import com.kantor.domain.AccountBallance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface AccountBallanceRepository extends CrudRepository<AccountBallance,Long> {

    List<AccountBallance> findAccountBallanceByUserId(Long userId);

    void deleteByUserId(Long userId);
}
