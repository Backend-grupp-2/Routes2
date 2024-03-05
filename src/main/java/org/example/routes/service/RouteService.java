package org.example.routes.service;

import org.example.routes.model.Route;
import org.example.routes.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public List<Route> getRoute(String start, String end, String transportType) {
        List<Route> routes = routeRepository.findRoutesByStartAndEndAndTransportType(start, end, transportType);
        return routes;
    }

    //public List<Route> getRoutesByTransportType(String transportType) {
    //}


    /*public List<Route> getRouteAll() {
        List<Route> routes = routeRepository.findAll();
        return routes;
    }*/
}
