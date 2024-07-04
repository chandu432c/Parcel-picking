package com.BY.DashBoradMS.DashboardRepo;

import com.BY.DashBoradMS.Entity.DashBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashBoardrepo extends JpaRepository<DashBoard,Long> {

    DashBoard findByParcelId(int parcelId);
}
