package org.example.routes.repository;

import org.example.routes.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

    List<Route> findRoutesByStartAndEndAndTransportType(String start, String end, String transportType);

    //List<Route> findRoutesByStartEndTransportType(String start, String end, String transportType);
    //List<Route> findRoutesByStartAndEndAndOrderByTime(String start, String end, String transportType);

    //find all conecting routes
    //List<Route> findRoutesByStartOrEnd(String start, String end);
    List<Route> findRoutesByStart(String start);
    List<Route> findRoutesByEnd(String end);
    List<Route> findRoutesByTransportType(String transportType);
    Route findRouteById(long id);


}
