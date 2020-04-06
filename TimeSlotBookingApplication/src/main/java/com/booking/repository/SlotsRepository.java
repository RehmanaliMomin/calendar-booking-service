package com.booking.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.model.*;

@Repository
public interface SlotsRepository extends JpaRepository<Slots, Long> {
    Optional<User> findBySlotId(Long userId);

    List<Slots> findByStartTimeAndEndTime(Date startTime, Date endTime);
}