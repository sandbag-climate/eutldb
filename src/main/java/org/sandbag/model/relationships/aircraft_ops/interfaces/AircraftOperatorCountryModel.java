package org.sandbag.model.relationships.aircraft_ops.interfaces;

import org.neo4j.graphdb.RelationshipType;

/**
 * Created by root on 18/03/16.
 */
public interface AircraftOperatorCountryModel extends RelationshipType {

    String LABEL = "AIRCRAFT_OPERATOR_COUNTRY";
}
