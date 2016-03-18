package org.sandbag.model.relationships;

import org.neo4j.graphdb.Relationship;
import org.sandbag.model.nodes.AircraftOperator;
import org.sandbag.model.nodes.Company;

/**
 * Created by root on 18/03/16.
 */
public class AircraftOperatorCompany implements AircraftOperatorCompanyModel {
    protected Relationship relationship;

    public AircraftOperatorCompany(Relationship relationship){
        this.relationship = relationship;
    }

    @Override
    public String name() {
        return LABEL;
    }

    @Override
    public AircraftOperator getAircraftOperator(){
        return new AircraftOperator(relationship.getStartNode());
    }

    @Override
    public Company getCompany(){
        return new Company(relationship.getEndNode());
    }
}
